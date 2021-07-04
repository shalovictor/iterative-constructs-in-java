import java.util.Scanner;
import java.lang.Math;

public class radius_from_vol_of_sphere
{
  public static void main(String args[])
  {
    double r;
    int vol;
    System.out.println("Please input the volume of the sphere");
    Scanner k = new Scanner(System.in);
    vol = k.nextInt();
    // radius is cubroot  of ( volume * 3/4 * 1/pi)
    r = Math.cbrt(vol*0.75/Math.PI);
    System.out.println("Radius of sphere: "+r);
  }
}
