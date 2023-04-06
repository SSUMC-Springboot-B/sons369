package clonecoding.photogram.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller // IoC에 등록, 파일을 리턴하는 컨트롤러
public class AuthController {

    @GetMapping("/auth/sigin")
    public String signinForm(){
        return "auth/signin";
    }

    @GetMapping("/auth/sigup")
    public String signupForm(){
        return "auth/signup";
    }

    @PostMapping("/auth/sigup")
    public String signup(){
        return "auth/signin";
    }
}
