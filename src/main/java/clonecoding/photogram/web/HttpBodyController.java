package clonecoding.photogram.web;

import clonecoding.photogram.domain.User;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class HttpBodyController {

    private static final org.slf4j.Logger log = LoggerFactory.getLogger(HttpBodyController.class);

    @PostMapping("/body1")
    public String xwwwFormLencoded(String username){
        log.info(username);
        return "key-value 전송";
    }

    @PostMapping("/body2")
    public String textPlain(@RequestBody String data){
        log.info(data);
        return "plain/text 전송";
    }

    @PostMapping("/body3")
    public String applicationJson(@RequestBody String data){
        log.info(data);
        return "json 전송";
    }

    @PostMapping("body4")
    public String applicationJsonToObject(@RequestBody User user){
        log.info(user.getUsername());
        return "json 전송옴";
    }
}
