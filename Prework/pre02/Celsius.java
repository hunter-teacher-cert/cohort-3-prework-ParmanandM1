import java.util.*;

public class Celsius
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter temperature in Celsius: ");
        double C = in.nextFloat();
        
        double F = C * (9f / 5) + 32;
        
        System.out.println(C + " degree Celsius is equal to " + F +" degree Fahrenheit.");
  }
}
