package com.zerobase.prjlms.member.model;

import lombok.Data;
import lombok.ToString;

@ToString
@Data //getter setter 자동으로 생성해주는 lombok 라이브러리 어노테이션
public class MemberInput {
    private String userId;
    private String userName;
    private String password;
    private String phone;
}
