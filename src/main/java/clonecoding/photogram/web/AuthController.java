package clonecoding.photogram.web;

import clonecoding.photogram.domain.user.User;
import clonecoding.photogram.service.AuthService;
import clonecoding.photogram.web.dto.auth.SignupDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RequiredArgsConstructor // final 붙은 맴버변수의 생성자를 주입해줌(DI)
@Controller
public class AuthController {


    private final AuthService authService;

    @GetMapping("/auth/signin")
    public String signinForm(){
        return "auth/signin";
    }

    @GetMapping("/auth/signup")
    public String signupForm(){
        return "auth/signup";
    }

    @PostMapping("/auth/signup")
    public String signup(SignupDto signupDto){
        User user = signupDto.toEntity();
        authService.join(user);
        return "auth/signin";
    }

}
