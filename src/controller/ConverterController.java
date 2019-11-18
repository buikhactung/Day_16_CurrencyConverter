package controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConverterController {
    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/a")
    public String index(@RequestParam float rate, float usd, Model model) {
        float vnd = rate * usd;
        model.addAttribute("vnd", vnd);
        return "index";
    }
}
