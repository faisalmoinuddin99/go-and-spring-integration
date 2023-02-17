package com.kakashi.reactivedemo.service;

import com.kakashi.reactivedemo.dto.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ResponseService {

    @Autowired
    private WebClient webClient;

    public void getAllUserResponse() {
        Flux<UserResponse> objectFlux = webClient.get()
                .uri("http://localhost:8080/v1/api/users")
                .retrieve()
                .bodyToFlux(UserResponse.class);

        objectFlux.subscribe(
                System.out::println,
                err -> System.out.println(err.getMessage()),
                () -> System.out.println("COMPLETED")
        );

    }

    public void getAllUserObject() {
        Flux<Object> objectFlux = webClient.get()
                .uri("http://localhost:8080/v1/api/users")
                .retrieve()
                .bodyToFlux(Object.class);

        objectFlux.subscribe(
                System.out::println,
                err -> System.out.println(err.getMessage()),
                () -> System.out.println("COMPLETED")
        );

    }

    public void getGoNetflixService() {
        Flux<Object> goNetflixServiceObject = webClient.get()
                .uri("http://localhost:8085/api/movies")
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToFlux(Object.class);


        goNetflixServiceObject.subscribe(
                System.out::println,
                err -> System.out.println(err.getMessage()),
                () -> System.out.println("COMPLETED")
        );


    }

}
