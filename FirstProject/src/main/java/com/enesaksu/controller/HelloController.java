package com.enesaksu.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
public class HelloController {

    //GET : Veri görüntülemek için.                     @GetMapping
    //POST : Veri kaydetmek istediğimiz zaman.          @PostMapping
    //PUT : Veri güncellemek için.                      @PutMapping
    //PATCH : Verinin bir bölümünü güncellemek için.    @PatchMapping
    //DELETE : Veri silmek için.                        @DeleteMapping


    //@GetMapping(path = "/hello") Altaki kod ile tammamıyla aynıdır.
    @RequestMapping(path = "/hello" ,method = RequestMethod.GET)
    public String sayHello(){
        return "Hello World";
    }

    @PostMapping("/save")
    public String save(){
        return "Data Saved";
    }

    @DeleteMapping("/delete")
    public String delete(){
        return "Data Deleted";
    }

}
