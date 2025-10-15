/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Problem01 {
    
   public static int getSumPrimes(int n) {
            int sum = 0;
            for (int i = 2; i <= n; i++) { 
                if (isPrime(i)) sum += i; //runs and checks depending on the isPrime class if i will
                //be true or false and will add if true
            }
            return sum; 
        }

            public static boolean isPrime(int i) {
                if (i < 2)
                    return false;  //checks if i is less than 2 

                if (i % 2 == 0)
                    return i == 2; //checks if divisible by 2

                if (i % 3 == 0)
                    return i == 3; //checks if divisible by 3


                for (int j = 5;j * j <= i; j += 6) {  //we start with 5 since we had taken care of 2 and 3 which 5 will be the next 
                                                        // we can think of breaking everything into chunks  by iterating by 6, checking if those new numbers would be divisible by 2 or 3
                                                        // according to our previous two return statements
                    if (i % j == 0 || i % (j + 2) == 0) { 
                        return false;
                    }
                }
                        return true;
                    
                }
    
        
        // Todo 04: Develop a method that returns the sum of the prime numbers between 1 and n
    //          Test your solution
    //          Analyze its space and time  
    
    }
    
} 
