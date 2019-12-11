package controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DictionaryController {
    @RequestMapping(value = "/dictionary", method = RequestMethod.GET)
    public String dictionary() {
        return "index";
    }

    @RequestMapping(value = "/dictionary", method = RequestMethod.POST)
    public String resultDictionary(@RequestParam("dictionary") String dictionary, Model model, String result) {
        Map<String, String> listDictionary = new HashMap<String, String>();
        listDictionary.put("hello", "Xin chào");
        listDictionary.put("name", "tên");
        listDictionary.put("age", "tuổi");

        result = listDictionary.get(dictionary);

        if (dictionary.equals("")){
            result = "Vui lòng nhập từ cần tìm...";
        }

        if (result == null) {
            result = "Không tìm thấy từ cần tìm";
        }


        model.addAttribute("result", result);
        return "index";
    }
}
