package com.example.demowebnew;

import com.ccc.starterddd.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class t {
    @Autowired
    private PersonService personService;

    @GetMapping("/t")
    public String testo() {
        return personService.autoIntegrationStarterAndRunMethod();
    }
}
