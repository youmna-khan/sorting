package com.start;

import com.exceptions.SorterLoaderException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SorterFactoryTest {

  @Test
  void sorterFactoryTest() throws SorterLoaderException {
    Assertions.assertEquals( "BubbleSort", SorterFactory.getSorter( 1).getClass().getSimpleName() );
    Assertions.assertEquals( "MergeSort",SorterFactory.getSorter( 2).getClass().getSimpleName() );
    //assertEquals( "BinarySorter",SorterFactory.getSorter( 3),getClass().getSimpleName() );


  }




}