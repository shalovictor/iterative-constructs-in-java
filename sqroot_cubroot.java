// Program 3 in page 73

import java.util.Scanner;
import java.lang.Math;

public class sqroot_cubroot
{
  public static void main(String args[])
  {
    int m;
    System.out.println("Please input a number");
    Scanner keyboard = new Scanner(System.in);
    m = keyboard.nextInt();
    System.out.println("Sample Input: "+m);
    System.out.println("Square root of "+m+" = "+Math.sqrt(m));
    System.out.println("Square root  "+m+" (Rounded) = "+(int) Math.round(Math.sqrt(m)));
    System.out.println("Cube root of "+m+" = "+Math.cbrt(m));
    System.out.println("Cube root  "+m+" (Rounded) = "+(int) Math.round(Math.cbrt(m)));    
  }
}
