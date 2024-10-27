package pe.joedayz.exercises;


import org.reactivestreams.Publisher;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class Exercise03 {

  public static void main(String[] args) {
    //Create a simple Publisher
    Publisher<Integer> publisher = createPublisher();

    //Convert the Publisher to Mono using fromDirect()
    Mono<Integer> mono = Mono.fromDirect(publisher);

    //Subscribe to the Mono and print the result
    mono.subscribe(
        value -> System.out.println("Received: " + value),
        error -> System.err.println("Error: " + error.getMessage()),
        () -> System.out.println("Completed")
    );

  }

  private static Publisher<Integer> createPublisher() {
    //TODO create a Flux Publisher that emits two values
    return Flux.just(1, 2);
  }
}
