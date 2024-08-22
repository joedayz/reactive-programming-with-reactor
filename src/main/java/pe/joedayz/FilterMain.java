package pe.joedayz;

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


    Flux<Integer> integerFlux =
        Flux.just(1, 1, 1, 2, 3, 3, 4, 2);

    integerFlux
        .distinctUntilChanged()
        .subscribe(System.out::println);


  }
}
