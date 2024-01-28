package com.ss.sewa;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sewa")
public class Welcome {

    @GetMapping("/welcome")
    public String welcome(){
        return "This is sewa-serivce";
    }

}
