package com.mysite.basic.domain.wiseSaying.wiseSaying.controller;

import com.mysite.basic.domain.wiseSaying.wiseSaying.entity.WiseSaying;
import com.mysite.basic.domain.wiseSaying.wiseSaying.service.WiseSayingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ResponseBody
@RequiredArgsConstructor
public class WiseSayingController {
    private final WiseSayingService wiseSayingService;

    @GetMapping("/wiseSayings")
    public List<WiseSaying> getItems() {
        return wiseSayingService.findAll();
    }

    @GetMapping("/wiseSayings/write")
    public WiseSaying write(
            @RequestParam(name = "content") String content,
            @RequestParam(name = "author")String author) {
        return wiseSayingService.write(content,author);
    }
}
