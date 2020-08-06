package com.oracle.intelagr.controller;

import com.oracle.intelagr.common.JsonResult;
import com.oracle.intelagr.common.PageModel;
import com.oracle.intelagr.entity.Role;
import com.oracle.intelagr.entity.User;
import com.oracle.intelagr.service.IRoleService;
import com.oracle.intelagr.service.IUserService;
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
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;
    @Autowired
    private IRoleService roleService;
    @RequestMapping("/login")
    @ResponseBody
    public JsonResult login(User user, HttpServletRequest request){
        List<User> list = userService.login(user);
        if(list!=null&&list.size()>0){
            //登录成功   防止非法登录
            HttpSession session = request.getSession();
            session.setAttribute("user",list.get(0));
            JsonResult result = new JsonResult(true);
            return result;
        }
        return new JsonResult(false,"用户名密码不正确");
    }
    @RequestMapping("/main")
    public String main(HttpServletRequest request){
        HttpSession session = request.getSession();
        User user= (User)session.getAttribute("user");
        List<Map> list = userService.getFunction(user.getUserID());
        session.setAttribute("menuList",list);
        //根据登录的用户ID 查询出该用户拥有的权限
        return "/main";
    }
    @RequestMapping("/list")
    public String list(PageModel pageModel, @RequestParam Map map,Map m){
        pageModel.setData(map);
        userService.queryForPage(pageModel);
        m.put("pageModel",pageModel);
        return "/user/userList";
    }
    @RequestMapping("/add")
    public String add(Map map){
        //查询所有的角色
        List<Role> roleList = roleService.selectAll();
        //将角色集合 转为json格式的字符串  传到页面上
        /*JSONArray jsonArray = new JSONArray();
        for(Role role:roleList){
            JSONObject obj = new JSONObject();
            obj.put("roleCode",role.getRoleCode());
            obj.put("roleName",role.getRoleName());
            jsonArray.add(obj);
        }*/
        //根据roleList的格式  转为 JSONArray的格式
        JSONArray jsonArray = JSONArray.fromObject(roleList);
        map.put("roleList",jsonArray.toString());
        return "/user/addUser";
    }
    @RequestMapping("/save")
    @ResponseBody
    public JsonResult save(@RequestBody User user,HttpServletRequest request){
        //判断用户是否存在，如果存在给出提示
        //按userID从数据库里查询的对象，判断userID是否存在的
        User u = userService.selectById(user.getUserID());
        if(u!=null){
            return new JsonResult(false,"用户名已存在");
        }
        HttpSession session = request.getSession();
        //当前登录人的User
        User loginUser = (User)session.getAttribute("user");
        user.setCreateDate(new Date());
        user.setCreateUserId(loginUser.getUserID());
        user.setUpdateDate(new Date());
        user.setUpdateUserId(loginUser.getUserID());
        //要保存的User
        userService.save(user);
        return new JsonResult(true);
    }
    @RequestMapping("/edit")
    public String edit(String userID,Map map){
        User user= userService.selectById(userID);
        map.put("user",user);
        return "/user/basicInfoEdit";
    }
    @RequestMapping("/update")
    @ResponseBody
    public JsonResult update(@RequestBody User user){
        userService.update(user);
        return new JsonResult(true);
    }
    @RequestMapping("/delete")
    @ResponseBody
    public JsonResult delete(String userID){
        userService.delete(userID);
        return new JsonResult(true);
    }
}
