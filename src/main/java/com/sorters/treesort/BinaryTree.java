package com.sorters.treesort;

public class BinaryTree {
  private Node root;
  public BinaryTree( Node root ) {
    this.root = root;
  }
  public void add(int value) {
    root = addRecursive(root, value);
  }
  private Node addRecursive(Node current, int value) {
    if (current == null) {
      return new Node(value);
    }

    if (value < current.key) {
      current.leftChild = addRecursive(current.leftChild, value);
    } else if (value > current.key) {
      current.rightChild = addRecursive(current.rightChild, value);
    }
    return current;
  }

  public boolean containsNode(int value) {
    return containsNodeRecursive(root, value);
  }
  private boolean containsNodeRecursive(Node current, int value) {
    if (current == null) {
      return false;
    }
    if (value == current.key) {
      return true;
    }
    if ( value < current.key ) {
      return containsNodeRecursive( current.leftChild, value );
    }
    return containsNodeRecursive( current.rightChild, value );
  }

}
