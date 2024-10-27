package pe.joedayz.exercises;

import java.util.Arrays;
import reactor.core.publisher.Flux;

public class Exercise09 {

  public static void main(String[] args) {

    // TODO: Create a Flux of Integer values
     Flux<Integer> flux = Flux.just(1, 2, 3, 4, 5);

    // TODO: Transform each value emitted by the Flux with the method getNumberAndSquare
    Flux<Integer> transformedFlux = flux.flatMapIterable(Exercise09::getNumberAndSquare);

    // TODO: Subscribe to the transformed Flux
    transformedFlux.subscribe(System.out::println);

  }

  private static Iterable<Integer> getNumberAndSquare(Integer value) {
    return Arrays.asList(value, value * value);
  }
}
