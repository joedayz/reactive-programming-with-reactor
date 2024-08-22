package pe.joedayz;

import reactor.core.publisher.Flux;

public class ManejandoErrores {

  public static void main(String[] args) {

//    Flux<Integer> integerFlux =
//        Flux.just(1, 2, 3, 4, 5);
//
//    integerFlux
//        .map(i -> i/(i-3))
//        .map(i -> i*-1)
//        .subscribe(System.out::println);

//    Flux<Integer> integerFlux =
//        Flux.just(1, 2, 3, 4, 5);
//
//    integerFlux
//        .filter(i -> i > 10)
//        .switchIfEmpty(
//            Flux.error(
//                new RuntimeException("List must not be empty")
//            )
//        )
//        .subscribe(System.out::println);
    Flux<Integer> integerFlux =
        Flux.just(1, 2, 3, 4, 5);

    integerFlux
        .map(i -> i/(i-3))
        .map(i -> i*-1)
        .subscribe(
            System.out::println,
            System.out::println
        );


  }
}
