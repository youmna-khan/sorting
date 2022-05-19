package com.sorters.binarytree;

import com.exceptions.SorterException;
import com.sorters.treesort.BinaryTreeSorter;
import com.sorters.treesort.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TreeSortTest {

  Sorter binaryTree = new BinaryTreeSorter();
  @Test
  public void shouldSort() throws SorterException {
    int[] input = {4, 9, 0};
    int[] expected = {0, 4, 9};
    ;
    assertArrayEquals(expected,  binaryTree.sort(input));
  }

  @Test
  public void shouldSortWithNegative() throws SorterException {
    int[] input = {4, 9, 0, -1, 7};
    int[] expected = {-1,0,4,7,9};
    assertArrayEquals(expected,  binaryTree.sort(input));
  }

  @Test
  public void shouldThrowExceptionOnDuplicates(){
    int[] input = {4, 9, 7, 4};
    int[] expected = {4, 7, 9, 0};
    SorterException exception = assertThrows( SorterException.class, () -> binaryTree.sort( input ) );
    assertEquals( "Binary tree sort can not handle duplicates",exception.getMessage() );
  }

  @Test
  public void shouldSortWithSingleElement() throws SorterException {
    int[] input = {-1};
    int[] expected = {-1};
    assertArrayEquals(expected,  binaryTree.sort(input));
  }
}