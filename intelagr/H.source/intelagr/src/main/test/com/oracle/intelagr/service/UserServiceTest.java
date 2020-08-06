package com.oracle.intelagr.service;

import com.oracle.intelagr.common.PageModel;
import com.oracle.intelagr.entity.Function;
import com.oracle.intelagr.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class UserServiceTest {
    @Autowired
    private IUserService userService;
    @Test
    public void loginTest(){
        User user = new User();
        user.setUserID("admin");
        user.setPassword("admin");
        List<User> list = userService.login(user);
        for (User u:list){
            System.out.println(u.getUserName());
        }
    }
    @Test
    public void getFunctionTest(){
        List<Map> list = userService.getFunction("nyj");
        for(Map m:list){
            System.out.println(m.get("parent"));
            for(Function function:(List<Function>)m.get("child")){
                System.out.println("\t----"+function.getFunctionName());
            }
        }
    }
    @Test
    public void queryForPageTest(){
        //组件查询条件
        Map map = new HashMap();
        //map.put("userID","admin");
        map.put("userType","01");
        PageModel pageModel = new PageModel();
        pageModel.setPage(1);
        pageModel.setPageSize(5);
        pageModel.setData(map);
        userService.queryForPage(pageModel);
        for(User user:(List<User>)pageModel.getResult()){
            System.out.println(user.getUserName());
        }
    }
}
