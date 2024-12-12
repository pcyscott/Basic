package com.mysite.basic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    private long id = 20;
    private long age = 30;

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

    @GetMapping("/age")
    @ResponseBody
    public Long AgeUp(){
        return id+age;
    }

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

}

