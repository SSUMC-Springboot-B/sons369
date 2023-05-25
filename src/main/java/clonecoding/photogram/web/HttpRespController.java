package clonecoding.photogram.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //파일을 리턴할 것이기 때문
public class HttpRespController {

    @GetMapping("/txt")
    public String txt(){
        return "a.txt"; //일반 정적파일은 resources/static에서 찾는다(디폴트 경로).
    }
}
