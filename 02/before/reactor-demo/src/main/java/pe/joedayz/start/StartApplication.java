package pe.joedayz.start;


import java.util.concurrent.atomic.AtomicInteger;
import reactor.core.publisher.Flux;

public class StartApplication {

  public static void main(String[] args) {
    final AtomicInteger myValue = new AtomicInteger(5);
    Flux<Integer> fluxJust = Flux.just(myValue.get());
    Flux<Integer> fluxDeferred = Flux.defer(() -> Flux.just(myValue.get())); // no necesita que myValue sea final

    myValue.set(10);
    fluxJust.subscribe(System.out::println);
    fluxDeferred.subscribe(System.out::println); // Imprimirá 10, el valor actual en el momento de la suscripción


    Flux<Integer> flux = Flux.range(1, 5);

    flux.subscribe((value)-> System.out.println("1:" +value));

    flux.subscribe((value)-> System.out.println("2:" +value));

  }



}
