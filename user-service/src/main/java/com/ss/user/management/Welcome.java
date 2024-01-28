package com.ss.user.management;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user-management")
public class Welcome {

    @GetMapping("/welcome")
    public String welcome(){
        return "This is user-management service";
    }
}
