package com.itguigu.hello.maven.web.admin;

import com.itguigu.hello.maven.web.pojo.User;
import com.itguigu.hello.maven.web.utils.EmailSendUtils;
import org.apache.commons.mail.EmailException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("user")
public class JackonController {

    @Autowired
    private EmailSendUtils emailSendUtils;

    @RequestMapping(value = "get",method = RequestMethod.GET)
    @ResponseBody
    public User getJason(){
        User user = new User();
        user.setId(1);
        user.setName("jack");
        String json="{\"a\":\"1\"}";
        user.setPassword("111");
        user.setEmail("hello@cctv.com");
        return user;
    }

    @RequestMapping(value = "get1",method = RequestMethod.GET)
    public String getJason1() throws EmailException {

        emailSendUtils.send("用户登录","好消息","zy3227768@163.com","1794803734@qq.com");
        return "login";
    }
}
