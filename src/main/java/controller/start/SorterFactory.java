package controller.start;

import model.sorters.binarytree.InsertionSort;
import model.sorters.exceptions.SorterLoaderException;
import model.sorters.binarytree.BubbleSort;
import model.sorters.binarytree.MergeSort;
import model.sorters.binarytree.Sorter;
import model.sorters.treesort.BinaryTreeSorter;

public class SorterFactory {

  public static Sorter getSorter( int choice ) throws SorterLoaderException {
    if ( choice == 1 ) {
      return new BubbleSort();
    } else if ( choice == 2 ) {
      return new MergeSort();
    } else if ( choice == 3 ) {
      return new BinaryTreeSorter();
    } else if ( choice ==4 ) {
      return new InsertionSort();

    }
    throw new SorterLoaderException( "Invalid sorter choice " + choice + " " );

  }
}
