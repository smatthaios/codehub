package gr.codehub.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/greeting")
public class GreetingController {

    @Value("${welcome.message}")
    private String message = "Hello World";

    @GetMapping("")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("message", this.message);
        model.addAttribute("name", "");
        return "index";
    }
}
