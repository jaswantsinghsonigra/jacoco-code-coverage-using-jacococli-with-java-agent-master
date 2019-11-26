package org.broonix.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by: Brooks Lyrette
 * Date: 15-11-19.
 */
@Controller
public class DemoController {

    @RequestMapping("/")
    public ModelAndView showHomepage() {
        return new ModelAndView("home");
    }
}
