package com.mysite.basic.domain.wiseSaying.wiseSaying.controller;

import com.mysite.basic.domain.wiseSaying.wiseSaying.entity.WiseSaying;
import com.mysite.basic.domain.wiseSaying.wiseSaying.service.WiseSayingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@ResponseBody
@RequestMapping("/wiseSayings")
@RequiredArgsConstructor
public class WiseSayingController {
    private final WiseSayingService wiseSayingService;

    @GetMapping
    public List<WiseSaying> getItems() {
        return wiseSayingService.findAll();
    }

    @GetMapping("/write")
    public WiseSaying write(
            @RequestParam(name = "content") String content,
            @RequestParam(name = "author")String author) {
        return wiseSayingService.write(content,author);
    }

    @GetMapping("/{id}")
    public WiseSaying getItem( @PathVariable long id) {

        Optional<WiseSaying> opWiseSaying = wiseSayingService.findById(id);
        return opWiseSaying.get();
    }

    @GetMapping("/{id}/delete")
    public boolean delteItem( @PathVariable long id) {
        return  wiseSayingService.deleteById(id);
    }

    @GetMapping("/{id}/modify")
    public WiseSaying modjifyItem( @PathVariable long id,
                                String content,
                                @RequestParam(defaultValue = "무명") String author) {
       WiseSaying wiseSaying = wiseSayingService.findById(id).get();
       wiseSayingService.modify(wiseSaying,content,author);

       return wiseSaying;
    }

}
