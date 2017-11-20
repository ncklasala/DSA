/*
 * Purpose: Lab 7 part 1
 * Status: Complete
 * Last update: 10/25/17
 * Submitted:  10/31/17
 * Comment: 
 * @author: Nicholas La Sala
 * @version: 2017.09.07
 */
import java.io.*;
import java.math.*;
public class Driver {
	//The result will equal 1 for both n=1 and n=0
	//with int it break at n = 13
	//This can be improved by changing from int to long
	// with long it hits sign bit at n = 21
	// with long it overflows at 65
	// It fail because it hits the limit of what can be stored with int and long
	// There exist a class BigInterger, but that requires importing math library
	// This could be improved using scientific notation
	// This also requires the math library
	public static void main(String args[]) throws IOException{
		System.out.println("This program finds the factorial of n");
		System.out.println("Please enter n: ");
		BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
		int n = Integer.parseInt(reader.readLine());
		long m = n;
		System.out.println(n+ "!");
		System.out.println("The integer method");
		System.out.println(rFactorial(n));
		System.out.println("The long method");
		System.out.println(rFactorial(m));
		System.out.println("The BigInteger method");
		System.out.println(rBigFactorial(n));
	}
	public static long rFactorial(long n){
		long result = 0;
		if(n == 0||n == 1){
			result = 1;
		}
		else{
			result = n*rFactorial(n -1);
			System.out.println(result);
		}
		return result;
	}
	public static int rFactorial(int n){
		int result = 0;
		if(n == 0||n == 1){
			result = 1;
		}
		else{
			result = n*rFactorial(n -1);
			System.out.println(result);
		}
		return result;
	}
	public static BigInteger rBigFactorial(int n){
		BigInteger result = BigInteger.valueOf(n);
		if(n == 0||n == 1){
			result = BigInteger.ONE;
		}
		else{
			result = result.multiply(rBigFactorial(n - 1));
			
			System.out.println(result);
		}
		return result;
	}
}