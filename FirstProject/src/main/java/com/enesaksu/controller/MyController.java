package com.enesaksu.controller;

import com.enesaksu.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class MyController {

    @GetMapping("header")
    public String getHeader(@RequestHeader("My-Header") String myHeader){
        return "Your header is : " + myHeader;
    }


    @PostMapping("users")
    public User saveUser(@RequestBody User user){
        System.out.println("User Saved");
        System.out.println(user.getName());
        return user;
    }

    @PostMapping("users-all")
    public List<User> saveAllUser(@RequestBody List<User> users){
        System.out.println("All User Saved");
        users.forEach(user -> user.setPassword(""));
        return users;
    }





    @GetMapping({"/message", "/message/{m}"}) // Kullanımı : my/message/mesajı buraya yazıyoruz.
    public String message(@PathVariable(name = "message", required = false) String message){
        return "Your Messeage is  : " + message;
     }
     //required = false eğer bir mesaj göndermesekkte çalışmasını sağlar.

     @GetMapping("/message2") // Kullanımı : my/message2?message=Mesajımızı buraya yazıyoruz.
     public String getMyMessage(@RequestParam(name = "message", required = false, defaultValue = "default message") String message){
        return "Your Message is : " + message;
     }

}
