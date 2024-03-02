package com.vieira.iteratonator;

import java.util.ArrayList;
import java.util.List;

public class mainStep3 {
  public static void main(String[] args){
    var iterator1 = new ListIterator(List.of(1,1,1,1));
    var iterator2 = new RangeIterator(5,8);
    var iterator3 = new EvenIterator(5,11);
    var iterator4 = new ListIterator(List.<Integer>of());

    System.out.println(interleave(iterator1, iterator2, iterator3, iterator4));

  }

  private static List<Integer> interleave(Iterator ... iterators) {
    var result = new ArrayList<Integer>();
    var completed = false;

    while (!completed) {
      completed = true;
      for (int i = 0; i < iterators.length; i++) {
        if (iterators[i].hasNext()) {
          result.add(iterators[i].next());
          completed = false;
        }
      }
    }
    return result;
  }
}

