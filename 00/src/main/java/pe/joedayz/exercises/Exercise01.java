package pe.joedayz.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class Exercise01 {


  public static void main(String[] args) {

    Mono<String> emptyMono = Mono.empty();
    Flux<String> emptyFlux = Flux.empty();

    Mono<Integer> integerMono = Mono.just(1);
    Flux<Integer> integerFlux = Flux.just(1, 2);


    Mono<Integer> emptyMono1 = Mono.justOrEmpty(Optional.empty());

    Mono<Integer> emptyMono2 = Mono.justOrEmpty(null);

    //Crear Mono y Flux desde otros objetos con métodos from*()
    Mono<Integer> mono1 = Mono.from(integerFlux);
    Mono<Integer> mono2 = Mono.fromDirect(integerFlux); // este aun emite el 2do por detras

    final int[] myValue = {0};

    Mono<Void> objectMono = Mono.fromRunnable(new Runnable() {
      @Override
      public void run() {
        myValue[0]++;
      }
    });

    Mono<Void> runnable2 = Mono.fromRunnable(
        () -> System.out.println("Hello from Runnable")
    );

    Mono<String> futureMonoEager = Mono.fromFuture(CompletableFuture.supplyAsync(
        ()->{
          System.out.println("Eager");
          return "Hello from eager future";
        }
    ));

    Mono<String> futureMonoLazy = Mono.fromFuture(
        ()-> CompletableFuture.supplyAsync( ()->{
          System.out.println("Lazy");
          return "Hello from lazy future";
        }
    ));


    List<Integer> myList = Arrays.asList(1,2, 3);
    Flux<Integer> listFlux = Flux.fromIterable(myList);

    Stream stream = Stream.of(1, 2, 3);
    Flux<Integer> streamFluxOneTime = Flux.fromStream(stream);

    Flux<Integer> streamFluxUseMultipleTimes = Flux.fromStream(() -> Stream.of(1, 2, 3));

    Flux<Integer> fluxDeferred =  Flux.defer( () -> Flux.just(1, 2, 3));

    Mono<Integer> monoDeferred = Mono.defer( () -> Mono.just(getValue()));

    Mono<Integer> monoNotDeferred = Mono.just(getValue());

  }
  private static Integer getValue(){
    System.out.println("getValue()");
    return 1;
  }


}
