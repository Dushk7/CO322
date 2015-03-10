/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co322;

import static co322.arrayPrint.arrayPrint;
import static co322.bubbleSort.bubbleSort;
import static co322.merge2Array.merge2Arry;

/**
 *
 * @author Dushk
 */
public class main {
    public static void main(String [] args){
        int [] array = { 4, 7, 2, 5, 8, 3};
        
        int [] array1 = { 2, 5, 8, 9};
        int [] array2 = { 1, 3, 5, 10};
        
        int [] newArray = bubbleSort(array);
        
        System.out.println("Sorted array is :");
        arrayPrint(newArray);
        System.out.println("\n");
        
        int [] newMergeArray = merge2Arry(array2, array1);
        System.out.println("Merged array :");
        arrayPrint(newMergeArray);
        System.out.println("\n");
    }
    
}
