package com.Spring.LoginJpa.controller;

import com.Spring.LoginJpa.domain.CreateMember;
import com.Spring.LoginJpa.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MemberController {
    @GetMapping("/members/new")
    public String login(){
        return "/members/createMembers";
    }


    @Autowired // Bean으로 등록된 클래스들을 스프링을 시작할 때 (서버를 켤 때)자동으로 주입해줍니다.

    MemberService memberService;

    @RequestMapping(value = "/joinUs.do", method = RequestMethod.POST)
    public String joinUs(CreateMember createMember){

        memberService.joinMember(createMember);
        return "home";
    }

}
