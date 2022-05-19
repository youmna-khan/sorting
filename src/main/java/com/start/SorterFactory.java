package com.start;

import com.exceptions.SorterLoaderException;
import com.sorters.binarytree.BubbleSort;
import com.sorters.binarytree.MergeSort;
import com.sorters.binarytree.Sorter;
import com.sorters.treesort.BinaryTreeSorter;

public class SorterFactory {

  public static Sorter getSorter( int choice ) throws SorterLoaderException {
    if ( choice == 1 ) {
      return new BubbleSort();
    } else if ( choice == 2 ) {
      return new MergeSort();
    } else if ( choice == 3 ) {
      return new BinaryTreeSorter();
    }
    throw new SorterLoaderException( "Invalid sorter choice " + choice + " " );

  }
}
