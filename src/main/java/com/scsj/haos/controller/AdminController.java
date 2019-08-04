package com.scsj.haos.controller;

import com.scsj.haos.common.domain.Admin;
import com.scsj.haos.common.domain.Emp;
import com.scsj.haos.mapper.AdminMapper;
import com.scsj.haos.mapper.EmpMapper;
import com.scsj.haos.service.AdminService;
import com.scsj.haos.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@Controller
public class AdminController {

    @Autowired
    private AdminService adminService;
    @Autowired
    private EmpService empService;

    /**
     * 管理员或员工登录
     * */
    @RequestMapping("/login")
    public String Login(ModelMap modelMap,String id,String password,String admin, HttpServletRequest request){

        boolean success = true;
        String failMsg = null;
        String title = " ";

        if (admin.equals("on")){
            Admin adminDB = adminService.findAdminById(id);
            if (adminDB == null) {
                success = false;
                failMsg = "用户名不存在";
            } else if (!(adminDB.getPassword().equals(password))) {
                success = false;
                failMsg = "密码不匹配";
            }
            if(success){
                title = "管理员:";
                request.getSession().setAttribute("current_user",adminDB);
                request.getSession().setAttribute("loginTme",new Date());
                request.getSession().setAttribute("title",title);
            }
        }else{
            Emp empDB = empService.findEmpById(id);
            if (empDB == null) {
                success = false;
                failMsg = "用户名不存在";
            } else if (!(empDB.getPassword().equals(password))) {
                success = false;
                failMsg = "密码不匹配";
            }
            if(success){
                request.getSession().setAttribute("current_user",empDB);
                request.getSession().setAttribute("loginTme",new Date());
            }
        }

        modelMap.put("content", "main");
        modelMap.put("msg", failMsg);

        return success ? "main" : "login";
    }

    @RequestMapping("/logout")
    public String logout(ModelMap modelMap,HttpServletRequest request) {
        request.getSession().invalidate();//销毁session
        return "login";
    }


    /**
     * 首页跳转设置
     * */
    @RequestMapping("/")
    public String login(){
        return "login";
    }


}
