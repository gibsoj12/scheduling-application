package com.calendar.cutscalendar;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AppController {

    @RequestMapping(value = "hello", method = {RequestMethod.GET, RequestMethod.POST})
    public String hello(@RequestParam String name, Model model) { //Model passes data between a controller and a view
        String greeting = "Hello, " + name + "!";
        model.addAttribute("greeting", greeting);
        return "hello";
    }

    @GetMapping("/hello/{name}")
    public String helloAgain(@PathVariable String name, Model model) {
        String greeting = "Hello, " + name + "!";
        model.addAttribute("greeting", greeting);
        return "hello";
    }

    @GetMapping("/")
    public String welcome() {
        System.out.println("AppController->welcome()");
        return "form";
    }

    @GetMapping("available-dates")
    public String displayDates(Model model) {
        List<String> dates = new ArrayList<>(); //Need to figure out how to get these dates from the google calendar
        dates.add("January 1");
        dates.add("January 2");
        dates.add("January 3");
        dates.add("January 5");
        model.addAttribute("dates", dates);
        return "dates-list";
    }
}
