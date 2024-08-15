package pe.joedayz.exercises;

import org.reactivestreams.Subscription;
import reactor.core.publisher.BaseSubscriber;
import reactor.core.publisher.Flux;

public class Exercise06 {

  public static void main(String[] args) {
    //Create a simple flux that emits values
    Flux<Integer> flux = Flux.just(1, 2, 3);

    //Create a custom BaseSubscriber
    CustomBaseSubscriber<Integer> customBaseSubscriber = new CustomBaseSubscriber<>();

    //Subscribt to the flux using the custom BaseSubscriber
    flux.subscribe(customBaseSubscriber);
  }
}

class CustomBaseSubscriber<T> extends BaseSubscriber<T>{

  @Override
  protected void hookOnSubscribe(Subscription subscription) {
    System.out.println("Subscribed");
    request(1);
  }

  @Override
  protected void hookOnNext(T value) {
    System.out.println("Received: " + value);
    request(1);
  }


  @Override
  protected void hookOnError(Throwable throwable) {
    System.err.println("Error: " + throwable);
  }


  @Override
  protected void hookOnComplete() {
    System.out.println("Completed");
  }
}
