package pe.joedayz;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

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



//
//
//    Flux<Integer> integerFlux =
//        Flux.just(1, 2, 3, 4, 5);
//
//    integerFlux
//        .map(i -> i/(i-3))
//        .map(i -> i*-1)
//        .subscribe(
//            System.out::println,
//            System.out::println
//        );


    //doOnError
//    Flux<Integer> integerFlux =
//        Flux.just(1, 2, 3, 4, 5);
//
//    integerFlux
//        .map(i -> i/(i-3))
//        .doOnError(ArithmeticException.class,
//            e ->
//                System.out.println(
//                    "ArithmeticException: " + e.getMessage()
//                )
//        )
//        .subscribe(System.out::println);
//
//
//    try {
//      int j = j/(j-3);
//    } catch(ArithmeticException e) {
//      System.out.println(
//          "ArithmeticException: " + e.getMessage()
//      );
//      throw e;
//    }

//
//    Flux<Integer> integerFlux =
//        Flux.just(1, 2, 3, 4, 5);
//
//    integerFlux
//        .map(i -> i/(i-3))
//        .doOnError(ArithmeticException.class,
//            e ->
//                System.out.println(
//                    "doOnError: " + e.getMessage()
//                )
//        )
//        .subscribe(
//            System.out::println,
//            System.out::println
//        );


//    Flux<Integer> integerFlux = Flux.just(1, 2, 3, 4, 5);
//
//    integerFlux
//        .map(i -> i/(i-3))
//        .doOnError(ArithmeticException.class,
//            e -> System.out.println(
//                "doOnError: " + e.getMessage()
//            )
//        )
//        .doFinally(signalType ->
//            System.out.println("doFinally: " + signalType)
//        )
//        .subscribe(System.out::println,
//            System.out::println
//        );
//
//
//    try {
//      int z = z/(z-3);
//    } catch(ArithmeticException e) {
//      System.out.println(
//          "ArithmeticException: " + e.getMessage()
//      );
//      throw e;
//    } finally {
//      System.out.println("doFinally: ...");
//    }


//    Flux<Integer> integerFlux =
//        Flux.just(1, 2, 3, 4, 5);
//
//
//    integerFlux
//        .map(i -> i/(i-3))
//        .onErrorReturn(
//            ArithmeticException.class,
//            0
//        )
//        .subscribe(
//            System.out::println,
//            System.out::println
//        );

//
//    Flux<Integer> integerFlux =
//        Flux.just(1, 2, 3, 4, 5);
//    integerFlux
//        .map(i -> i/(i-3))
//        .onErrorReturn(
//            e -> e.getMessage().contains("3"),
//            0
//        )
//        .subscribe(
//            System.out::println,
//            System.out::println
//        );

//    Flux<Integer> integerFlux =
//        Flux.just(1, 2, 3, 4, 5);

//    integerFlux
//        .map(i -> i/(i-3))
//        .onErrorResume(e -> Flux.just(4, 5))
//        .subscribe(System.out::println,
//            System.out::println
//        );

//    integerFlux
//        .onErrorResume(e -> Flux.just(4, 5))
//        .map(i -> i/(i-3))
//        .subscribe(System.out::println,
//            System.out::println
//        );
//    try {
//      int i = i/(i-3);
//    } catch (ArithmeticException e) {
//      throw new RuntimeException(
//          "Unexpected exception", e
//      );
//    }

//    Flux<Integer> integerFlux =
//        Flux.just(1, 2, 3, 4, 5);
//
//    integerFlux
//        .map(i -> i/(i-3))
//        .onErrorResume(e ->
//            Flux.error(
//                new RuntimeException("Unexpected exception", e)
//            )
//        )
//        .subscribe(System.out::println,
//            System.out::println
//        );

//    Flux<Integer> integerFlux =
//        Flux.just(1, 2, 3, 4, 5);
//
//    integerFlux
//        .map(i -> i/(i-3))
//        .onErrorMap(e -> new RuntimeException(
//            "Unexpected exception", e)
//        )
//        .subscribe(System.out::println,
//            System.out::println
//        );

//    Flux<Integer> integerFlux =
//        Flux.just(1, 2, 3, 4, 5);
//
//    integerFlux
//        .map(i -> i/(i-3))
//        .onErrorContinue((e, i) -> {
//          System.out.format(
//              "The value %d caused the exception: %s\n", i, e
//          );
//        })
//        .subscribe(System.out::println,
//            System.out::println
//        );
//
//    Flux<Integer> integerFlux =
//        Flux.just(1, 2, 3, 4, 5);
//
//    integerFlux
//        .map(i -> i/(i-3))
//        .onErrorContinue((e, i) -> {
//          System.out.format(
//              "The value %d caused the exception: %s\n", i, e
//          );
//          throw new RuntimeException(e);
//        })
//        .subscribe(System.out::println,
//            System.out::println
//        );

//    Flux<Integer> integerFlux = Flux.just(1, 2, 3, 4, 5);
//    integerFlux
//        .map(i -> i/(i-3))
//        .onErrorContinue((e, i) -> {
//          System.out.format(
//              "The value %d caused the exception: %s\n", i, e
//          );
//        })
//        .onErrorResume(e -> Mono.just(99))
//        .subscribe(System.out::println,
//            System.out::println
//        );


//    Flux<Integer> integerFlux =
//        Flux.just(1, 2, 3, 4, 5);
//
//    integerFlux
//        .flatMap(val ->
//            Mono.just(val)
//                .map(i -> i/(i-3))
//                .doOnError(
//                    e -> System.out.println(
//                        "Inside exception: " + e
//                    )
//                )
//                .onErrorResume(e -> Mono.empty())
//        )
//        .subscribe(System.out::println,
//            System.out::println
//        );

//    Flux<Integer> integerFlux =
//        Flux.just(1, 2, 3, 4, 5);
//
//    integerFlux
//        .flatMap(val ->
//            Mono.just(val)
//                .map(i -> i/(i-3))
//                .doOnError(e ->
//                    System.out.println(
//                        "Inside exception: " + e
//                    )
//                )
//                .onErrorResume(e -> Mono.empty())
//        )
//        .onErrorContinue((e, i) -> {
//          System.out.format(
//              "The value %d caused the exception: %s\n", i, e
//          );
//        })
//        .subscribe(System.out::println,
//            System.out::println
//        );


    Flux<Integer> integerFlux =
        Flux.just(1, 2, 3, 4, 5);

    integerFlux
        .flatMap(val ->
            Mono.just(val)
                .map(i -> i/(i-3))
                .doOnError(e ->
                    System.out.println(
                        "Inside exception: " + e
                    )
                )
                .onErrorResume(e -> Mono.empty())
                .onErrorStop()
        )
        .onErrorContinue((e, i) -> {
          System.out.format(
              "The value %d caused the exception: %s\n", i, e
          );
        })
        .subscribe(System.out::println,
            System.out::println
        );

  }

//  private static int getValue(int i) throws Exception {
//    if(i < 0) {
//      throw new Exception(
//          "The input value cannot be zero"
//      );
//    }
//    return i * 10;
//  }
}
