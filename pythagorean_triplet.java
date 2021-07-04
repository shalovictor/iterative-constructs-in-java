/*
For every natural number m>1; 2m, m^2 -1, m^2 +1 form a Pythagorean triplet

This program takes m as input and prints the pythagorean triplet

*/

import java.util.Scanner;
import java.lang.Math;

public class pythagorean_triplet
{
  public static void main(String args[])
  {
    int m;
    System.out.println("Please enter a natural number (m)");
    Scanner keyboard = new Scanner(System.in);
    m = keyboard.nextInt();
    System.out.print("2m=" + (2*m));
    System.out.print(", m^2 - 1="+ int(Math.pow(m,2) - 1));
    System.out.print(", m^2 + 1="+ int(Math.pow(m,2) + 1));
  }
}
    
