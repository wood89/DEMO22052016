package io.khasang.demo.Controller;

import io.khasang.demo.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Alexander-PC on 22.05.2016.
 */
@Controller
public class AppController {
    @Autowired
    Message message;

    @RequestMapping("/")
    public String shrink(Model model) {
        model.addAttribute("hello",message.getMesageInfo());
        return "hello";
    }
}
