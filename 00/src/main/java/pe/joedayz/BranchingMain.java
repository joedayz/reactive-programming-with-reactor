package pe.joedayz;

import reactor.core.publisher.Flux;

public class BranchingMain {

  public static void main(String[] args) {

//    Flux<Integer> integerFlux =
//        Flux.just(1, 2, 3, 4, 5);
//
//    integerFlux
//        //.filter(i -> i > 10)
//        .filter(i->i>4)
//        .defaultIfEmpty(-1)
//        .subscribe(System.out::println);

//    Flux<Integer> integerFlux =
//        Flux.just(1, 2, 3, 4, 5);
//
//    integerFlux
//        .filter(i -> i > 10)
//        .switchIfEmpty(Flux.just(-1, 0, 99))
//        .subscribe(System.out::println);

    Flux<Integer> integerFlux =
        Flux.just(1, 2, 3, 4, 5);

    integerFlux
        .filter(i -> i > 4)
        .switchIfEmpty(Flux.just(-1, 0, 99))
        .subscribe(System.out::println);
  }
}
