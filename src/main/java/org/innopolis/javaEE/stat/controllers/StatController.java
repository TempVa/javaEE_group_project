package org.innopolis.javaEE.stat.controllers;

import org.innopolis.javaEE.stat.services.StatService;
import org.innopolis.javaEE.stat.services.StatServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collections;

@Controller
@RequestMapping("/stat")
public class StatController {
    private static final StatService STAT_SERVICE = new StatServiceImpl();
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView stat() {
        return new ModelAndView("stat", Collections.singletonMap("list",STAT_SERVICE.getAllStat()));
    }
}
