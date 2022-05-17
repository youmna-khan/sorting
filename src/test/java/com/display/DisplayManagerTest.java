package com.display;

import com.sorters.binarytree.BubbleSort;
import com.sorters.binarytree.MergeSort;
import com.sorters.binarytree.Sorter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DisplayManagerTest {

  @Test
  public void test(){
    Sorter sorter = new BubbleSort();
    DisplayManager.printBeforeSort( sorter,new int[]{9,2,1,3,4,5,6,8,7} );
    DisplayManager.printResult( sorter,new int[]{1,2,3,4,5,6,7,8,9} );
    DisplayManager.displaySortChoices();

  }
  @Test
   void mergeSorter(){

    MergeSort sorter = new MergeSort();
    DisplayManager.printBeforeSort( sorter,new int[]{9,2,1,3,4,5,6,8,7} );
    DisplayManager.printResult( sorter,new int[]{1,2,3,4,5,6,7,8,9} );

  }




}