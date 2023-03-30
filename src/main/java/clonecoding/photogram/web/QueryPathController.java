package clonecoding.photogram.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QueryPathController {

    /*
    localhost:8080/chicken?type=양념
    =>양념배달 갑니다.(쿼리스트링)
     */
    @GetMapping("/chicken")
    public String chickenQuery(String type){
        return type+"배달 갑니다.(쿼리스트링)";
    }

    /*
    localhost:8080/chicken/양념
    => 양념배달갑니다. (주소변수매핑)
     */
    @GetMapping("/chicken/{type}")
    public String chickenPath(@PathVariable String type){
        return type+"배달갑니다. (주소변수매핑)";
    }
}
