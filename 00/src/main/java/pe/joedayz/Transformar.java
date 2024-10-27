package pe.joedayz;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import org.reactivestreams.Publisher;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class Transformar {


  public static void main(String[] args) throws InterruptedException {
    List<Integer> originalValues = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    List<Integer> newValues = new ArrayList<>();

    //Before
//    int total = 0;
//    for (Integer val : originalValues) { // The map operation
//      if (val % 2 == 0) {              // The filter operation
//        newValues.add(val * 2);
//      }
//    }
//    for (Integer val : newValues) {      // The reduce operation
//      total += val;
//    }
//    System.out.println(total);
//
//    // Function, Predicate, Consumer, Supplier  --> Interfaces funcionales de Java
//
//    //After
//    total = originalValues.stream()
//        .map(val -> val * 2)
//        .filter(val -> val % 2 == 0)
//        .reduce(0, Integer::sum);
//
//    System.out.println(total);

//    Function<String, LocalDate> stringLocalDateFunction =
//        s -> LocalDate.parse(s, DateTimeFormatter.ofPattern("yyyy-MM-dd", Locale.ENGLISH));
//
//    Mono<String> monoString = Mono.just("2024-08-31");
//    Mono<LocalDate> monoDate = monoString.map(stringLocalDateFunction);
//
//    monoDate.subscribe(
//        value -> System.out.println("Received: " + value.format(DateTimeFormatter.ofLocalizedDate(
//            FormatStyle.LONG)))
//    );


//    Function<String, LocalDate> stringToDateImperativeFunction = s -> {
//      if (s != null && s.contains("-")) {
//        return LocalDate.parse(
//            s,
//            DateTimeFormatter.ofPattern(
//                "yyyy-MM-dd",
//                Locale.ENGLISH
//            )
//        );
//      } else {
//        return LocalDate.now();
//      }
//    };
//    Mono<String> monoString2 = Mono.just("2024-08-31");
//    Mono<LocalDate> monoDate2 = monoString2.map(stringToDateImperativeFunction);
//
//    monoDate2.subscribe(
//        value -> System.out.println("Received: " + value.format(DateTimeFormatter.ofLocalizedDate(
//            FormatStyle.LONG)))
//    );


//    Mono<Integer> monoInteger = Mono.just(1).map(i -> i * 2);
//    monoInteger.subscribe(System.out::println);
//
//    Mono<List<Integer>> monoListInteger = Mono.just(1).map(i -> Arrays.asList(1));
//    monoListInteger.subscribe(System.out::println);

//    Mono.just(1)
//        .map(i -> asyncTransformation(i))
//        .map(j -> j*10); //Error de compilación  El tipo de j es Mono<Integer> y no Integer

    Mono<Integer> monoInt = Mono.just(1);
    Mono<String> monoFlat = monoInt.flatMap(i -> Mono.just("i: " + i));
    //monoFlat.subscribe(System.out::println);

    Flux<Integer> fluxInt = Flux.just(1, 2, 3, 4);
    Flux<Integer> fluxFlat = fluxInt.flatMap(i -> transformAsyncMono(i));

    //fluxFlat.subscribe(System.out::println);

    Flux<Integer> fluxInt2 = Flux.just(1, 2, 3, 4);
    Flux<Integer> fluxFlat2 = fluxInt2
        .flatMap(i -> transformAsyncPublisher(i));
    //fluxFlat2.subscribe(System.out::println);

    Flux<Integer> fluxInt3 = Flux.just(1, 2, 3, 4);
    Flux<Integer> fluxFlat3 = fluxInt3
        .flatMap(i -> transformAsyncPublisherDelay(i));
   // fluxFlat3.subscribe(System.out::println);

    Flux<Integer> fluxInt4 = Flux.just(1, 2, 3, 4);
    Flux<Integer> fluxFlat4 = fluxInt4
        .flatMapSequential(i -> transformAsyncPublisherDelay(i));
    fluxFlat4.subscribe(System.out::println);

    Thread.sleep(3000);

//    Flux<String> fluxString = Flux.just("2024-01-01", "2024-02-01", "2024-03-01");
//
//    Flux<LocalDate> fluxDate = fluxString.map(stringLocalDateFunction);
//
//    fluxDate.subscribe(
//        value -> System.out.println("Received: " + value.format(DateTimeFormatter.ofLocalizedDate(
//            FormatStyle.LONG)))
//    );
//
//    Function<String, LocalDate> stringToDateImperativeFunction = s -> {
//      if (s != null && s.contains("-")) {
//        return LocalDate.parse(
//            s,
//            DateTimeFormatter.ofPattern(
//                "yyyy-MM-dd",
//                Locale.ENGLISH
//            )
//        );
//      } else {
//        return LocalDate.now();
//      }
//    };
//    Mono<String> monoString2 = Mono.just("2023-01-01");
//    Mono<LocalDate> monoDate2 = monoString2.map(stringToDateImperativeFunction);
//
//    monoDate2.subscribe(
//        value -> System.out.println("Received: " + value.format(DateTimeFormatter.ofLocalizedDate(
//            FormatStyle.LONG)))
//    );
//
//    Mono<Integer> monoInteger = Mono.just(1).map(i -> i * 2);
//    monoInteger.subscribe(System.out::println);
//
//    Mono<List<Integer>> monoListInteger = Mono.just(1).map(i -> Arrays.asList(1));
//    monoListInteger.subscribe(System.out::println);
//
//
//    System.out.println("----------");
//
////    Mono.just(1)
////        .map(i -> asyncTransformation(i))
////        .map(j -> j*10); //Error de compilación
//
//    Mono<Integer> monoInt = Mono.just(1);
//    Mono<String> monoFlat = monoInt.flatMap(i -> Mono.just("i: " + i));
//    monoFlat.subscribe(System.out::println);
//
//
//    System.out.println("----------");
//
//    Flux<Integer> fluxInt = Flux.just(1, 2, 3, 4);
//    Flux<Integer> fluxFlat = fluxInt.flatMap(i -> transformAsyncMono(i));
//
//    fluxFlat.subscribe(System.out::println);
//
//    System.out.println("----------");
//
//    Flux<Integer> fluxInt2 = Flux.just(1, 2, 3, 4);
//    Flux<Integer> fluxFlat2 = fluxInt2
//        .flatMap(i -> transformAsyncPublisher(i));
//    fluxFlat2.subscribe(System.out::println);
//
//    System.out.println("----------");
//    Flux<Integer> fluxInt3 = Flux.just(1, 2, 3, 4);
//    Flux<Integer> fluxFlat3 = fluxInt3
//        .flatMapSequential(i -> transformAsyncPublisher(i));
//    fluxFlat3.subscribe(System.out::println);


  }

  private static Mono<Integer> transformAsyncMono(Integer i) {
    return i % 2 == 0 ? Mono.just(i) : Mono.just(i * 10);
  }

  public static Publisher<Integer> transformAsyncPublisher(int i) {
    return i % 2 == 0 ? Flux.just(i, i + 1)
        : Mono.just(i * 10);
  }

  public static Publisher<Integer> transformAsyncPublisherDelay(int i) {
    return i % 2 == 0 ? Flux.just(i, i + 1).delayElements(Duration.ofMillis(1))
        : Mono.just(i * 10);
  }

  static Mono<Integer> asyncTransformation(int i) {
    return Mono.just(i);
  }
}
