package sorting.view;

import model.sorters.binarytree.BubbleSort;
import model.sorters.binarytree.MergeSort;
import model.sorters.binarytree.Sorter;
import org.junit.jupiter.api.Test;
import view.DisplayManager;

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