package pe.joedayz;

import java.time.Duration;
import java.util.Arrays;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import org.reactivestreams.Publisher;
import reactor.util.function.Tuple2;
import reactor.util.function.Tuple4;

public class OtrosOperadores {


  public static void main(String[] args) {

//    Flux<Number> fluxNumber = Flux.just(1L, 2L, 3L);
//    Flux<Long> fluxLong = fluxNumber.cast(Long.class);
//    fluxLong.subscribe(System.out::println);

    //Te da ClassCastException
//    Flux<Number> fluxString = Flux.just(1L, 2L, 3L);
//    Flux<Integer> fluxInteger = fluxString.cast(Integer.class);
//    fluxInteger.subscribe(System.out::println);

//    Flux<Integer> fluxInt = Flux.just(1, 2, 3, 4);
//    //Flux<Integer> fluxFlat = fluxInt.flatMap(i -> transformAsyncPublisherDelay(i));
//    Flux<Integer> fluxFlat = fluxInt.flatMapSequential(i -> transformAsyncPublisherDelay(i));
//    fluxFlat.subscribe(System.out::println);

//    Flux<Integer> fluxInt = Flux.just(1, 2, 3, 4);
//    Flux<Integer> fluxConcat =
//        fluxInt
//            .concatMap(i -> transformAsyncPublisherDelay(i));
//    fluxConcat.subscribe(System.out::println);
//    Flux<Integer> fluxInt = Flux.just(1, 2, 3, 4);
//    Flux<Integer> fluxSwitch = fluxInt
//        .switchMap(i -> transformAsyncPublisherDelay(i));
//    fluxSwitch.subscribe(System.out::println);

//    Flux<Integer> flux1 = Flux.just(1, 2, 3);
//    Flux<Integer> flux2 = Flux.just(4, 5, 6);
//    Flux<Integer> mergedFlux =
//        Flux.merge(flux1, flux2);
//    mergedFlux.subscribe(System.out::println);

//    Flux<Integer> flux1 = Flux.just(1, 2, 3);
//    Flux<Integer> flux2 = Flux.just(4, 5, 6);
//
//    Flux<Integer> mergedFlux = flux1.mergeWith(flux2);
//    mergedFlux.subscribe(System.out::println);

//    Flux<Integer> flux1 = Flux.just(48, 45, 9);
//    Flux<Integer> flux2 = Flux.just(26, 58, 2);
//
//    Flux<Integer> mergedFlux =
//        Flux.mergeComparing(flux1, flux2);
//    mergedFlux.subscribe(System.out::println);
//
//
//    Flux<Integer> flux1 = Flux.just(10, 20, 30);
//    Flux<Integer> flux2 = Flux.just(40, 50, 60);
//
//    Flux<Integer> mergedFlux = Flux.mergeSequential(flux1, flux2);
//    mergedFlux.subscribe(System.out::println);

//    Flux<Integer> flux1 = Flux.just(10, 20, 30);
//    Flux<Integer> flux2 = Flux.just(40, 50, 60);
//
//    Flux<Integer> concatFlux = Flux.concat(flux1, flux2);
//    concatFlux.subscribe(System.out::println);
//
//    Flux<Integer> flux11 = Flux.just(10, 20, 30);
//    Flux<Integer> flux22 = Flux.just(40, 50, 60);
//
//    Flux<Integer> concatFlux2 = flux11.concatWith(flux2);
//    concatFlux2.subscribe(System.out::println);

//    Flux<Integer> flux1 = Flux.just(1, 2, 3);
//    Flux<Integer> flux2 = Flux.just(4, 5, 6);
//
//    Flux<Tuple2<Integer, Integer>> zippedFlux =
//        Flux.zip(flux1, flux2);
//    zippedFlux.subscribe(System.out::println);

//
//    Flux<Integer> flux1 = Flux.just(1, 2, 3);
//    Flux<Integer> flux2 = Flux.just(4, 5);
//
//    Flux<Tuple2<Integer, Integer>> zippedFlux =
//        Flux.zip(flux1, flux2);
//    zippedFlux.subscribe(System.out::println);

//    Flux<Integer> flux1 = Flux.just(1, 2, 3);
//    Flux<Integer> flux2 = Flux.just(4, 5, 6);
//
//    Flux<Integer> zippedFlux =
//        Flux.zip(flux1, flux2, (i1, i2) -> i1 + i2);
//    zippedFlux.subscribe(System.out::println);

//    Flux<Integer> flux1 = Flux.just(1, 2, 3);
//    Flux<Integer> flux2 = Flux.just(4, 5, 6);
//    Flux<Integer> flux3 = Flux.just(7, 8, 9);
//    Flux<Integer> flux4 = Flux.just(10, 11, 12);
//
//    Flux<
//        Tuple4<
//                    Integer,
//                    Integer,
//                    Integer,
//                    Integer
//                    >
//        > zippedFlux =
//        Flux.zip(flux1, flux2, flux3, flux4);
//    zippedFlux.subscribe(System.out::println);

//
//    Flux<Integer> flux1 = Flux.just(1, 2, 3);
//    Flux<Integer> flux2 = Flux.just(4, 5, 6);
//
//    Flux<Integer> zippedFlux = Flux.zip(
//        (Object[] elements) ->
//            // Turn the array into a stream
//            Arrays.stream(elements)
//                // Cast an element to create an IntStream
//                .mapToInt(e -> (Integer)e)
//                // Add up all the elements in the stream
//                .sum()
//        ,flux1, flux2);
//    zippedFlux.subscribe(System.out::println);

//    Flux<Flux<Integer>> fluxOfFlux = Flux.just(
//        Flux.just(1, 2, 3),
//        Flux.just(4, 5, 6),
//        Flux.just(7, 8, 9)
//    );
//
//    Flux<Integer> zippedFlux = Flux.zip(
//        fluxOfFlux,
//        (Tuple2 tuple) -> {
//          int total = 0;
//          for (int i = 0; i < tuple.size(); i++)
//            total += (int) tuple.get(i);
//          return total;
//        });
//
//    zippedFlux.subscribe(System.out::println);
//
//    Flux<Integer> flux1 = Flux.just(1, 2, 3);
//    Flux<Integer> flux2= Flux.just(4, 5, 6);
//
//    Flux<Tuple2<Integer, Integer>> zippedFlux2 =
//        flux1.zipWith(flux2);
//    zippedFlux2.subscribe(System.out::println);

//    Mono<Integer> monoInt = Mono.fromCallable(() -> {
//      System.out.println("Executing from monoInt...");
//      return 1;
//    });
//
//    Mono<String> monoString = Mono.fromCallable(() -> {
//      System.out.println("Executing from monoString...");
//      return "a";
//    });
//
//    //monoInt.then().subscribe(System.out::println);
//    monoInt.then(monoString).subscribe(System.out::println);

//    Mono<Integer> monoInt = Mono.fromCallable(() -> {
//      System.out.println("Executing from monoInt...");
//      return 1;
//    });
//    Mono<String> monoString = Mono.fromCallable(() -> {
//      System.out.println("Executing from monoString...");
//      return "a";
//    });
//    Mono<Void> monoVoid = Mono.fromRunnable(() -> {
//      System.out.println("Executing from monoVoid...");
//    });
//
//    monoInt.then(monoString).thenEmpty(monoVoid).subscribe(System.out::println);

//    Mono<Integer> monoInt = Mono.fromCallable(() -> {
//      System.out.println("Executing from monoInt...");
//      return 1;
//    });
//    Flux<Double> fluxDouble = Flux.just(1.2, 1.3);
//
//    monoInt.thenMany(fluxDouble).subscribe(System.out::println);

    Mono<Integer> monoInt = Mono.fromCallable(() -> {
      System.out.println("Executing from monoInt...");
      return 1;
    });
    Mono<String> monoString = monoInt.thenReturn("a");

    monoString.subscribe(System.out::println);
  }

  public static Publisher<Integer> transformAsyncPublisherDelay(int i) {
    return i % 2 == 0
        ? Flux.just(i, i+1).delayElements(Duration.ofMillis(100))
        : Mono.just(i * 10);
  }

}
