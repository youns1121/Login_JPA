package com.Spring.LoginJpa.controller;

import com.Spring.LoginJpa.domain.UserVO;
import com.Spring.LoginJpa.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Slf4j
@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder; // 시큐리티에서 빈(Bean) 생성


    /**
     * 유저 페이지
     *
     * @return
     */
    @GetMapping("/join")
    public String loginResult(){
        return "/members/loginResult";
    }

    /**
     *  로그인 폼 페이지
     *
     *  @return
     */
    @GetMapping("/joinus")
    public String loginForm() {
        return "home";
    }


    /**
     * 회원가입 페이지
     *
     * @return
     */
    @GetMapping("/members/new")
    public String joinForm(){
        return "/members/createUsers";
    }
//
////    @Autowired // Bean으로 등록된 클래스들을 스프링을 시작할 때 (서버를 켤 때)자동으로 주입해줍니다.
////    UserService userService;
////
////    @RequestMapping(value = "/joinUs.do", method = RequestMethod.POST)
////    public String joinUs(UserVO vo, Model model){
////        userService.joinUser(vo);
////        return "home";
////    }
//
//
//    @RequestMapping(value = "/join", method = RequestMethod.POST)
//    public String login(UserVO vo, Model model){
//        System.out.println("vo = " + vo);
//        UserVO userVO=userService.loginUser(vo.getUserid(), vo.getPassword());
//
//        model.addAttribute("userName", userVO.getUsername());
//        return "/members/loginResult";
//    }
//
//    @GetMapping("/members/new") // 회원가입 화면
//    public String createUsers(){
//        return "/members/createUsers";
//    }


}
