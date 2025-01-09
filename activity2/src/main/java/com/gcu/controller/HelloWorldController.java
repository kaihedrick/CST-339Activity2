package com.gcu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/hello")
public class HelloWorldController {
    /**
     * Simple Hello world controller that returns a string in the response body
     * invoke using /test1 uri
     * 
     * @return Hello world test string
     */
    @GetMapping("/test1")
    @ResponseBody
    public String printHello()
    {
        //simply return a string in the response body(must use @responseBody    annotation)
        return "Hello World!";
    }
    @GetMapping("/test2")
    public String printHello(Model model)
    {
        //simply return a model with an attribute named message and return a view named hello using a passed in ModelMap
        model.addAttribute("message", "Hello Spring MVC Framework!");
        return "hello";
    }
    @GetMapping("/test3")
    public ModelAndView printHello1()
    {
        //create a modelandview and then set an attribute named message and with a view named helo
        ModelAndView mv = new ModelAndView();
        mv.addObject("message", new String("Hello world from ModelAndView!"));
        mv.addObject("message2", new String("Another Hello World from ModelAndView!"));
        mv.setViewName("hello");    
        return mv;
    }
    @GetMapping("/test4")
    public String printHello(@RequestParam("message") String message, Model model)
    {
        //simply return a model attribute named messsage and return a view named hello
        model.addAttribute("message", message);
        return "hello";
    }
}
