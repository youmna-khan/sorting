package model.sorters.binarytree;

public class Merger  {
  public int[] merge( int[] a, int[] b ) {

    int indexOfA = 0;
    int indexOfB = 0;

    int totalLength = a.length + b.length;
    int[] merged = new int[totalLength];

    int mergedIndex = 0;
//    for ( int i = 0; i < totalLength ; i++ ) {
    //
    //{1,2} should only do 2 times
    while(indexOfA < a.length && indexOfB < b.length){
      //if A is smaller
      if(a[indexOfA] < b[indexOfB]) {
        //putting A in output
        merged[mergedIndex] = a[indexOfA];
        indexOfA++;
        //if B is smaller
      } else {
        //putt B in output
        merged[mergedIndex] = b[indexOfB];
        indexOfB++;
      }
      mergedIndex++;
//      Main.printArray( merged );
    }

    while(indexOfA < a.length) {
      merged[mergedIndex] = a[indexOfA];
      indexOfA++;
      mergedIndex++;
    }

    while(indexOfB < b.length ) {
      merged[mergedIndex] = b[indexOfB];
      indexOfB++;
      mergedIndex++;
    }

//    Main.printArray( merged );
    return merged;
  }


}
