package com.ziar.ds.common;

import java.util.Arrays;
import java.util.stream.Collectors;


public final class Utils {

  public static void swap(final Integer[] array, final int index, final int otherIndex) {
    if (index == otherIndex) {
      return;
    }
    final int temp = array[index];
    array[index] = array[otherIndex];
    array[otherIndex] = temp;
  }

  public static void print(final Integer[] array) {
    System.out.println(Arrays.stream(array).map(String::valueOf).collect(Collectors.joining(" ,")));
  }
}
