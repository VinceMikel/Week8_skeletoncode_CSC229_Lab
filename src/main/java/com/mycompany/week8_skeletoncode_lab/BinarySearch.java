/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class BinarySearch {

    public static int runBinarySearchIteratively(
            int[] sortedArray, int key, int low, int high) {
        int index = Integer.MAX_VALUE;

        while (low <= high) { //is checked first
            int mid = low + ((high - low) / 2); //keeps executinf for every time we dont get the match right
            if (sortedArray[mid] < key) { //evaluates first then passes on to the others if not true but then we go back to line 18 if true
                low = mid + 1;
            } else if (sortedArray[mid] > key) { //second to evaluate if mid turns out to be higher then we go back to line 18
                high = mid - 1;
            } else if (sortedArray[mid] == key) { //runs once we get a match
                index = mid;
                break;
            }
        }
        return index;
    }
    //ToDo 2: Call the above method and test the algorithm  
    // provide time and space analysis 
    public class BinarySearchTest {
    public static void main(String[] args) {
        int[] a = {1,2, 3, 4, 5,6, 7,8, 100};

        System.out.println(BinarySearch.runBinarySearchIteratively(a, 100, 0, a.length - 1));
        
   

}
