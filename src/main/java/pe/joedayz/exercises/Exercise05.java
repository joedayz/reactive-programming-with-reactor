package pe.joedayz.exercises;

import java.util.function.Supplier;
import org.reactivestreams.Publisher;
import reactor.core.publisher.Flux;

public class Exercise05 {

  public static void main(String[] args) {
    //Create a Supplier that provides a Publisher
    Supplier<Publisher<String>> supplier = createPublisherSupplier();

    //TODO use Flux.defer() with the supplier
    Flux<String> flux = Flux.defer(supplier);

    //TODO Subscribe to the Flux
    flux.subscribe(
      value -> System.out.println("Suscriber 1 received: " + value)
    );


    //TODO Subscribe to the Flux again
    flux.subscribe(
        value -> System.out.println("Suscriber 2 received: " + value)
    );


  }


  private static Supplier<Publisher<String>> createPublisherSupplier() {
    return () -> Flux.just("Current time: " + System.currentTimeMillis());
  }
}
