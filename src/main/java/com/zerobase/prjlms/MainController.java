package com.zerobase.prjlms;


// MainPage 클래스를 만든 목적??
// 맵핑하기 위해서....
// 주소와 (논리적인주소 인터넷주소) 물리적인파일(프로그래밍을 해야하니까) 맵핑

import com.zerobase.prjlms.components.MailComponents;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// ex) http://www.naver.com/news/list.do
// 하나의 주소에 대해서
// 어디서맵핑? 누가?
// 후보군? 클래스, 속성, 메소드
@Controller
@RequiredArgsConstructor
public class MainController {

    private final MailComponents mailComponents;

    @RequestMapping("/")
    public String index() {

//       String email = "cksdnd1232@gmail.com";
//       String subject = "안녕하세요. 제로베이스 입니다.";
//       String text = "<p>안녕하세요.</p><p>반갑습니다.</p>";

//        mailComponents.sendMail(email, subject, text);

        //thymeleaf때문에 index라는 파일명이 맵핑됨.
        return "index";
    }
}
