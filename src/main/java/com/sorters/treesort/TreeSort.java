package com.sorters.treesort;


public class TreeSort {

  Node root;

  public void addNode(int key) {
    Node newNode = new Node(key);

  }

  public void addNote(int key, String name){
    Node newNode = new Node(key, name);
    if(root ==null){
      root = newNode;
    } else {
      Node focusNode = root;
      Node parent;
      while ( true ){
        parent = focusNode;

        if(key< focusNode.key){
          //for the left child
          focusNode = focusNode.leftChild;
          if (focusNode==null  ){
            parent.leftChild= newNode;
            return;

          }
          // for the right child
        } else { focusNode = focusNode.rightChild;



        }
      }

    }





  }


  public void insert( int input ) {

  }

  public void insertArr( int[] input ) {

  }
}
