package com.display;

import com.sorters.binarytree.Sorter;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class DisplayManager {

  public static ArrayList<String> getMenuItems(){
    return new ArrayList<>( Arrays.asList("BubbleSorter" , "MergeSort", "BinarySorter"));
  }
  public static void printBeforeSort( Sorter sorter, int[] arrayToSort ){
    System.out.println( "Sorting using the" + sorter );
    System.out.println("Before sorting: \n" + Arrays.toString( arrayToSort));

  }

  public  static void printResult( Sorter sorter, int[] arrayToSort){
    long start = System.nanoTime();
    int [] sortedArray = Sorter.sortArray(arrayToSort);
    long end = System.nanoTime();
    System.out.println(" After sorting: \n"+ Arrays.toString( sortedArray ));
    System.out.println(" Time taken : " + (end -start) + " nano seconds.");
  }

  public static void displaySortChoices(){
    System.out.println( "Enter the number of the sorter you wish to use: ");
    for ( int i = 0; i < getMenuItems().size(); i++ ) {
      System.out.println(i + 1 +"." + getMenuItems().get( i ));

    }
  }
}
