package com.zerobase.prjlms.member.repository;

import com.zerobase.prjlms.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

// Entity와 함께 세트로 구성되는 Repository
// 인터페이스를 만들면 자동으로 데이터가 저장이 됨.
public interface MemberRepository extends JpaRepository<Member, String> {

    Optional<Member> findByEmailAuthKey(String emailAuthKey);

}
