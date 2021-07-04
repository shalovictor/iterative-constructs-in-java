public class print_even_numbers_using_continue
{
  public static void main(String args[])
  {
    int n=100;
    
    // i loops from 1 to n
    for (int i=1;i<=n;i++)
    {
      // if i is not divisible by 2 skip the loop
      if ( i%2 != 0 )
        continue;
      // else print i
      System.out.println(i);
    }
  }
}
