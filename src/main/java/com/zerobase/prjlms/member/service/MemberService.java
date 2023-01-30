package com.zerobase.prjlms.member.service;

import com.zerobase.prjlms.member.model.MemberInput;

public interface MemberService {

    boolean register(MemberInput parameter);

    boolean emailAuth(String uuid);
}
