package com.display;

import com.exceptions.SorterException;
import com.sorters.binarytree.Sorter;
import com.start.SortLoader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;

public class DisplayManager {
  static Logger logger = LogManager.getLogger( DisplayManager.class);
  public static ArrayList<String> getMenuItems(){
    return new ArrayList<>( Arrays.asList("BubbleSorter" , "MergeSort", "BinarySorter"));
  }
  public static void printBeforeSort( Sorter sorter, int[] arrayToSort ){
//    System.out.println( "Sorting using the " + sorter.getClass().getSimpleName() );
//    System.out.println("Before sorting: " + Arrays.toString( arrayToSort));
    logger.info( "Before sorting: " + Arrays.toString( arrayToSort));

  }
  public  static void printResult( Sorter sorter, int[] arrayToSort){
    try {
      int [] sortedArray = sorter.sort(arrayToSort);
      long start = System.nanoTime();
      long end = System.nanoTime();
      String name = sorter.getClass().getSimpleName();
      logger.info( "After sorting: {} ", sortedArray );
      logger.info( " {} took {} nano seconds to sort {} elements" , name, (end -start), sortedArray.length );
    } catch ( SorterException e ) {
      logger.error( e.getMessage() );
    }
//    System.out.println(" After sorting: "+ Arrays.toString( sortedArray ));
//    System.out.println(" Time taken : " + (end -start) + " nano seconds.");
  }
  public static void displaySortChoices(){
    System.out.println( "Enter the number of the sorter you wish to use: ");
    for ( int i = 0; i < getMenuItems().size(); i++ ) {
      System.out.println(i + 1 +"." + getMenuItems().get( i ));
    }
  }
}
