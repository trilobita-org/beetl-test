package com.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by on 2018/5/3.
 */
@Controller
public class IndexCollection {
    @GetMapping("/index")
    public ModelAndView index(){
        ModelAndView modelAndView=new ModelAndView("/index.html");
        return modelAndView;
    }
}
