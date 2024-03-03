package org.example;

import reactor.core.publisher.Flux;

import java.time.Duration;

public class Operator1 {

    public Flux<Integer> fluxMap() {
        return Flux.range(1,5)
                .map(integer -> integer * 5)
                .log();
    }

    public Flux<Integer> fluxFilter() {
        return Flux.range(1, 10)
                .filter(integer -> integer > 5)
                .log();
    }

    public Flux<Integer> fluxTake() {
        return Flux.range(1, 10)
                .filter(i -> i > 5)
                .take(3)
                .log();
    }

    public Flux<Integer> fluxFlatMap() {
        return Flux.range(1,10)
                .flatMap( i -> Flux.range(i * 10, 10)
                        .delayElements(Duration.ofMillis(100)))
                .log();
    }

}
