package controllers;

import model.Login;
import model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @GetMapping("/home")
    public ModelAndView home(ModelAndView modelAndView) {
        modelAndView = new ModelAndView("login", "login", new Login());
        return modelAndView;
    }
}
