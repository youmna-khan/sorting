package com.start;

import com.display.DisplayManager;
import com.sorters.binarytree.Sorter;
import com.exceptions.SorterLoaderException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SortLoader {

  static Logger logger = LogManager.getLogger(SortLoader.class);
  public static void start() {
    try {
      DisplayManager.displaySortChoices();
      Sorter sorter = SorterFactory.getSorter( scanner.nextInt() );
      System.out.println( "Enter size of array you want to generate" );
      int[] arrayToStart = createArray( scanner.nextInt() );
      logger.info( "The initial array before sorting {} ", Arrays.toString(arrayToStart) );
      DisplayManager.printBeforeSort( sorter, arrayToStart );
      DisplayManager.printResult( sorter, arrayToStart );

    } catch ( SorterLoaderException e ) {
      logger.error( e.getMessage() );
    }
  }
  private final static Scanner scanner = new Scanner( System.in );

  private static int[] createArray( int size ) {
    int[] unsortedArray = new int[ size ];

    Random random = new Random();

    for ( int i = 0; i < size; i++ ) {
      unsortedArray[ i ] = random.nextInt(size*10);

    }
    return unsortedArray;
  }

}
