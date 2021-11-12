package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


//controller가 static보다 우선
@Controller
public class HomeController {

    //first domain
    @GetMapping("/")
    public String home(){
        return "home";
    }

}
