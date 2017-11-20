/*
 * Purpose: Data Structure and Algorithms Lab 1 Problem 8
 * Status: Complete and tested
 * Last update: 9/7/17
 * Submitted:  9/12/17
 * Comment: 
 * @author: Nicholas La Sala
 * @version: 2017.09.07
 */
import java.util.ArrayList;
import java.util.Scanner;
public class WeightedMeanProgram {
	static Scanner scrn = new Scanner(System.in);
	public static void main(String args[]){
		int n = 0;
		System.out.println("Enter an number of pairs:");
		n = scrn.nextInt();
		System.out.println(n);
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		ArrayList<Double> weightList = new ArrayList<Double>();
		for(int i = 0; i < n; i++){
			System.out.println("Enter number " + (i + 1) +":");
			numberList.add(scrn.nextInt());
			System.out.println( numberList.get(i));
			System.out.println("Enter weight " + (i+1) +":");
			weightList.add(scrn.nextDouble());
			System.out.println( weightList.get(i));
		}
		double numberSum = 0;
		for(int l = 0; l < numberList.size(); l++){
			numberSum += (double)numberList.get(l);
		}

		double weightSum = 0;
		for(int j = 0; j < weightList.size(); j++){
			weightSum += (numberList.get(j)*weightList.get(j));
		}
		double weightMean = weightSum/numberList.size();
		double arithmaticMean = numberSum/numberList.size();
		System.out.println("Weighted arithmetic mean of these " +n+" numbers is: " + weightMean);
		System.out.println("Simple arithmetic mean of these " +n+" numbers is: " + arithmaticMean);

	
		
	}
}
