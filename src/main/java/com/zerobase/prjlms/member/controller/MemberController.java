package com.zerobase.prjlms.member.controller;

import com.zerobase.prjlms.member.model.MemberInput;
import com.zerobase.prjlms.member.service.MemberService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RequiredArgsConstructor //생성자를 자동으로 생성해주는 어노테이션
@Controller
public class MemberController {

    // MemberRepository 사용
    private final MemberService memberService;



    @GetMapping("/member/register")
    public String register() {

        return "member/register";
    }

    @PostMapping( "/member/register")
    public String registerSubmit(Model model, HttpServletRequest request
        , MemberInput parameter) {

        boolean result = memberService.register(parameter);
        model.addAttribute("result", result);

        return "member/register_complete";
    }

    @GetMapping("/member/email_auth")
    public String emailAuth(Model model, HttpServletRequest request) {
        String uuid = request.getParameter("id");

        System.out.println(uuid);

        boolean result = memberService.emailAuth(uuid);
        model.addAttribute("result", result);

        return "member/email_auth";
    }
}
