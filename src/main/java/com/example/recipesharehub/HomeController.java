package com.example.recipesharehub;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    public String homeController(){
        return "well";
    }
}
