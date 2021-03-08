package com.Spring.LoginJpa.controller;

import com.Spring.LoginJpa.domain.UserVO;
import com.Spring.LoginJpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {




    @Autowired // Bean으로 등록된 클래스들을 스프링을 시작할 때 (서버를 켤 때)자동으로 주입해줍니다.
    UserService userService;

    @RequestMapping(value = "/joinUs.do", method = RequestMethod.POST)
    public String joinUs(UserVO vo, Model model){
        userService.joinUser(vo);
        return "home";
    }


    @RequestMapping(value = "/login.do", method = RequestMethod.POST)
    public String login(UserVO vo, Model model){
        System.out.println("vo = " + vo);
        UserVO userVO=userService.loginUser(vo.getUserId(), vo.getPassword());

        model.addAttribute("userName", userVO.getUserName());
        return "/members/loginResult";
    }

    @GetMapping("/members/new") // 회원가입 화면
    public String createUsers(){
        return "/members/createUsers";
    }


}
