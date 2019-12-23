package com.calendar.cutscalendar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {

    @RequestMapping("/")
    public String welcome() {
        System.out.println("AppController->welcome()");
        return "classpath:resources/templates/index";
    }
}
