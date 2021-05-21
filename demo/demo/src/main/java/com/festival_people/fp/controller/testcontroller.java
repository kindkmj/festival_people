package com.festival_people.fp.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class testcontroller {

    @RequestMapping("/user/find")
    public String dev1(HttpServletRequest request, HttpServletResponse response) {
        //1. 사용자 입력값 처리
//        String name = request.getParameter("name");
//        int career = Integer.valueOf(request.getParameter("career"));
//        String email = request.getParameter("email");
//        String gender = request.getParameter("gender");
//        String[] lang = request.getParameterValues("lang");lang

        return "demo/devResult";
    }
}
