package com.oracle.intelagr.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.oracle.intelagr.common.PageModel;
import com.oracle.intelagr.entity.Role;
import com.oracle.intelagr.entity.RoleFunction;
import com.oracle.intelagr.entity.User;
import com.oracle.intelagr.mapper.RoleFunctionMapper;
import com.oracle.intelagr.mapper.RoleMapper;
import com.oracle.intelagr.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RoleServiceImpl implements IRoleService{
    @Autowired
    private RoleMapper roleMapper;
    @Autowired
    private RoleFunctionMapper roleFunctionMapper;
    @Override
    public List<Role> selectAll() {
        return roleMapper.selectAll();
    }

    @Override
    public void queryForPage(PageModel pageModel) {
        Map map = (Map)pageModel.getData();
        PageHelper.startPage(pageModel.getPage(),pageModel.getPageSize());
        List<Role> list = roleMapper.select(map);
        PageInfo pageInfo = new PageInfo(list);
        pageModel.setResult(list);
        pageModel.setTotalCount((int)pageInfo.getTotal());
    }

    @Override
    public Role queryById(int id) {
        return roleMapper.selectById(id);
    }

    @Override
    public void delete(int[] ids) {
        for(int id:ids){
            Role role = new Role();
            role.setId(id);
            role.setDeleteFlag("Y");
            roleMapper.update(role);
        }
    }

    @Override
    public void update(Role role) {
        roleMapper.update(role);
    }

    @Override
    public void save(Role role) {
        roleMapper.insert(role);
    }

    @Override
    @Transactional
    public void saveRoleAuth(String roleCode, List<String> funIds, User user) {
        //将RoleFunctionMap表中roleCode的纪录全部删除
        roleFunctionMapper.deleteRoleCode(roleCode);
        //将funIds中的FunctionCode和RoleCode的关系存储在RoleFunctionMap表中
        for(String functionCode:funIds){
            RoleFunction roleFunction = new RoleFunction();
            roleFunction.setRoleCode(roleCode);
            roleFunction.setFunctionCode(functionCode);
            roleFunction.setCreateUserId(user.getUserID());
            roleFunction.setCreateDate(new Date());
            roleFunction.setUpdateUserId(user.getUserID());
            roleFunction.setUpdateDate(new Date());
            roleFunctionMapper.insert(roleFunction);
        }
    }

    @Override
    public List<RoleFunction> queryFunctionByRole(String roleCode) {
        Map map = new HashMap();
        map.put("roleCode",roleCode);
        List<RoleFunction> list = roleFunctionMapper.select(map);
        return list;
    }
}
