package org.yassine.gateway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class FallbackController{

@RequestMapping("/contactInfo")
public Mono<String> contactSupport(){
    return Mono.just("Please contact the support team because the product service is down");
}
}