package com.sorters.treesort;

public class Node {
  int key;

  String nodeName;

  Node leftChild;

  Node rightChild;

  public Node( int key, String nodeName ) {
    this.key = key;
    this.nodeName = nodeName;
  }

  public Node( int key ) {
    this.key = key;
  }

}


