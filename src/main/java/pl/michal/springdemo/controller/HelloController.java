package pl.michal.springdemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import pl.michal.springdemo.service.UserService;

@Controller
public class HelloController {

    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    private UserService userService;

    @Autowired
    public HelloController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/hello")
    ModelAndView myFirstView(ModelAndView modelAndView, @RequestParam(defaultValue = "użytkownik") String name) {

        logger.info("name: {}", name);

        modelAndView.addObject("user", name);
        modelAndView.setViewName("home");
        return modelAndView;
    }

    @GetMapping("/userData")
    ModelAndView userInfo(ModelAndView modelAndView, @RequestParam(defaultValue = "imie") String name,
                          @RequestParam(defaultValue = "nazwisko") String surname, @RequestParam(defaultValue = "18") int age) {

        logger.info("name: {} \nsurname: {} \nage: {}", name, surname, age);

        modelAndView.addObject("name", name);
        modelAndView.addObject("surname", surname);
        modelAndView.addObject("age", age);
        modelAndView.setViewName("displayUserData");
        return modelAndView;
    }
}
