package com.oracle.intelagr.service.impl;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.oracle.intelagr.entity.AreaDevision;
import com.oracle.intelagr.mapper.AreaDevisionMapper;
import com.oracle.intelagr.service.AreaDevisionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
@Transactional
public class AreaDevisionServiceImpl implements AreaDevisionService
{
	private static final Logger log = LoggerFactory.getLogger(AreaDevisionServiceImpl.class);
	
	@Autowired
	protected AreaDevisionMapper areaDevisionMapper;
  
	//通过证件id查询农户信息
	public AreaDevision getAreaDevisionByName(String townName, String countryName){
		Map map = new HashMap();
		map.put("townName",townName);
		map.put("countryName",countryName);
		List<AreaDevision> list = areaDevisionMapper.select(map);
		if(list==null||list.size()==0) return null;
		return list.get(0);
	}
	
	public List<AreaDevision> queryCitys(){
		return areaDevisionMapper.queryCitys();
	}
	
	public List<AreaDevision> queryTownsByCityCode(String cityCode){
		Map map = new HashMap();
		map.put("cityCode",cityCode);
		return areaDevisionMapper.queryTownsByCityCode(map);
	}
	
	public List<AreaDevision> queryCountrysByCityAndTownCode(String cityCode, String townCode){
		Map map = new HashMap();
		map.put("cityCode",cityCode);
		map.put("townCode",townCode);
		return areaDevisionMapper.queryCountrysByCityAndTownCode(map);
	}

	@Override
	public AreaDevision getAreaDevision(String cityCode, String townCode, String countryCode) {
		Map map = new HashMap();
		map.put("cityCode",cityCode);
		map.put("townCode",townCode);
		map.put("countryCode",countryCode);
		List<AreaDevision> list = areaDevisionMapper.select(map);
		if(list==null||list.size()==0) return null;
		return list.get(0);
	}
	
	@Override
	public AreaDevision getAreaDevision(String cityCode, String townCode) {
		Map map = new HashMap();
		map.put("cityCode",cityCode);
		map.put("townCode",townCode);
		List<AreaDevision> list = areaDevisionMapper.select(map);
		if(list==null||list.size()==0) return null;
		return list.get(0);
	}
	
	@Override
	public String getAreaNameByCode( String codeKey,String code) {
		Map map = new HashMap();
		map.put("codeKey",codeKey);
		map.put("code",code);
		List<AreaDevision> list = areaDevisionMapper.getAreaNameByCode(map);
		if(list==null||list.size()==0) return null;
		AreaDevision areaDevision = list.get(0);
		try {
			Field field = areaDevision.getClass().getDeclaredField(codeKey+"Name");
			return String.valueOf(field.get(areaDevision));
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return "";
	}
	
	public String getCountryNameByCode( String codeKey,String code){
		if(code.indexOf(",")<0){
			return getAreaNameByCode(codeKey, code);
		}else if(code.trim().length()>1 && code.indexOf(",")>-1){
			String[] codes = code.split(",");
			Map map = new HashMap();
			map.put("townCode",codes[0].trim());
			map.put("countryCode",codes[1].trim());
			map.put("codeKey",codeKey);
			List<AreaDevision> list = areaDevisionMapper.getCountryNameByCode(map);
			if(list==null||list.size()==0) return null;
			AreaDevision areaDevision = list.get(0);
			try {
				Field field = areaDevision.getClass().getDeclaredField(codeKey+"Name");
				return String.valueOf(field.get(areaDevision));
			} catch (NoSuchFieldException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
			return "";
		}
		return "";
	}
}
