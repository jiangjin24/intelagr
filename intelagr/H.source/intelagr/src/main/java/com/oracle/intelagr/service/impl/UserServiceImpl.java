package com.oracle.intelagr.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.oracle.intelagr.common.MD5Util;
import com.oracle.intelagr.common.PageModel;
import com.oracle.intelagr.entity.Function;
import com.oracle.intelagr.entity.Role;
import com.oracle.intelagr.entity.User;
import com.oracle.intelagr.entity.UserRole;
import com.oracle.intelagr.mapper.UserMapper;
import com.oracle.intelagr.mapper.UserRoleMapper;
import com.oracle.intelagr.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserRoleMapper userRoleMapper;
    @Autowired
    private FunctionService functionService;
    @Override
    public List<User> login(User user) {
        Map map = new HashMap();
        map.put("userID",user.getUserID());
        //业务处理层对密码进行MD5加密  添加了加盐操作   盐就是用户名
        map.put("password", MD5Util.getMD5Code(user.getUserID()+user.getPassword()));
        return userMapper.select(map);
    }

    /**
     * 获得用户的权限数据
     * @param userID  登录成功的那个用户的用户名
     * @return List<Map> ：返回的是一个ArrayList对象，ArrayList中存储这个每个二级菜单的Map
     *                  每个二级菜单的Map中有两个key-value
     *                  分别是 key："parent"   value:"菜单对象"
     *                         key："child"    value: List<Function>
     */
    @Override
    public List<Map> getFunction(String userID) {
        List<Function> functionList = new ArrayList<Function>();
        if(userID==null){
            functionList = functionService.selectAll();
        }else {
            User user = userMapper.selectById(userID);
            for (Role role : user.getRoles()) {
                for (Function function : role.getFunctions()) {
                    functionList.add(function);
                    //System.out.println("父菜单："+function.getModuleName()+"-自己的Code："+function.getFunctionCode()+"-名字"+function.getFunctionName());
                }
            }
        }
        List<Map> resultList = new ArrayList<Map>();
        Map moduleMap = new HashMap();
        for(Function function:functionList){
            if(function.getModuleCode()!=null) {
                if (moduleMap.get(function.getModuleCode()) == null) {
                    List<Function> funList = new ArrayList<Function>();
                    funList.add(function);
                    moduleMap.put(function.getModuleCode(), funList);
                    Map m = new HashMap();
                    m.put("parent", function);
                    m.put("child", funList);
                    resultList.add(m);
                } else {
                    List<Function> funList = (List<Function>) moduleMap.get(function.getModuleCode());
                    funList.add(function);
                }
            }
        }
        return resultList;
    }

    /**
     * 查询条件包括：用户名、用户姓名、用户类型
     * @param pageModel 封装了分页查询需要用到的数据，包括pageNo,pageSize
     *                    封装了分页查询的结果数据，包查询的结果集合、总记录数
     */
    @Override
    public void queryForPage(PageModel pageModel) {
        Map map = (Map)pageModel.getData();
        PageHelper.startPage(pageModel.getPage(),pageModel.getPageSize());
        List<User> list = userMapper.select(map);
        PageInfo pageInfo = new PageInfo(list);
        pageModel.setResult(list);
        pageModel.setTotalCount((int)pageInfo.getTotal());
    }

    @Override
    @Transactional
    public void save(User user) {
        user.setPassword(MD5Util.getMD5Code(user.getUserID()+user.getPassword()));
        //保存用户表
        userMapper.insert(user);
        //保存用户角色关系表
        for(Role role :user.getRoles()){
            UserRole userRole = new UserRole();
            userRole.setRoleCode(role.getRoleCode());
            userRole.setUserID(user.getUserID());
            userRole.setCreateDate(user.getCreateDate());
            userRole.setCreateUserId(user.getCreateUserId());
            userRole.setUpdateDate(user.getUpdateDate());
            userRole.setUpdateUserId(user.getUpdateUserId());
            userRoleMapper.insert(userRole);
        }
    }

    @Override
    public User selectById(String userID) {
        return userMapper.selectById(userID);
    }

    @Override
    public void update(User user) {
        userMapper.update(user);
    }

    @Override
    public void delete(String userID) {
        //逻辑删除
        User user = new User();
        user.setUserID(userID);
        user.setDeleteFlag("Y");
        userMapper.update(user);
    }

    @Override
    public void resetPwd(String userID, String password) {

    }

    @Override
    public void startUse(String userID) {

    }

    @Override
    public void endUse(String userID) {

    }
}
