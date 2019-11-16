package pl.michal.springdemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/hello")
    ModelAndView myFirstView(ModelAndView modelAndView, @RequestParam(defaultValue = "użytkownik") String name) {

        logger.info("name: {}", name);

        modelAndView.addObject("user", name);
        modelAndView.setViewName("home");
        return modelAndView;
    }
}
