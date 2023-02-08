package co.develhope.firstapi1.controllers;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/name")
public class NameController {

    @GetMapping
    public String name(){
        return "Andrea";
    }
    @PostMapping
    public String reversedName() {
        StringBuilder nameReversed = new StringBuilder(name()).reverse();
        return nameReversed.toString();
    }
}
