package pe.joedayz;

import java.time.Duration;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


public class FilterMain {

  public static void main(String[] args) {
//    Flux<Integer> integerFlux =
//        Flux.just(1, 2, 3, 4, 5, 6);
//
//    Flux<Integer> filteredFlux =
//        integerFlux.filter(i -> i % 2 == 0);
//        //integerFlux.filter(i -> i>100);
//
//    filteredFlux.subscribe(System.out::println);

//    Flux<Integer> integerFlux =
//        Flux.just(1, 2, 3, 4, 5, 6);
//
//    integerFlux
//        .filterWhen(i -> Mono.just(i % 2 == 0))
//        .subscribe(System.out::println);


//    Flux<Integer> integerFlux =
//        Flux.just(1, 2, 3, 4, 5, 6);
//
//    integerFlux
//        .filterWhen(i -> Mono.just(false))
//        //.filterWhen(i -> Mono.empty()) // Same as false
//        .subscribe(System.out::println);

//    Flux<Integer> integerFlux =
//        Flux.just(1, 2, 3, 4, 5, 6);
//
//    integerFlux
//        .filterWhen(i -> Flux.just(i < 6, i % 2 == 0))
//        .subscribe(System.out::println);
//
//    Flux<Integer> integerFlux =
//        Flux.just(1, 2, 3, 1, 4, 2);
//
//    integerFlux
//        .distinct()
//        .subscribe(System.out::println);

//
//    Flux<Integer> integerFlux =
//        Flux.just(1, 1, 1, 2, 3, 3, 4, 2);
//
//    integerFlux
//        .distinctUntilChanged()
//        .subscribe(System.out::println);

//    Flux<Integer> integerFlux =
//        Flux.just(1, 2, 3, 4, 5);
//
//    integerFlux
//        .take(2)
//        .subscribe(System.out::println);

//    Flux<Integer> integerFlux =
//        Flux.just(1, 2, 3, 4, 5);
//
//    integerFlux
//        .delayElements(Duration.ofMillis(1))
//        .take(Duration.ofMillis(10))
//        .subscribe(System.out::println);
//
//    try {
//      Thread.sleep(100);
//    } catch (InterruptedException e) {
//      e.printStackTrace();
//    }

//    Flux<Integer> integerFlux =
//        Flux.just(1, 2, 3, 4, 5);
//
//    integerFlux
//        .delayElements(Duration.ofMillis(10))
//        .takeUntilOther(
//            Mono.just(10)
//                .delayElement(Duration.ofMillis(5))
//        )
//        .subscribe(System.out::println);
//
//    try {
//      Thread.sleep(100);
//    } catch (InterruptedException e) {
//      e.printStackTrace();
//    }

//    Flux<Integer> integerFlux =
//        Flux.just(1, 2, 3, 4, 5);
//
//    integerFlux
//        .takeUntil(i -> i == 3)
//        .subscribe(System.out::println);


//    Flux<Integer> integerFlux =
//        Flux.just(1, 2, 3, 4, 5);
//
//    integerFlux
//        .takeWhile(i -> i < 4)
//        .subscribe(System.out::println);

//    Flux<Integer> integerFlux =
//        Flux.just(1, 2, 3, 4, 5);
//
//    integerFlux
//        .skip(2)
//        .subscribe(System.out::println);
//
//    Flux<Integer> integerFlux =
//        Flux.just(1, 2, 3, 4, 5);
//
//    integerFlux
//        .delayElements(Duration.ofMillis(1))
//        .skip(Duration.ofMillis(5))
//        .subscribe(System.out::println);
//
//    try {
//      Thread.sleep(100);
//    } catch (InterruptedException e) {
//      e.printStackTrace();
//    }

//    Flux<Integer> integerFlux =
//        Flux.just(1, 2, 3, 4, 5);
//
//    integerFlux
//        .delayElements(Duration.ofMillis(10))
//        .skipUntilOther(
//            Mono.just(10).delayElement(Duration.ofMillis(5))
//        )
//        .subscribe(System.out::println);
//
//    try {
//      Thread.sleep(100);
//    } catch (InterruptedException e) {
//      e.printStackTrace();
//    }

//    Flux<Integer> integerFlux =
//        Flux.just(1, 2, 3, 4, 5);
//
//    integerFlux
//        .skipUntil(i -> i == 3)
//        .subscribe(System.out::println);

    Flux<Integer> integerFlux =
        Flux.just(1, 2, 3, 4, 5);

    integerFlux
        .skipWhile(i -> i < 4)
        .subscribe(System.out::println);
  }
}
