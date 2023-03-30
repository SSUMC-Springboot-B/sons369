package clonecoding.photogram.web;

import org.springframework.web.bind.annotation.*;

@RestController
public class HttpController {

    /**
     *
     * 각 주소는
     * localhost:8080/get
     * localhost:8080/post
     * localhost:8080/put
     * localhost:8080/delete
     * 으로 변환이 된다
     */

    @GetMapping("/get")
    public String get(){
        return "get";
    }

   @PostMapping("/post")
    public String post(){
        return "post";
    }

    @PutMapping("/put")
    public String put(){
        return "put";
    }

    @DeleteMapping("/delete")
    public String delete(){
        return "delete";
    }
}
