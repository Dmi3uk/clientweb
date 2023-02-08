package com.daky.registerclientservice.clientweb.controllers.impl;

import com.daky.registerclientservice.clientweb.controllers.AbstractController;
import com.daky.registerclientservice.clientweb.controllers.validators.LongIdValidator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.PostConstruct;

@Controller
public class RegisterController extends AbstractController {



    @PostConstruct
    void init() {
        BASE_TEMPLATE = "test";
    }



    @RequestMapping(value = "/timetable", method = RequestMethod.GET)
    public String showTimetable(@RequestParam(name = "masterId") String masterId) {

        if(false) return "redirect:/invalid-master-id-page";
        if(false) return "redirect:/authorization";



        return BASE_TEMPLATE;
    }

    @RequestMapping(value = "/timetable/day", method = RequestMethod.GET)
    public String showDay(@RequestParam(name = "day") String day,
                          @RequestParam(name = "year") String year,
                          @RequestParam(name = "month") String month,
                          @RequestParam(name = "masterId") String masterId) {

        return BASE_TEMPLATE;
    }

}
