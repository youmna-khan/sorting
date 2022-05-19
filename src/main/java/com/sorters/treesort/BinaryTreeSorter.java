package com.sorters.treesort;

import com.exceptions.SorterException;
import com.sorters.binarytree.Sorter;

public class BinaryTreeSorter implements Sorter {

  public BinaryTreeSorter() {
  }

  public int[] sort( int[] input ) throws SorterException {
    int length = input.length;
    //always first element of array
    Node root = new Node( input[ 0 ] );
    //loop through remaining element of array
    for ( int i = 0; i < length; i++ ) {
      addRecursive( root, input[ i ] );
    }

    int[] sorted = new int[ length ];
    int index = fillArray( root, 0, sorted );
    if(index <length){
      throw new SorterException( "Binary tree sort can not handle duplicates" );

    }
    return sorted;
  }

  private Node addRecursive( Node current, int value ) {
    if ( current == null ) {
      return new Node( value );
    }
    if ( value < current.key ) {
      current.leftChild = addRecursive( current.leftChild, value );
    } else if ( value > current.key ) {
      current.rightChild = addRecursive( current.rightChild, value );
    }
    //add error
    return current;
  }
  int fillArray( Node root, int index, int[] input ) {
    if ( root.leftChild != null ) {
      index = fillArray( root.leftChild, index, input );
    }
    input[ index++ ] = root.key;
    if ( root.rightChild != null ) {
      index = fillArray( root.rightChild, index, input );
    }
    return index;

  }
}


