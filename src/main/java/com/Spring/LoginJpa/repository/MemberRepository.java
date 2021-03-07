package com.Spring.LoginJpa.repository;

import com.Spring.LoginJpa.domain.CreateMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<CreateMember, Long> {
    // CreateMember의 저장, 삭제는 JpaRepository에서 제공해주기 때문에 따로 코드를 작성하지 않아도 바로 사용 가능하고 조회만 원하는 대로 코드를 작성해주면 됩니다.
    //
//UserVO findByUserId(String userId);
//이렇게 하면 DB에서는 매개변수로 넘겨준 userId에 일치하는 유저 행을 찾아서 UserVO객체로 리턴하게 됩니다.

}
