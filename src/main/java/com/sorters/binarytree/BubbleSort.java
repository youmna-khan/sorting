package com.sorters.binarytree;

public class BubbleSort implements Sorter{
  public int[] sort( int [] input) {
    for ( int i = 0; i < input.length; i++ ) {
// second loop will check the adjacent element in the array.
      for ( int j = i+1; j < input.length; j++ ) {
        // I put print to see how my sorting working.
        if(input[i] > input[j]) {
          int swap = input[i];
          input[i] = input[j];
          input[j] = swap;
        }
      }
    }

    return input;
  }
}
