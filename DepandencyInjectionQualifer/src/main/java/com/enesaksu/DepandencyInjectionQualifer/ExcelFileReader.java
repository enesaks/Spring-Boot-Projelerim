package com.enesaksu.DepandencyInjectionQualifer;

import org.springframework.stereotype.Component;

@Component("EXCEL")
public class ExcelFileReader implements Reader{
    @Override
    public String reafFile() {
        return "Excel file";
    }
}
