package co.com.julianr0223.expenses_traker.controllers;

import co.com.julianr0223.expenses_traker.entities.Response;
import co.com.julianr0223.expenses_traker.repositories.ExternalAPIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class ExternalAPIController {

    @Autowired
    public ExternalAPIService externalAPIService;

    @GetMapping("/my_get")
    public Mono<Response> myGet() {
        return externalAPIService.result();
    }
}
