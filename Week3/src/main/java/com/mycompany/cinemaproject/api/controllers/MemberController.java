package com.mycompany.cinemaproject.api.controllers;

import com.mycompany.cinemaproject.business.abstracts.MemberService;
import com.mycompany.cinemaproject.core.utilities.results.DataResult;
import com.mycompany.cinemaproject.core.utilities.results.Result;
import com.mycompany.cinemaproject.entities.concretes.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/members")
public class MemberController {

    private MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        super();
        this.memberService = memberService;
    }

    @GetMapping("/getall")
    public DataResult<List<Member>> getAll() {
        return this.memberService.getAll();
    }

    @PostMapping("/add")
    public Result add(Member member) {
        return this.memberService.add(member);
    }
}
