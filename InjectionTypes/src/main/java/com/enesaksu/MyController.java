package com.enesaksu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {

    /*
    Injection Yöntemleri

        Field Injection
        Setter Injection
        Constructor Injection

     */

    //Field Injection
    //@Autowired
    //private FirstClass firstClass;

    @GetMapping("/names")
    public String getNameOfClases(){
        return this.firstClass.getName() + " " +
                this.secondClass.getName() + " " +
                 this.thirdClass.getName();
    }

    //Setter Injection
    private SecondClass secondClass;

    @Autowired
    public void setSecondClass(SecondClass secondClass) {
        this.secondClass = secondClass;
    }


    //Constructor ınjection
    private ThirdClass thirdClass;
    private FirstClass firstClass;
    public MyController(ThirdClass thirdClass){
        this.thirdClass = thirdClass;
    }

    @Autowired//iki constructor olduğu için springe hangisini vericeğimizi belirlemek için yazılır.
    public MyController(ThirdClass thirdClass, @Qualifier("firstClass") FirstClass firstClass) {
        this.thirdClass = thirdClass;
        this.firstClass = firstClass;
    }
}
