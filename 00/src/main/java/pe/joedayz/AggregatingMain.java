package pe.joedayz;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class AggregatingMain {

  public static void main(String[] args) {
//    Flux<Integer> integerFlux =
//        Flux.just(1, 2, 3);
//
//    integerFlux
//        .reduce(10, (a, b) -> {
//          int result = a + b;
//          System.out.format(
//              "[%d + %d] = %d\n", a, b, result
//          );
//          return result;
//        })
//        .subscribe(System.out::println);

//    Flux<Integer> integerFlux =
//        Flux.just(1, 2, 3);
//
//    integerFlux
//        .reduce((a, b) -> {
//          int result = a + b;
//          System.out.format(
//              "[%d + %d] = %d\n", a, b, result
//          );
//          return result;
//        })
//        .subscribe(System.out::println);
//
//    Flux<Integer> integerFlux =
//        Flux.just(1, 2, 3);
//
//    integerFlux
//        .reduceWith(() -> 10, (a, b) -> {
//          int result = a + b;
//          System.out.format(
//              "[%d + %d] = %d\n", a, b, result
//          );
//          return result;
//        })
//        .subscribe(System.out::println);

//    Flux<Integer> integerFlux =
//        Flux.just(1, 2, 3);
//
//    integerFlux
//        .scan(10, (a, b) -> a + b)
//        .subscribe(System.out::println);

//    Flux<Integer> integerFlux =
//        Flux.just(1, 2, 3);
//
//    integerFlux
//        .scan((a, b) -> a + b)
//        .subscribe(System.out::println);

//
//    Flux<Integer> integerFlux =
//        Flux.just(1, 2, 3);
//
//    integerFlux
//        .scanWith(() -> 10, (a, b) -> a + b)
//        .subscribe(System.out::println);

//    Flux<Integer> integerFlux =
//        Flux.just(11, 22, 33, 34);
//
//    Mono<Map<Integer, Integer>> monoMap =
//        integerFlux.collectMap(
//            i -> i / 10,
//            i -> i % 10
//        );
//
//    monoMap.subscribe(System.out::println);

//    Flux<Integer> integerFlux =
//        Flux.just(11, 22, 33, 34);
//
//    Mono<Map<Integer, Collection<Integer>>> monoMap =
//        integerFlux.collectMultimap(
//            i -> i / 10,
//            i -> i % 10
//        );
//
//    monoMap.subscribe(System.out::println);

//    Flux<Integer> integerFlux =
//        Flux.just(1, 2, 3);
//
//    Mono<List<Integer>> monoSortedList =
//        integerFlux.collectSortedList(
//            Comparator.reverseOrder()
//        );
//
//    monoSortedList.subscribe(System.out::println);


//    Mono<Integer> integerMono =
//        Mono.just(1);
//
//    integerMono
//        .filter(i -> i > 1)
//        .hasElement()
//        .subscribe(System.out::println);

//    Flux<Integer> integerFlux =
//        Flux.just(1, 2, 3);
//
//    integerFlux
//        .filter(i -> i > 2)
//        .hasElement(3)
//        .subscribe(System.out::println);

//    Flux<Integer> integerFlux =
//        Flux.just(1, 2, 3);
//
//    integerFlux
//        .all(i -> i > 2)
//        .subscribe(System.out::println);

//    Flux<Integer> integerFlux =
//        Flux.just(1, 2, 3);
//
//    integerFlux
//        .any(i -> i % 2 == 0)
//        .subscribe(System.out::println);

    Flux<Integer> integerFlux =
        Flux.just(1, 2, 3, 4, 5);

    Mono<Long> integerMono = integerFlux.count();
    integerMono.subscribe(System.out::println);
  }


}
