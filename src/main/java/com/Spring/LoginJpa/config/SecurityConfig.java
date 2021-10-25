
package com.Spring.LoginJpa.config;



import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


//@Log4j2
/**
 * WebSecurityConfigurerAdapter 를 상속받아서 구현한다.
 * => 해당 클래스는 웹 보안기능 초기화 및 설정을 담당한다.
 */
@Configuration
@EnableWebSecurity //웹보안 활성화를위한 annotation
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests() // 요청에 의한 보안검사 시작
                .anyRequest().authenticated() //어떤 요청에도 보안검사를 한다.
        .and()
                .formLogin()//보안 검증은 formLogin방식으로 하겠다.
                .loginPage("/login.html") //사용자 정의 로그인 페이지
                .defaultSuccessUrl("/login.html?error=true")//로그인 실패 후 이동 페이지
                .usernameParameter("username")//아이디 파라미터명 설정
                .passwordParameter("password")//패스워드 파라미터명 설정
                .loginProcessingUrl("/login")//로그인 Form Action Url
//                .successHandler(loginSuccessHandler())//로그인 성공 후 핸들러 (해당 핸들러를 생성하여 핸들링 해준다.)
//                .failureHandler(loginFailureHandler())//로그인 실패 후 핸들러 (해당 핸들러를 생성하여 핸들링 해준다.)
                .permitAll();

    }





}
