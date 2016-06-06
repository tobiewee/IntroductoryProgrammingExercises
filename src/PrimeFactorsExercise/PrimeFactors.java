package PrimeFactorsExercise;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Tobie Wee
 * on 6/5/2016.
 */
public class PrimeFactors {
    public static void generate(int n){
        ArrayList<Integer> primeFactors = new ArrayList();
        boolean isPrime = true;

        for (int i=2; i<n; i++){
            //check if is a factor
            if(n%i==0) {
                // Check if is prime number
                for(int j=2; j<=i; j++){
                    if(i%j==0 && j!=i){
                        isPrime = false;
                        break;
                    }
                }

                if(isPrime)
                    primeFactors.add(i);

                isPrime = true;
            }
        }

        System.out.println(primeFactors.toString());

    }

    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = in.nextInt();

        generate(n);
    }
}
