package co.com.julianr0223.expenses_traker.repositories;

import co.com.julianr0223.expenses_traker.entities.Response;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class ExternalAPIService {

    RestTemplate restTemplate;

    public ExternalAPIService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public Mono<Response> result() {
        WebClient webClient = WebClient.create("https://api.publicapis.org");

        return webClient.get().uri("/random")
                .header("", "")
                .retrieve()
                .bodyToMono(Response.class);
    }
}

