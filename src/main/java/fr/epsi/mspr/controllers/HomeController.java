package fr.epsi.mspr.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/home")
    public String index() {
        return "<h1>WESH!</h1>";
    }

}