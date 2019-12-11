package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConvertMoneyController {
    @RequestMapping("/convert")
    public String convert() {
        return "index";
    }

    @RequestMapping(value = "/convert", method = RequestMethod.POST)
    public String result(@RequestParam("convert") String convert, @RequestParam float money,
                         @RequestParam float rate, Model model) {
        float result;
        if (convert.equals("convertVNDToUSD")) {
            result = money / rate;
        } else {
            result = money * rate;
        }
        model.addAttribute("result", result);
        return "display";
    }
}
