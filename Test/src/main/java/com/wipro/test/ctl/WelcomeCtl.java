package com.wipro.test.ctl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/Welcome")
public class WelcomeCtl {

    @RequestMapping(method = RequestMethod.GET)
    public String display(ModelMap model) {
        return "Welcome";
    }

}