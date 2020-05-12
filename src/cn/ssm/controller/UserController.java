package cn.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.ssm.pojo.User;
import cn.ssm.service.UserService;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    
    // 定义访问的方法
    @RequestMapping(value="/show",method=RequestMethod.GET)
    public String showInfo(Model model) {
        List<User> list = userService.getList();
        // 将集合保存到数据模型中
        model.addAttribute("user", list);
        return "user_index";
    }
}
