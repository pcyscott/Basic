package com.mysite.basic;

import lombok.Builder;
import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

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
        return Article.builder()
                .title("제목2")
                .body("내용2").build();
    } ;
    @GetMapping("/map")
    @ResponseBody
    public Map<String, String> getMap() {
        return Map.of("name", "Paul", "hobby", "reading");
    }

    @GetMapping("/articleList")
    @ResponseBody
    public List<Article> getArticleList(){
        return List.of(
                Article.builder().title("제목").body("내용").build(),
                Article.builder().title("제목1").body("내용1").build()      );
    }
    @GetMapping("/articleMap")
    @ResponseBody
    public Map<String,Article> getArticleMap(){
        return Map.of(
                "article1",Article.builder().title("제목").body("내용").build(),
                "article2",Article.builder().title("제목1").body("내용1").build()      );
    }

}
@Builder
@Getter
class Article {

    private final long id = 2;
    private final String title;
    private final String body;
    private final boolean published = true;
}