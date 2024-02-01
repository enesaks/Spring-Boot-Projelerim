package com.enesaksu.DepandencyInjectionQualifer;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("PDF")
@Primary
public class PdfFileReader implements Reader {

    @Override
    public String reafFile() {
        return "PDF file";
    }
}
