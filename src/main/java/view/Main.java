package view;

public class Main {
  public static void main( String[] args ) {
    System.out.println( "Hello world!" );
  }

  public static void printArray(int[] input){
    for ( int j : input ) {
      System.out.print( j + " " + input[j]);
    }
    System.out.println();
  }
}