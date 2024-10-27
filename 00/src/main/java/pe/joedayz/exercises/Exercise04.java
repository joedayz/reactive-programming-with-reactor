package pe.joedayz.exercises;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import reactor.core.publisher.Mono;

public class Exercise04 {

  public static void main(String[] args) {

    CompletableFuture<String> future = createCompletableFuture();

    //TODO convert the CompletableFuture to a Mono using fromFuture()
    Mono<String> mono = Mono.fromFuture(future);

    //TODO Subscribe to the Mono
    mono.subscribe(
      value -> System.out.println("Received: " + value),
      error -> System.err.println("Error: " + error.getMessage()),
      () -> System.out.println("Completed")
    );

  }


  private static CompletableFuture<String> createCompletableFuture() {
    ExecutorService executor = Executors.newSingleThreadExecutor();
    return CompletableFuture.supplyAsync(() -> "Hi!", executor);
  }
}
