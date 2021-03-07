package com.Spring.LoginJpa.service;

import com.Spring.LoginJpa.domain.CreateMember;
import com.Spring.LoginJpa.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // service를 명시해 놓으면 해당 클래스를 스프링이 시작할 때 Bean으로 등록시켜 줍니다.


public class MemberService {

    @Autowired
    MemberRepository memberRepository;

    public void joinMember(CreateMember createMember){

        memberRepository.save(createMember);
    }
}
