package com.enesaksu.DepandencyInjectionQualifer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {


    @Autowired
    //@Qualifier("WORLD") bunu kullanmadan @primary vererek te öncelik sağlayarak onu kullnmasını sağlayabliriz.
    private Reader reader;

    @Autowired
    @Qualifier("EXCEL")
    private Reader reader2;

    @GetMapping("/read")
    public String read(){
        return this.reader.reafFile() + " " + this.reader2.reafFile();

    }


}
