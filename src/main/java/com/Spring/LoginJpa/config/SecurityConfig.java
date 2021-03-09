package com.Spring.LoginJpa.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    //암호화 방식 빈(Bean) 생성
    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }


    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http.csrf()
                .disable()
                .authorizeRequests()
                //  /members/loginResult/ 페이지 설정
                .antMatchers("/members/loginResult/**")//특정한 경로 지정
                .authenticated()// 로그인 필요, 인증된 사용자의 접근을 허용
                //기타 url은 모두 허용
                .anyRequest()
                .permitAll() // 모든 사용자가 접근할 수 있다는 것을 의미합니다.
                .and()
                //로그인 페이지 사용
                .formLogin()
                .loginPage("/home") // 로그인 페이지 경로 설정
                .loginProcessingUrl("/members/createUsers") // 로그인이 실제 이루어지는 곳
                .defaultSuccessUrl("/"); // 로그인 성공 후 기본적으로 리다이렉트되는 경로
    }

}
