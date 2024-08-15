package pe.joedayz.exercises;

import reactor.core.publisher.Flux;

public class Exercise10 {

  public static void main(String[] args) {
    // TODO: Create a Flux of Integer values
    Flux<Integer> flux = Flux.just(1, 2, 3, 4, 5);
    // TODO: Use a map operator to triple each emitted value
    // TODO: A `flatMap` operator to create a new `Flux` that emits the tripled value and its square.
    // TODO: Subscribe to the transformed Flux
    flux.map(value -> value * 3)
        .flatMap(value -> Flux.just(value, value * value))
        .subscribe(System.out::println);

  }
}
