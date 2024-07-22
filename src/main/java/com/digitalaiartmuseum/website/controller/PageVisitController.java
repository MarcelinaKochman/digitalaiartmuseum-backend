package com.digitalaiartmuseum.website.controller;

import com.digitalaiartmuseum.website.entity.PageVisitEntity;
import com.digitalaiartmuseum.website.service.PageVisitService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/page-visit")
@RequiredArgsConstructor
public class PageVisitController {

    private final PageVisitService pageVisitService;

    @GetMapping(value = "/count")
    public long pageVisitNumber() {
        return pageVisitService.getNumber();
    }

    @PostMapping
    public long pageVisit() {
        return pageVisitService.create();
    }

}
