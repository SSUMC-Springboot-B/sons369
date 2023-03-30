package clonecoding.photogram.web;

import clonecoding.photogram.domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HttpResponseJsonController {

    @GetMapping("/resp/json")
    public String responseJson(){
        return "{\"username\":\"cos\"}";
    }

    @GetMapping("/resp/json/object")
    public User responseJsonObject(){
        User user = new User();
        user.setUsername("쏘니");
        return user;
    }
}
