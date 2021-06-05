package co.com.julianr0223.BankAccount.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello everybody MOD";
    }
}
