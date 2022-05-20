package sorting.modeltests;

import model.sorters.binarytree.BubbleSort;
import model.sorters.binarytree.Merger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

  @Test
  public void shouldSort(){
    BubbleSort sorting = new BubbleSort();
    int [] arr = {9, 3, 4, -1, 0, 50 , 90, 38, 8};
    int [] output = {-1,0,3,4,8,9,38, 50,90};

    assertArrayEquals( output, sorting.sort( arr ) );

  }

 /* @Test
  public void sortTwoArray(){
    DontKnowWhatIWasDoing multiSort = new DontKnowWhatIWasDoing();
    int[] arr1 = {1,3,5,9,10};
    int[] arr2 = {2,4,0};
    int[] expected = {0,1,2,3,4,5,9,10};

    assertArrayEquals( expected, multiSort.sort(arr1, arr2) );
  }*/

  @Test
  public void mergeSortedArray(){
    Merger multiSort = new Merger();
    int[] arr1 = {1,3,5};
    int[] arr2 = {2,4};
    int[] expected = {1,2,3,4,5};

    assertArrayEquals( expected, multiSort.merge(arr1, arr2) );
  }


  //Take two sorted arrays as input and combine them into one sorted array.
  //It's important to note that there are no helper methods in Java to
  // concatenate two arrays as arguably arrays should be immutable and
  // therefore we need to create a new array, cycle through both arrays and add to our new array.

}