***************************************************************************
Last login: Wed Oct 25 12:34:52 2017 from 150.250.106.64
           ______     _
          / __/ /  __(_)__
         / _// / |/ / (_-<      Welcome to Elvis
        /___/_/|___/_/___/

::::::::::::::::::::::::::::::::::-NOTICES-::::::::::::::::::::::::::::::::::
 Welcome back for Fall 2017!!  Elvis has undergone a minor upgrade, so
 please check on updates to the software versions if you have any issues.

::::::::::::::::::::::::::::::::-MAINTENANCE-::::::::::::::::::::::::::::::::

[lasalan4@elvix2 ~]$ vi Driver3.java
[lasalan4@elvix2 ~]$ vi Driver3.java
/* q
 * Purpose: Lab 7 part 3
 * Status: incomplete
 * Last update: 10/25/17
 * Submitted:  10/31/17
 * Comment:
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
                System.out.println(rBinomialCoefficient(n,k));
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

                for(int i =0; i <=n; i++){

                }
        }

}


