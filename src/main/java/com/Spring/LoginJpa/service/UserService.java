//package com.Spring.LoginJpa.service;
//
//import com.Spring.LoginJpa.domain.UserVO;
//import com.Spring.LoginJpa.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service // service를 명시해 놓으면 해당 클래스를 스프링이 시작할 때 Bean으로 등록시켜 줍니다.
//
//
//public class UserService {
//
//    @Autowired
//    UserRepository userRepository;
//
//    public void joinUser(UserVO vo){
//
//        userRepository.save(vo);
//    }
//    public UserVO loginUser(String id,String pw){
//        UserVO userVO=userRepository.findByUsername(userRep);
//        return userVO;
//
//
//    }
//}
