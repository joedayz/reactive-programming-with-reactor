package pe.joedayz.exercises;

import reactor.core.publisher.Flux;

public class Exercise07 {

  public static void main(String[] args) {
    // TODO: Create a Flux of Integer values
    Flux<Integer> flux = Flux.just(10, 11, 12, 13, 14);

    // TODO: Transform Flux
    Flux<String> transformedFlux = flux.map(value -> String.format("0x%08X", value));

    // TODO: Subscribe to the transformed Flux
    transformedFlux.subscribe(System.out::println);
  }
}
