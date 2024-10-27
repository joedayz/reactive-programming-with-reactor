package pe.joedayz.start.m2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class Test_01_CreatingSequences {

  @Test
  void example_01_Empty(){
    Mono<String> emptyMono = Mono.empty();
    Flux<String> emptyFlux = Flux.empty();
  }

  @Test
  void example_02_Just(){
    Mono<Integer> integerMono = Mono.just(1);
    Flux<Integer> integerFlux = Flux.just(1, 2, 3);
    //Mono.just(1, 2, 3); // Compilation error
  }

  @Test
  void example_03_Just(){
    Flux<Integer> integerFlux = Flux.just(); //no hay error
    //Mono<Integer> integerMono = Mono.just(); //si hay error
  }

  @Test
  void example_04_JustOrEmpty(){
    Mono<Integer> emptyMono1 = Mono.justOrEmpty(Optional.empty());
    Mono<Integer> emptyMono2 = Mono.justOrEmpty(null);
  }

  @Test
  void example_05_From(){
    Flux<Integer> integerFlux = Flux.just(1, 2);
    Mono<Integer> mono1 = Mono.from(integerFlux);
    Mono<Integer> mono2 = Mono.fromDirect(integerFlux);
  }
  private int myValue = 0;

  @Test
  void example_06_FromRunnable(){
    Mono<Void> runnableMono = Mono.fromRunnable(new Runnable() {
      @Override
      public void run() {
        myValue++;
      }
    });

    Mono<Void> runnableMono2 = Mono.fromRunnable(() -> myValue++);
  }

  @Test
  void example_07_FromFutureEager(){
    Mono<String> futureMonoEager = Mono.fromFuture(CompletableFuture.supplyAsync(() -> {
      System.out.println("Eager");
      return "Hello from eager future!";
    }));
  }

  @Test
  void example_08_FromFutureLazy(){
    Mono<String> futureMonoLazy = Mono.fromFuture(()->CompletableFuture.supplyAsync(() -> {
      System.out.println("Lazy");
      return "Hello from lazy future!";
    }));
  }

  @Test
  void example_09_FromIterable(){
    List<Integer> myList = Arrays.asList(1, 2, 3);
    Flux<Integer> listFlux = Flux.fromIterable(myList);
  }

  @Test
  void example_10_FromStreamOneTime(){
    Stream stream = Stream.of(1, 2, 3);
    Flux<Integer> streamFluxOneTime = Flux.fromStream(stream);
  }

  @Test
  void example_11_FromStreamMultipleTimes(){
    Flux<Integer> streamFluxMultipleTimes = Flux.fromStream(() -> Stream.of(1, 2, 3));
  }

  @Test
  void example_12_Defer(){
    Flux<Integer> fluxDeferreed = Flux.defer(() -> Flux.just(myValue));

  }

}
