package com.Spring.LoginJpa.config.auth;


import com.Spring.LoginJpa.domain.UserVO;
import com.Spring.LoginJpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PrincipalDetailsService implements UserDetailsService {
    /**
     * PrincipalDetailsService.java는 로그인을 하게되면(login Processing URL),
     * 알아서 IoC에 등록된 UserDetailsService의 loadUserByUsername() 메소드를 호출한다.
     */
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
        Optional<UserVO> optionalUser = userRepository.findByUsername(username);

        return optionalUser
                .map(PrincipalDetails::new) // 입력받은 username에 해당하는 사용자가있다면, PrincipalDetails 객체를 생성한다.
                .orElse(null); // 없다면 null을 반환한다. (인증 실패)
    }
}

