package com.drug.controller;


import com.drug.pojo.SysUser;
import com.drug.service.SystemUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SystemContorller {
    @Autowired
    private SystemUser systemUser;

    @RequestMapping("/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password) {
        System.out.println(username);
        SysUser sysuser = systemUser.findByCount(username);
        System.out.println(sysuser.getPassword());
        if(sysuser!=null&&password.equals(sysuser.getPassword())){
            System.out.println("123");
            return "redirect:/main.html";
    }
       else {
            System.out.println("456");
            return "redirect:/index.html";
        }

    }

    @RequestMapping("/test")
    public String test(){
        return "main";
    }

}
