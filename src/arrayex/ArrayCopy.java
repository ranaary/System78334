/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayex;

/**
 *
 * @author ranaa
 */

import java.util.Arrays;
public class ArrayCopy {
    
    public static void main(String[] args) {
        
        int[] arr1 = new int[]{40,30,70};
        System.out.println("Printing 1st Array: ");
        
        for(int i =0; i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
        int[] arr2 = Arrays.copyOf(arr1, 5);
        arr2[3] = 10;
        arr2[4] = 44;
        System.out.println("printing new array: ");
        for(int i =0 ; i<arr2.length;i++){
            System.out.println(arr2[i]);
        }
       }
}
