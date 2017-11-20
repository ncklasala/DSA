/*
 * Purpose: Lab 7 part 3
 * Status: Complete
 * Last update: 10/25/17
 * Submitted:  10/31/17
 * Comment: Part D possibly inefficient
 * @author: Nicholas La Sala
 * @version: 2017.09.07
 */
import java.io.*;


public class Driver3 {
	public static void main(String args[]) throws IOException{
		BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
		System.out.println("This Program will calculate the Binomial Coefficent for any n and k");
		System.out.println("Please enter n: ");
		int n = Integer.parseInt(reader.readLine());
		System.out.println(n);
		System.out.println("Please enter k: ");
		int k = Integer.parseInt(reader.readLine());
		System.out.println(k);
		System.out.println("Here is the Binomial Coefficient found recursively");
		System.out.println("The Binomial Coefficient is "+rBinomialCoefficient(n,k));
		System.out.println("Here is pascal's triangle for " + n + " rows");
		pascalTriangle(n);
		System.out.println("Here is the Binomial Coefficient found iteratively");
		System.out.println("The Binomial Coefficient is "+iBinomialCoefficient(n,k));
		System.out.println("Here is the Binomial Coefficient found through the reduced formula");
		System.out.println("The Binomial Coefficient is "+fBinomialCoefficient(n,k));
	}
	//Part a
	public static int rBinomialCoefficient(int n, int k){
		int result = 0;
		if(k == 0 || k == n){
			result = 1;
		}
		else{
			result = rBinomialCoefficient(n-1,k) +rBinomialCoefficient(n-1,k-1);
		}
		return result;
	}
	//Part c
	public static void pascalTriangle(int n){
		int[] last;
		int[] curr= new int[1];
		curr[0] = 1;
		last = curr;
		System.out.println(curr[0]);
		for(int i = 2; i <= n +1; i++){
			curr = new int[i];
			curr[0] = 1;
			curr[i-1] = 1;
			for(int p =0; p < i -2; p++){
				curr[p +1] = last[p] + last[p+1];
			}
			for(int j = 0; j < i; j++){
				System.out.print(curr[j]+ " ");
				
			}
			System.out.println("");
			last = curr;
		}
	}
	//Part d
	public static int iBinomialCoefficient(int n, int k){
		int[] last;
		int[] curr= new int[1];
		curr[0] = 1;
		last = curr;
		int result = 1;
		for(int i = 2; i <= n +1; i++){
			curr = new int[i];
			curr[0] = 1;
			curr[i-1] = 1;
			for(int p =0; p < i -2; p++){
				curr[p +1] = last[p] + last[p+1];
			}
			if(i == n +1 ){
				result = curr[k];
			}
			last = curr;
		}
		return result;
	}
	//Part e
	public static int fBinomialCoefficient(int n, int k){

		int result = 1;
		
		if(k == 0 || k == n){
			result = 1;
		}
		else if(k> n-k){
			result = (k+1);
			for(int i = result+1 ; i <= n ; i++){
				result = result * i;
			}
			
			result = result/rFactorial(n-k);
		}
		else{
			result =(n-k +1);
			for(int i = result+1; i <= n ; i++){
				result = result * i;
			}
			result = result/rFactorial(k);
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
			
		}
		return result;
	}
}
