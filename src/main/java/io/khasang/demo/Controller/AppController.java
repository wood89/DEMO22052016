package io.khasang.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Alexander-PC on 22.05.2016.
 */
@Controller
public class AppController {

    @RequestMapping("/")
    public String shrink(Model model) {
        model.addAttribute("hello","Hello world!");
        return "hello";
    }
}
