package org.example;

import org.junit.jupiter.api.Test;
import reactor.test.StepVerifier;

import static org.junit.jupiter.api.Assertions.*;

class Scheduler1Test {

    private Scheduler1 scheduler1 = new Scheduler1();
    @Test
    void fluxMapWithSubscribeOn() {
        StepVerifier.create(scheduler1.fluxMapWithSubscribeOn())
                .expectNextCount(10)
                .verifyComplete();
    }

    @Test
    void fluxMapWithPublisherOn() {
        StepVerifier.create(scheduler1.fluxMapWithPublisherOn())
                .expectNextCount(10)
                .verifyComplete();
    }
}