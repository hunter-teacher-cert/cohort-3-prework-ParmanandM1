import java.io.*;
import java.util.*;

public class Date{
  public static void main(String[] args)
  {
    String day = "Monday";
    String Month = "June";
    int date = 20;
    int year = 2022;
    System.out.println("American formatting: ");
    System.out.println(day + "," + Month + " " + date + ", " + year);
    
    System.out.println("European Format: ");
    System.out.println(day + " " + date + " " + Month + " " + year);
    
  }
}