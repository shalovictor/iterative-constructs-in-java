import java.util.Scanner;

public class NivenNumber
{
    public static void main(String[] args)
    {
        // TODO code application logic here
        int p, num, d,
        sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number=");
        n = sc.nextInt();
        num = n;
        while (num > 0)
        {
            d = num % 10;
            sum = sum + d;
            num = num / 10;
        }
        if (p % sum == 0)
        {
            System.out.println("Niven Number");
        }
        else
        {
            System.out.println("Not Niven Number");
        }
    }
}
