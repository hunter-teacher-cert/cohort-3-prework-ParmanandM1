import java.io.*;
import java.util.*;

public class Array{
	public static void main(String[] args) {
	  //Calling powArray with a list of the numbers 1 to 4, using the power 3.
		double[] a = {1.0,2.0,3.0,4.0};
		double n = 3;
		System.out.println("Here is an array:");
		System.out.println(Arrays.toString(a));
		System.out.println("Here is that array raised to the power " + n);
		powArray(a,n);
		System.out.println(Arrays.toString(a));
		
		
		int Numbercounters = 77;
		int[] class_scores = randomArray(Numbercounters);
		System.out.println("The following is an array of " + Numbercounters + " random scores between 0 and " + Numbercounters + ":");
		System.out.println(Arrays.toString(class_scores));
		System.out.println("The following is a histogram of those scores, using " +Numbercounters+ " counters");
		System.out.println(Arrays.toString(histogram(class_scores, Numbercounters)));
	}
//powArray
	public static double[] powArray(double[] a, double n){
		for (int i = 0; i < a.length; i++) {
    	a[i] = Math.pow(a[i], n);
			}
			return a;
		}

//Creating a random array of integers between 1 and and the size of the array
	public static int[] randomArray(int size){
		Random random = new Random();
		int[]a = new int[size];
		for (int i=0; i <a.length; i++) {
			a[i]=random.nextInt(size);
		}
			return a;
		}
//The Histogram 
	public static int[] histogram(int[] scores,int counters){
		int[] counts = new int[counters];
		for (int score : scores){
    	counts[score]++;
		}
		return counts;
	}
}

