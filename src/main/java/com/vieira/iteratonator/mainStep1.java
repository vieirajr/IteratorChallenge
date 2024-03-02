package com.vieira.iteratonator;

import java.util.ArrayList;
import java.util.List;

public class mainStep1 {
  public static void main(String[] args){
    var list1 = List.of(1,1,1,1);
    var list2 = List.of(2,2);
    var list3 = List.of(3,3,3);
    var list4 = List.<Integer>of();

    System.out.println(interleave(list1, list2, list3, list4));

  }

  private static List<Integer> interleave(List<Integer> ... lists) {
    var result = new ArrayList<Integer>();
    var colunm = 0;
    var completed = false;

    while (!completed) {
      completed = true;
      for (int i = 0; i < lists.length; i++) {
        if (lists[i].size() > colunm) {
          result.add(lists[i].get(colunm));
          completed = false;
        }
      }
      colunm++;
    }
    return result;
  }
}
