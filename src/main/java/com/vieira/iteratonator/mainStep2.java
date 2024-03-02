package com.vieira.iteratonator;

import java.util.ArrayList;
import java.util.List;

public class mainStep2 {
  public static void main(String[] args){
    var list1 = new ListIterator(List.of(1,1,1,1));
    var list2 = new ListIterator(List.of(2,2));
    var list3 = new ListIterator(List.of(3,3,3));
    var list4 = new ListIterator(List.<Integer>of());

    System.out.println(interleave(list1, list2, list3, list4));

  }

  private static List<Integer> interleave(ListIterator ... lists) {
    var result = new ArrayList<Integer>();
    var completed = false;

    while (!completed) {
      completed = true;
      for (int i = 0; i < lists.length; i++) {
        if (lists[i].hasNext()) {
          result.add(lists[i].next());
          completed = false;
        }
      }
    }
    return result;
  }
}

