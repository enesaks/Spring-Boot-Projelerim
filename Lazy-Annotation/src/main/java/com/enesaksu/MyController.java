package com.enesaksu;

import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {
    private MyComponent myComponent;


//    private Example1 example1;
//    private Example2 example2;
//
//    public MyController(Example1 example1, Example2 example2) {
//        this.example1 = example1;
//        this.example2 = example2;
//    }

    public MyController(@Lazy MyComponent myComponent) {// buradaki lazy ihtiyaç olmadığı durumda mycomponent e birşey atamıycak.
        this.myComponent = myComponent;
    }

    @GetMapping("/name")
    public String getComponentName(){
            return this.myComponent.getName();
    }


}
