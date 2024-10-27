package pe.joedayz;

import java.time.Duration;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

public class SchedulersAndThreads {

  public static void main(String[] args) throws InterruptedException {

//    Flux.just(1, 2, 3, 4, 5)
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
//        .subscribe(i ->
//            System.out.format(
//                "subscribe(%d) - %s\n",
//                i,
//                Thread.currentThread().getName()
//            )
//        );


//    Flux<Integer> integerFlux =
//        Flux.just(1, 2, 3, 4, 5)
//            .map(i -> {
//              System.out.format(
//                  "map(%d) - %s\n",
//                  i,
//                  Thread.currentThread().getName()
//              );
//              return i * 10;
//            })
//            .flatMap(i -> {
//              System.out.format(
//                  "flatMap(%d) - %s\n",
//                  i,
//                  Thread.currentThread().getName()
//              );
//              return Mono.just(i * 10);
//            });
//
//    Thread myThread = new Thread(() ->
//        integerFlux
//            .subscribe(i ->
//                System.out.format(
//                    "subscribe(%d) - %s\n",
//                    i,
//                    Thread.currentThread().getName()
//                )
//            )
//    );
//
//    myThread.start();
//    myThread.join();


//    Flux.just(1, 2, 3, 4, 5)
//        .map(i -> {
//          System.out.format(
//              "map(%d) - %s\n",
//              i,
//              Thread.currentThread().getName()
//          );
//          return i * 10;
//        })
//        .delayElements(Duration.ofMillis(10))
//        .flatMap(i -> {
//          System.out.format(
//              "flatMap(%d) - %s\n",
//              i,
//              Thread.currentThread().getName()
//          );
//          return Mono.just(i * 10);
//        })
//        .subscribe(i -> System.out.format(
//                "subscribe(%d) - %s\n",
//                i,
//                Thread.currentThread().getName()
//            )
//        );
//    Thread.sleep(1000);

//
//    Flux.just(1, 2, 3, 4, 5)
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
//              Thread.currentThread().getName());
//          return Mono.just(i * 10);
//        })
//        .delaySubscription(
//            Duration.ofMillis(10), Schedulers.boundedElastic()
//        )
//        .subscribe(i -> System.out.format(
//                "subscribe(%d) - %s\n",
//                i,
//                Thread.currentThread().getName()
//            )
//        );
//    Thread.sleep(1000);


//
//    Flux.just(1, 2, 3, 4, 5)
//        .map(i -> {
//          System.out.format("map(%d) - %s\n",
//              i,
//              Thread.currentThread().getName());
//          return i * 10;
//        })
//        .publishOn(
//            Schedulers.newSingle("singleScheduler")
//        )
//        .flatMap(i -> {
//          System.out.format("flatMap(%d) - %s\n",
//              i,
//              Thread.currentThread().getName());
//          return Mono.just(i * 10);
//        })
//        .subscribe(i -> System.out.format(
//                "subscribe(%d) - %s\n",
//                i,
//                Thread.currentThread().getName()
//            )
//        );
//    Thread.sleep(1000);


//    Flux.just(1, 2, 3, 4, 5)
//        .publishOn(
//            Schedulers.newParallel("parallelScheduler")
//        )
//        .map(i -> {
//          System.out.format(
//              "map(%d) - %s\n",
//              i,
//              Thread.currentThread().getName()
//          );
//          return i * 10;
//        })
//        .publishOn(
//            Schedulers.newSingle("singleScheduler")
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



//    Flux.just(1, 2, 3, 4, 5)
//        .map(i -> {
//          System.out.format(
//              "map(%d) - %s\n",
//              i,
//              Thread.currentThread().getName()
//          );
//          return i * 10;
//        })
//        .subscribeOn(
//            Schedulers.newSingle("singleScheduler")
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
//
//    try {
//      Thread.sleep(1000);
//    } catch(Exception e) {}



//    Flux.just(1, 2, 3, 4, 5)
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
//        .subscribeOn(
//            Schedulers.newSingle("singleScheduler")
//        )
//        .subscribe(i -> System.out.format(
//            "subscribe(%d) - %s\n",
//            i,
//            Thread.currentThread().getName())
//        );
//
//    try {
//      Thread.sleep(1000);
//    } catch(Exception e) {}

    Flux.just(1, 2, 3, 4, 5)
        .map(i -> {
          System.out.format(
              "map(%d) - %s\n",
              i,
              Thread.currentThread().getName()
          );
          return i * 10;
        })
        .publishOn(
            Schedulers.newParallel("parallelScheduler")
        )
        .subscribeOn(
            Schedulers.newSingle("singleScheduler")
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

    try {
      Thread.sleep(1000);
    } catch(Exception e) {}

  }

}
