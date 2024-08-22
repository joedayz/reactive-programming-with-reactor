package pe.joedayz;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class HooksMain {

  public static void main(String[] args) {

//    Flux.just(1, 2, 3)
//        .log()
//        .subscribe(System.out::println);


//    Mono.just(1)
//        .log()
//        .doOnSuccess(
//            i -> System.out.println(
//                "Mono completed successfully: " + i)
//        )
//        .subscribe();

//    Flux.just(1, 2, 3)
//        .log()
//        .doOnComplete(
//            () -> System.out.println(
//                "Flux completed successfully")
//        )
//        .subscribe();

    Flux.just(1, 2, 3)
        .log()
        .doOnSubscribe(
            subscription ->
                System.out.println("doOnSubscribe: "
                    + subscription)
        )
        .doOnRequest(
            l ->
                System.out.println("doOnRequest: "
                    + l)
        )
        .doFirst(
            () ->
                System.out.println("doFirst")
        )
        .doOnNext(
            i ->
                System.out.println("doOnNext: "
                    + i)
        )
        .doOnEach(
            integerSignal ->
                System.out.println("doOnEach: "
                    + integerSignal)
        )
        .doFinally(
            signalType ->
                System.out.println("doFinally: "
                    + signalType)
        )
        .doAfterTerminate(
            () ->
                System.out.println("doAfterTerminate")
        )
        .doOnComplete(
            () ->
                System.out.println("doOnComplete")
        )
        .doOnTerminate(
            () ->
                System.out.println("doOnTerminate")
        )
        .subscribe();
  }
}
