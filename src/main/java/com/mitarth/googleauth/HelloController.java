package com.mitarth.googleauth;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String greet(){
        return "hello user and i am glad that you made it here!!!(it was not working before so a lot of people didn't even passed the controller layer";
    }
    @RequestMapping("/about")
    public String abouttt(){
        return "this is not for commercial use, this is a practice repo for Oauth in google you can change it to github too just update the application properties and paste your github link there ";
    }

}
