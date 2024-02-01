package com.enesaksu;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component // Tek başına yazıldığında proje ayaklandığında bu componentin bir nesnesini oluşturur.
//@Lazy // eğer lazy anotasyonunu kulanırsak ihtiyaç olduğu dahilinde oluşturulur.
public class MyComponent {

    public MyComponent() {
        System.out.println("MyComponent bean initialized! ");
    }

    public String getName(){
        return "MyComponent";
    }

}
