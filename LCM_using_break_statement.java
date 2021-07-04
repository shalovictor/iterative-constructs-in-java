public class LCM_using_break_statement
{
  public static void main(String args[])
  {
    int number1=1580;
    int number2=340;
    int greatest,lcm;
    
    // Find the greatest number
    if (number1 > number2)
    {
      greatest=number1;
    }
    else
    {
      greatest=number2;
    }
    
    // run the loop 
    // LCM could be between the greatest no & infinity
    // below lcm is the looping variable
    lcm=greatest;
    while (true)
    {
      if ( (lcm % number1 == 0) && (lcm % number2 == 0 ))
      {
        break;
      }
      lcm++;
    }
    System.out.println("LCM is "+lcm);
  }
}
