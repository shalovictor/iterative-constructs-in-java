import java.util.Scanner;
public class OddSeries 
{
 public static void main(String args[]) 
  {
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter the number of terms: ");
  int n = sc.nextInt();
  int i = 1, c, f = 1;    // i for odd nos, c for counter, f for flag
  for (c = 1; c <= n; c++)
  {
   if (f % 2 == 0)
   {
    System.out.print(-i + " ");
   } else
   {
    System.out.print(i + " ");
   }
   i += 2;
   f++;
  }  //Loop ends
 }
}
