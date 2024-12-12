package com.mysite.basic;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {


    @GetMapping("/sbb")
    @ResponseBody
    public String index(){
      return "연습중";
    }

    @GetMapping("/about")
    @ResponseBody
    public String about(){
        return "이러라고?";
    }

    /*@GetMapping("/age")
    @ResponseBody
    public Long AgeUp(){
        //return id+age;
    }*/

    @GetMapping("/boolean")
    @ResponseBody
    public boolean True(){
        return true;
    }

    @GetMapping("/byte")
    @ResponseBody
    public byte Byte(){
        return 127;
    }

    @GetMapping("/math")
    @ResponseBody
    public String Math(){

        //return Integer.toBinaryString(45);
        //return Integer.toOctalString(12);
        return Integer.toHexString(167);
    }

    @GetMapping("/article")
    @ResponseBody
    public Article getArticle(){
        return new Article(1, "제목1","내용1",false);
    } ;
}
@AllArgsConstructor
@Getter
class Article {

    public long id;
    public String title;
    public String body;
    public boolean published;
}