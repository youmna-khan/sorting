package sorting.modeltests;

import model.sorters.binarytree.InsertionSort;
import model.sorters.exceptions.SorterException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSortTest {

  @Test
  public void sortArray() throws SorterException {
    InsertionSort insertionSort = new InsertionSort();
    int [] arr = {1,4,6,3,5,2};
    int[] actualArray =  {1,2,3,4,5,6};
    Assertions.assertArrayEquals( actualArray,insertionSort.sort( arr ));
  }
}