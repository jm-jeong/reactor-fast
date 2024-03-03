package org.example;

public class Main {
    public static void main(String[] args) {
        var pubisher = new Publisher();
//        pubisher.startFlux()
//                .subscribe(System.out::println);

        pubisher.startMono2()
                .subscribe();
    }

}