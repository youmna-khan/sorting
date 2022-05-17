package com.sorters.binarytree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergerTest {

  @Test
  public void mergeSortedArray(){
    Merger multiSort = new Merger();
    int[] arr1 = {1,3,5};
    int[] arr2 = {2,4};
    int[] expected = {1,2,3,4,5};

    assertArrayEquals( expected, multiSort.merge(arr1, arr2) );
  }

  @Test
  public void mergeSortedArrayOfEvenLength(){
    Merger multiSort = new Merger();
    int[] arr1 = {1,3,5, 6};
    int[] arr2 = {2,4, 9, 10};
    int[] expected = {1,2,3,4,5,6,9,10};

    assertArrayEquals( expected, multiSort.merge(arr1, arr2) );
  }

}