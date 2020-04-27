package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Calculator {
    @RequestMapping("/calculation")
    public String getCalculation(){
        return "calculation";
    }

    @PostMapping("/result")
    public String showResult(Model model,
                             @RequestParam("first-operand") double first_operand,
                             @RequestParam("operator") char operator,
                             @RequestParam("second-operand") double second_operand){
        double result = Calculate.calculator(first_operand,second_operand,operator);
        model.addAttribute("result",result);
        model.addAttribute("firstOperand",first_operand);
        model.addAttribute("secondOperand",second_operand);
        model.addAttribute("operator",operator);
        return "result";
    }
}
