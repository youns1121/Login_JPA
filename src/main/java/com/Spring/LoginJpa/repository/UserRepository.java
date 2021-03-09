package com.Spring.LoginJpa.repository;

import com.Spring.LoginJpa.domain.UserVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserVO, Long> {
    // UserVO의 저장, 삭제는 JpaRepository에서 제공해주기 때문에 따로 코드를 작성하지 않아도 바로 사용 가능하고 조회만 원하는 대로 코드를 작성
//UserVO findByUserId(String userId);
//이렇게 하면 DB에서는 매개변수로 넘겨준 userId에 일치하는 유저 행을 찾아서 UserVO객체로 리턴하게 됩니다.

    // username을 가지고 UserVO 정보를 가져올 수 있게 메소드 생성
    Optional<UserVO> findByUsername(String username);


//    @Query("select u from UserVO u where u.userId=:userId and u.password=:password") 2021_03_09
//    UserVO selectUserInfo(@Param("userId")String userId,@Param("password")String password);
}
