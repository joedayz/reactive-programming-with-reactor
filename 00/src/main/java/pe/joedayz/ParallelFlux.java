package pe.joedayz;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

public class ParallelFlux {

  public static final int SMALL_BUFFER_SIZE =
      Math.max(16,
          Integer.parseInt(
              System.getProperty("reactor.bufferSize.small", "256")
          )
      );

  public static void main(String[] args) throws InterruptedException {


//    Flux.just(1, 2, 3, 4, 5)
//        .parallel()
//        .subscribe(i -> System.out.format(
//            "subscribe(%d) - %s\n",
//            i,
//            Thread.currentThread().getName())
//        );


//    Flux.just(1, 2, 3, 4, 5)
//        .parallel()
//        .runOn(
//            Schedulers.parallel()
//        )
//        .map(i -> {
//          System.out.format(
//              "map(%d) - %s\n",
//              i,
//              Thread.currentThread().getName());
//          return i * 10;
//        })
//        .flatMap(i -> {
//          System.out.format(
//              "flatMap(%d) - %s\n",
//              i,
//              Thread.currentThread().getName()
//          );
//          return Mono.just(i * 10);
//        })
//        .subscribe(i -> System.out.format(
//            "subscribe(%d) - %s\n",
//            i,
//            Thread.currentThread().getName())
//        );
//    Thread.sleep(1000);

//    Flux.just(1, 2, 3, 4, 5)
//        .parallel()
//        .map(i -> {
//          System.out.format(
//              "map(%d) - %s\n",
//              i,
//              Thread.currentThread().getName()
//          );
//          return i * 10;
//        })
//        .runOn(
//            Schedulers.parallel()
//        )
//        .flatMap(i -> {
//          System.out.format(
//              "flatMap(%d) - %s\n",
//              i,
//              Thread.currentThread().getName()
//          );
//          return Mono.just(i * 10);
//        })
//        .subscribe(i -> System.out.format(
//            "subscribe(%d) - %s\n",
//            i,
//            Thread.currentThread().getName())
//        );
//    Thread.sleep(1000);
//
//    Flux.just(1, 2, 3, 4, 5)
//        .parallel(2)
//        .runOn(
//            Schedulers.parallel()
//        )
//        .map(i -> {
//          System.out.format(
//              "map(%d) - %s\n",
//              i,
//              Thread.currentThread().getName()
//          );
//          return i * 10;
//        })
//        .flatMap(i -> {
//          System.out.format(
//              "flatMap(%d) - %s\n",
//              i,
//              Thread.currentThread().getName()
//          );
//          return Mono.just(i * 10);
//        })
//        .subscribe(i -> System.out.format(
//            "subscribe(%d) - %s\n",
//            i,
//            Thread.currentThread().getName())
//        );
//    Thread.sleep(1000);

    Flux.just(1, 2, 3, 4, 5)
        .parallel()
        .runOn(
            Schedulers.parallel()
        )
        .map(i -> {
          System.out.format(
              "map(%d) - %s\n",
              i,
              Thread.currentThread().getName()
          );
          return i * 10;
        })
        .sequential()
        .publishOn(
            Schedulers.boundedElastic()
        )
        .flatMap(i -> {
          System.out.format(
              "flatMap(%d) - %s\n",
              i,
              Thread.currentThread().getName()
          );
          return Mono.just(i * 10);
        })
        .subscribe(i -> System.out.format(
            "subscribe(%d) - %s\n",
            i,
            Thread.currentThread().getName())
        );
    Thread.sleep(1000);
  }
}
