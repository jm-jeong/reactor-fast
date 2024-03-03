package org.example;

import org.junit.jupiter.api.Test;
import reactor.test.StepVerifier;

import static org.junit.jupiter.api.Assertions.*;

class Operator1Test {
    private Operator1 operator1 = new Operator1();

    @Test
    void fluxMap() {
        StepVerifier.create(operator1.fluxMap())
                .expectNext(5,10,15,20,25)
                .verifyComplete();
    }

    @Test
    void fluxFilter() {
        StepVerifier.create(operator1.fluxFilter())
                .expectNext(6,7,8,9,10)
                .verifyComplete();
    }

    @Test
    void fluxTake() {
        StepVerifier.create(operator1.fluxTake())
                .expectNext(6,7,8)
                .verifyComplete();
    }

    @Test
    void fluxFlatMap() {
        StepVerifier.create(operator1.fluxFlatMap())
                .expectNextCount(100)
                .verifyComplete();
    }
}