package pe.joedayz;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.stream.Stream;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

  public static void main(String[] args) throws InterruptedException, ExecutionException {
    Stream.of(1, 2, 3, 4)
        .filter(i -> i> 2)
        .map(i -> i * 100)
        .forEach(System.out::println);

    Stream<Integer> originalStream = Stream.of(1, 2, 3, 4);
    Stream<Integer> filtered = originalStream.filter(i -> i > 2);
    Stream mapped = filtered.map(i -> i * 100);
    mapped.forEach(System.out::println);


//    Future<Double> future = getCalculationFuture();
//
//    while(!future.isDone()){
//      System.out.println("Calculando....");
//      Thread.sleep(500);
//    }
//
//    Double result = future.get();

    Mono<Long> count = Flux.just(1, 2, 3, 4, 5, 6, 7, 8, 9)
        .map(n -> n * 2)
        .skip(1)
        .count();

    System.out.println(count.block());

  }

  private static Future<Double> getCalculationFuture() {
    return null;
  }
}


