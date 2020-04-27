package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Sandwich {
    @RequestMapping("/sandwich")
    public String loadIndex(){
        return "sandwich";
    }

    @PostMapping("/save")
    public String getCondiment(ModelMap modelMap, @RequestParam("condiment") String[] condiment){
        modelMap.addAttribute("condiment",condiment);
        return "save";
    }
}
