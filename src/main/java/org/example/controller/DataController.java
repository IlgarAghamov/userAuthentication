package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DataController {

    @GetMapping("/private-data")
    public String getPrivateData() {
        return "private-data";
    }

    @GetMapping("/public-data")
    public String getPublicData() {
        return "public-data";
    }
}
