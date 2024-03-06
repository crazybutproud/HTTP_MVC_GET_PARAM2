package com.example.lessonmvc2.controllers;

//import ch.qos.logback.core.model.Model;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class FirstController { //ПРОБЛЕМА!Данные через get запрос не работают(ниче не происходит)! смотреть 123.html
    @GetMapping("/hello")
    public String helloPage(String name,String surname, Model model) { // передача по url
//        String name = request.getParameter("name");
//        String surname = request.getParameter("surname");
        System.out.println(name);
        System.out.println(surname);
        System.out.println("Здесь");
        model.addAttribute("message", "Hello" + name + surname);
        return "123";
    }

    @GetMapping("/")
    public String indexPage(Model model) {
        model.addAttribute("message", "Нажми на ссылку");
        return "123";
    }
}

//    @GetMapping("/bye")
//    public String byePage() {
//        return "static/bye";
//    }
//}
