package pe.joedayz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BeforeReactor {

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

    List<Integer> newValues = new ArrayList<>();

    int total =0;

    for (Integer val : numbers){  // operacion map
      if(val % 2 == 0) {  //operacion filter
        newValues.add(val * 2);
      }
    }
    System.out.println(Arrays.toString(newValues.toArray()));
    for(Integer val: newValues){  //operacion reduce
      total += val;
    }

    System.out.println("Total: " + total);

    Integer totalReactive = numbers.stream()
        .filter(val -> val % 2 == 0)
        .map(val -> val * 2)
        .peek(val -> System.out.println("Value: " + val))
        .reduce(0, Integer::sum);
    System.out.println("Total reative=" + totalReactive);

  }
}
