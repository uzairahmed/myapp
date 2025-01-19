package com.uzair.myapp.coderbyte.service;

import com.uzair.myapp.coderbyte.model.User;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class UserService {

    private final WebClient webClient;

    private static final String API_URL = "https://gorest.co.in/public/v2/users";
    private static final String ACCESS_TOKEN = "9f6aea054f7a44a78676c5488a6d3f6dcbc9c94469ccb509c69f347d12e00225";

    public UserService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl(API_URL).build();
    }

    public Mono<User> createUser(User user) {
        return webClient
                .method(HttpMethod.POST)
                .uri("")
                .header(HttpHeaders.AUTHORIZATION, "Bearer " + ACCESS_TOKEN)
                .header(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE)
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .bodyValue(user)
                .retrieve()
                .bodyToMono(User.class);
    }
}
