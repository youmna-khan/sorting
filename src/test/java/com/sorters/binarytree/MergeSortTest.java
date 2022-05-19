package com.sorters.binarytree;

import com.exceptions.SorterException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MergeSortTest {

  Sorter mergeSort = new MergeSort();

  @Test
  public void mergeSorter() throws SorterException {
    int[] arr1 = {7, 5, 4, 8};
    int[] output = {4, 5, 7, 8};
    Assertions.assertArrayEquals( output,mergeSort.sort(arr1));
  }

  @Test
  public void mergeSorter2() throws SorterException {
    int[] arr1 = {7, 5, 4, 8, 2, 3, 0,1};
    int[] output = {0,1,2,3,4,5,7,8};
    Assertions.assertArrayEquals( output, mergeSort.sort(arr1));
  }

  @Test
  public void mergeSortWithNegativeElements() throws SorterException {
    int[] arr1 = {7, 5, 4, 8, 2, 3, 0,-1};
    int[] output = {-1, 0,2,3,4,5,7,8};
    Assertions.assertArrayEquals( output, mergeSort.sort(arr1));
  }

  @Test
  public void mergeSortWithOddElements2() throws SorterException {
    int[] arr1 = {7, 5, 4, 8, 2};
    int[] output = {2,4,5,7,8};
    Assertions.assertArrayEquals( output, mergeSort.sort(arr1));
  }

  @Test
  public void duplicatesElements() throws SorterException {
    int[] arr1 = {7, 5, 4, 4,8, 2};
    int[] output = {2,4,4,5,7,8};
    Assertions.assertArrayEquals( output, mergeSort.sort(arr1));
  }



}