package com.Spring.LoginJpa.security.dto;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.log4j.Log4j2;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

@Log4j2
@Getter
@Setter
@ToString
public class ClubAuthMemberDTO extends User {
    /**
     * ClubAuthMemberDTO는 DTD 역할을 수행하는 클래스인 동시에 스프링 시큐리티에서 인가/인증 작업에 사용할 수 있음
     * (password는 부모 클래스를 사용하므로 별도의 멤버 변수로 선언하지 않았음)
      */

    private String email;

    private String name;

    private boolean fromSocial;


    public ClubAuthMemberDTO(
            String username,
            String password,
            boolean fromSocial, Collection<? extends GrantedAuthority> authorities) {

        super(username, password, authorities);
        this.email = username;
        this.fromSocial = this.fromSocial;
    }

}
