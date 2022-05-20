package model.sorters.binarytree;

public class MergeSort implements Sorter {
  Merger merger = new Merger();

//divide and rule: divide array in single element.
  public int[] sort(int[] arr) {
    int midLength = arr.length/2;
    //to handle odd number of elements
    int secondLength = arr.length - midLength;

    //array division is complete. now sort.
    if( arr.length <= 2) {
      if(arr.length==2 && arr[0] > arr[1]) {
        return new int[] {arr[1], arr[0]};
      }
      return arr;
    }
    int[] h1 = new int[ midLength ];
    int[] h2 = new int[ secondLength ];
    System.arraycopy( arr, 0, h1, 0, midLength );
    System.arraycopy( arr, midLength, h2, 0, secondLength );
    h1 = sort( h1 );
    h2 = sort( h2 );
    int[] merged = merger.merge( h1, h2 );


    // for my self to check
//    printArray("h1", h1 );
//    printArray( "h2", h2 );
//    printArray( "merged", merged );
    return merged;
  }

  private void printArray(String prefix,  int[] input ) {
    System.out.print(prefix+ " : ");
    for ( int j : input ) {
      System.out.print(  j + " " );
    }
    System.out.println();
  }

}


