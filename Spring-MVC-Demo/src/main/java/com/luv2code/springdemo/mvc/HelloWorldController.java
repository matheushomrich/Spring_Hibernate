package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

    //metodo inicial do html

    @RequestMapping("/showForm")
    public String ShowForm() {
        return "helloworld-form";
    }

    //metodo pra processar a forma HTML

    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }

    // metodo para ler e adiocionar dados a uma model

    @RequestMapping("/processFormTwo")
    public String gritandoCaps(HttpServletRequest request, Model model) {

        // pegar o nome via parametro do HTML
        String nome = request.getParameter("StudentName");

        // uppercase

        nome = nome.toUpperCase();

        String result = "Yo" + nome;

        model.addAttribute("message", result);
        return  "helloworld";
    }

    @RequestMapping("/processFormThree")
    public String gritandoCapsTwo(@RequestParam("StudentName") String nome, Model model) {
        // uppercase

        nome = nome.toUpperCase();

        String result = "Yo Bro, we getting the param via requestParam! " + nome;

        model.addAttribute("message", result);
        return  "helloworld";
    }

}
