package sorting.controllertests;

import model.sorters.exceptions.SorterLoaderException;
import controller.start.SorterFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SorterFactoryTest {

  @Test
  void sorterFactoryTest() throws SorterLoaderException {
    Assertions.assertEquals( "BubbleSort", SorterFactory.getSorter( 1).getClass().getSimpleName() );
    Assertions.assertEquals( "MergeSort",SorterFactory.getSorter( 2).getClass().getSimpleName() );
    Assertions.assertEquals( "BinaryTreeSorter",SorterFactory.getSorter( 3).getClass().getSimpleName() );
    Assertions.assertEquals( "InsertionSort",SorterFactory.getSorter( 4).getClass().getSimpleName() );
  }




}