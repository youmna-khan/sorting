package model.sorters.binarytree;

import model.sorters.exceptions.SorterException;

public interface Sorter {
  int[] sort( int[] inputArray) throws SorterException;
}
