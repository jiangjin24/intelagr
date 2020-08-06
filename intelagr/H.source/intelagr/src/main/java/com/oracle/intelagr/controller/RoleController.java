package com.oracle.intelagr.controller;

import com.oracle.intelagr.common.JsonResult;
import com.oracle.intelagr.common.PageModel;
import com.oracle.intelagr.common.TreeModel;
import com.oracle.intelagr.entity.Function;
import com.oracle.intelagr.entity.Role;
import com.oracle.intelagr.entity.RoleFunction;
import com.oracle.intelagr.entity.User;
import com.oracle.intelagr.service.IRoleService;
import com.oracle.intelagr.service.IUserService;
import com.oracle.intelagr.service.impl.FunctionService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.*;

@Controller
@RequestMapping("/role")
public class RoleController {
    @Autowired
    private IRoleService roleService;
    @Autowired
    private IUserService userService;
    @RequestMapping("/list")
    public String list(@RequestParam Map paramMap,PageModel pageModel, Map map){
        pageModel.setData(paramMap);
        roleService.queryForPage(pageModel);
        map.put("pageModel",pageModel);
        return "/role/roleList";
    }
    @RequestMapping("/add")
    public String add(){
        return "/role/addRole";
    }
    @RequestMapping("/save")
    @ResponseBody
    public JsonResult save(Role role,HttpServletRequest request){
        //role对象中还有数据库中的非空项
        HttpSession session = request.getSession();
        User user = (User)session.getAttribute("user");
        role.setCreateUserId(user.getUserID());
        role.setUpdateUserId(user.getUserID());
        role.setCreateDate(new Date());
        role.setUpdateDate(new Date());
        roleService.save(role);
        return new JsonResult(true);
    }
    @RequestMapping("/edit")
    public String edit(int id,Map map){
        Role role = roleService.queryById(id);
        map.put("role",role);
        return "/role/editRole";
    }
    @RequestMapping("/update")
    @ResponseBody
    public JsonResult update(Role role,HttpServletRequest request){
        HttpSession session = request.getSession();
        User user = (User)session.getAttribute("user");
        role.setUpdateDate(new Date());
        role.setUpdateUserId(user.getUserID());
        roleService.update(role);
        return new JsonResult(true);
    }
    @RequestMapping("/delete")
    @ResponseBody
    public JsonResult delete(@RequestBody List<Integer> list){
        int[] ids = new int[list.size()];
        for(int i = 0;i<list.size();i++){
            ids[i]=list.get(i);
        }
        roleService.delete(ids);
        return new JsonResult(true);
    }
    /*@RequestMapping("/delete")
    @ResponseBody
    public JsonResult delete(@RequestParam("ids[]") String[] ids,HttpServletRequest request){
       *//* Map map = request.getParameterMap();
        Set<Map.Entry<String,String[]>> entrySet = map.entrySet();
        for(Map.Entry<String,String[]> entry:entrySet){
            System.out.println(entry.getKey());
            for(String value:entry.getValue()){
                System.out.println("\t--"+value);
            }
        }*//*
       String[] values = request.getParameterValues("ids[]");
        return new JsonResult(true);
    }*/
    @RequestMapping("/roleAuth")
    public String roleAuth(int id,Map map){
        Role role = roleService.queryById(id);
        map.put("role",role);
        //向页面传一个json格式的字符串，包括了菜单数据(权限数据Function)
        //json的格式是固定的，因为要把它交给一个easyUI-tree ，easyUI-tree需要的json格式是固定的
        //easyUI-tree需要的格式例如： [{id=100,text=系统管理,children:[
        //                              {id=110,text=员工管理,checked=true},{id=111,text=部门管理}]},
        //                              {id=200,text=订单管理，children:[{},{},{}]}]

        //List<Function>   -->  easyUI-tree需要的json格式
        //1. List<Function>  --> List<Map>
        List<Map> list = userService.getFunction(null);
        //2. 获得该角色拥有的Function的集合
        List<RoleFunction> hasFunctions = roleService.queryFunctionByRole(role.getRoleCode());
        //JSONLib 一个一个拼写的
        /*JSONArray array = new JSONArray();
        for(Map m:list){
            Function function = (Function)m.get("parent");
            JSONObject obj = new JSONObject();
            obj.put("id",function.getModuleCode());
            obj.put("text",function.getModuleName());
            JSONArray childrenArray = new JSONArray();
            List<Function> mChildList = (List<Function>)m.get("child");
            for(Function fun:mChildList){
                JSONObject childObject = new JSONObject();
                childObject.put("id",fun.getFunctionCode());
                childObject.put("text",fun.getFunctionName());
                childrenArray.add(childObject);
            }
            obj.put("children",childrenArray);
            array.add(obj);
        }*/
        //需要的json结构  整理为 Java的List<TreeModel> 结构    JSONArray.fromObject(list)
        List<TreeModel> treeList = new ArrayList<TreeModel>();
        for(Map m:list){
            Function fun = (Function)m.get("parent");
            //创建每个一级菜单对象，添加到treeList中
            TreeModel module = new TreeModel();
            module.setId(fun.getModuleCode());
            module.setText(fun.getModuleName());
            List<TreeModel> treeChildList = new ArrayList<TreeModel>();
            module.setChildren(treeChildList);
            //从Map中获得二级菜单集合，创建二级菜单对象，添加到treeChildList中
            List<Function> funList = (List<Function>)m.get("child");
            for(Function function:funList){
                TreeModel child = new TreeModel();
                child.setId(function.getFunctionCode());
                child.setText(function.getFunctionName());
                for(RoleFunction roleFunction:hasFunctions){
                    if(function.getFunctionCode().equals(roleFunction.getFunctionCode())){
                        child.setChecked("true");
                        break;
                    }
                }
                treeChildList.add(child);
            }
            treeList.add(module);
        }
        map.put("jsonData",JSONArray.fromObject(treeList).toString());
        return "/role/roleAuth";
    }
    @RequestMapping("/saveRoleAuth")
    @ResponseBody
    public JsonResult saveRoleAuth(@RequestBody List<String> funCodeList,String roleCode,HttpServletRequest request){
        HttpSession session = request.getSession();
        User user = (User)session.getAttribute("user");
        roleService.saveRoleAuth(roleCode,funCodeList,user);
        return new JsonResult(true);
    }
}
