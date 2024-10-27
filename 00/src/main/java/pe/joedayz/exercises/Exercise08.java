package pe.joedayz.exercises;

import reactor.core.publisher.Mono;

public class Exercise08 {

  public static void main(String[] args) {
    // TODO: Create a Mono of Integer
    Mono<Integer> mono = Mono.just(5);

    // TODO: Transform the Mono using the method getSquareAsync
    Mono<Integer> transformedMono = mono.flatMap(Exercise08::getSquareAsync);

    // TODO: Subscribe to the transformed Mono
    transformedMono.subscribe(System.out::println);

  }

  private static Mono<Integer> getSquareAsync(Integer value) {
    // TODO: Create a Mono publisher that emits the square of the input number
    return Mono.fromCallable(() -> value * value);
  }
}
