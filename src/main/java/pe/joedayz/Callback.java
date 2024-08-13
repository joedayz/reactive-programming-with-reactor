package pe.joedayz;

import java.util.ArrayList;
import java.util.List;

interface MyListener {
  void someSomething();
}

class Observer implements MyListener {
  public void someSomething() {
    System.out.println("Observer is notified");
  }
}

class Publisher {
  private List<MyListener> listeners = new ArrayList<MyListener>();

  public void addListener(MyListener listener) {
    listeners.add(listener);
  }

  public void notifySomethingHappened() {
    for (MyListener listener : listeners) {
      listener.someSomething();
    }
  }
}