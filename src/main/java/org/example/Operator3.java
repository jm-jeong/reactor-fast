package org.example;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class Operator3 {

    public Mono<Long> monoCount() {
        return Flux.range(1, 10)
                .count()
                .log();
    }

    public Flux<String> fluxDistinct() {
        return Flux.just("a", "b" , "a" , "b" , "c")
                .distinct()
                .log();
    }

    public Mono<Integer> fluxReduce() {
        return Flux.range(1, 10)
                .reduce(((integer, integer2) -> integer + integer2))
                .log();
    }

    public Flux<Integer> fluxGroupBy() {
        return Flux.range(1, 10)
                .groupBy(i -> (i % 2 == 0) ? "even" : "odd")
                .flatMap(group -> group.reduce((i,j) -> i+j))
                .log();
    }






}
