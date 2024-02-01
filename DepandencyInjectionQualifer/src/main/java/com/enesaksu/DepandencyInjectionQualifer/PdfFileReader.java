package com.enesaksu.DepandencyInjectionQualifer;

import org.springframework.stereotype.Component;

@Component("PDF")
public class PdfFileReader implements Reader {

    @Override
    public String reafFile() {
        return "PDF file";
    }
}
