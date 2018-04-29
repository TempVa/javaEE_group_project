package org.innopolis.javaEE.stat.controllers;

import org.innopolis.javaEE.stat.services.TopService;
import org.innopolis.javaEE.stat.services.TopServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collections;

@Controller
@RequestMapping("/top")
public class TopController {
    private static final TopService TOP_SERVICE = new TopServiceImpl();
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView top() {
        return new ModelAndView("top", Collections.singletonMap("list", TOP_SERVICE.getTop()));
    }
}
