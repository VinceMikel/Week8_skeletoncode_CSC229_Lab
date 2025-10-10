/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class LinearSearch {
    
    public static int search(int arr[], int x)
    {
        int n = arr.length; // provided, so when we use a for loop statement we dont have to put i < arr[i]
        for(int i =0; i < n; i++) {
            if (arr[i] == x) { // once target is matched
                return i;
            }
        }
        return -1; //return the index of the first match
        
        // Todo 01: - complete the implementation of linear search and test your code  
         //         - prvoide asymptotic analysis of the developed solution
    }
    
}
