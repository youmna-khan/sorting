package model.sorters.binarytree;

import model.sorters.exceptions.SorterException;
import view.Main;

public class InsertionSort implements Sorter{

  @Override
  public int[] sort( int[] inputArray ) throws SorterException {
    for ( int i = 0; i < inputArray.length; i++ ) {
      int element = inputArray[ i ];
      int previousIndex = i - 1;
      while ( previousIndex >= 0 && inputArray[ previousIndex ] > element ) {
        inputArray[ previousIndex + 1 ] = inputArray[ previousIndex ];
        previousIndex--;
      }
      inputArray[previousIndex+1]= element;
    }
    //Main.printArray(inputArray);
    return inputArray;

  }
}



