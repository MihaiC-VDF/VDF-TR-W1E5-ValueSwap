package vdf.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

      int x = 10;
      int y = 5;


        System.out.println("X is " + x + " and y is " +y);

      int placeholder = x;
      x = y;
      y = placeholder;

        System.out.println("X is now " + x + " and y is now " +y);

    }
}
