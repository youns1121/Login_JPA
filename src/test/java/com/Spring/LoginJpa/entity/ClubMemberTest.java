package com.Spring.LoginJpa.entity;

import com.Spring.LoginJpa.repository.ClubMemberRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;


import java.util.Optional;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ClubMemberTest { // 100개의 계정 생성 테스트

    @Autowired
    private ClubMemberRepository repository;

    @Autowired
    private PasswordEncoder passwordEncoder;

//    @Test
//    public void insertDummies() {
//
//        //1 - 80까지는 USER만 지정
//        //81 - 90까지는 USER, MANAGER
//        //91 - 100까지는 USER, MANAGER, ADMIN
//
//        IntStream.rangeClosed(1, 100).forEach(i -> {
//            ClubMember clubMember = ClubMember.builder()
//                    .email("user"+i+"@youns.com")
//                    .name("사용자"+i)
//                    .fromSocial(false)
//                    .password(  passwordEncoder.encode("11111")  )
//                    .build();
//
//            //default
//            clubMember.addMemberRole(CLubMemberRole.USER);
//            if(i > 80){
//                clubMember.addMemberRole(CLubMemberRole.MANAGER);
//            }
//
//            if(i > 90){
//                clubMember.addMemberRole(CLubMemberRole.ADMIN);
//            }
//
//            repository.save(clubMember);
//
//        });
//    }

    @Test
    public void testRead() {

        Optional<ClubMember> result = repository.findByEmail("user95@youns.com", false);

        ClubMember clubMember = result.get();

        System.out.println(clubMember);
    }

}