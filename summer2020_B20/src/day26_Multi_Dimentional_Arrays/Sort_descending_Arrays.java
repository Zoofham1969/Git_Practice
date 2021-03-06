package day26_Multi_Dimentional_Arrays;
import java.util.Arrays ;
/*
Topics: Arrays Continue
        Multi-Dimensional Arrays
package name: day26_MultiDimensionalArray
warmup tasks:
    1. write a program that can sort the array in descending order
            ex:
                arr1: { 10, 11, 8, 9, 12, 5, 15};
                output:
                    arr2: {15, 12, 11, 10, 9, 8, 5}
                NOTE: at the end, you must have have an array that contains the desending order of the original array
                2 1 3
                1 2 3
                3 1 2

 */
public class Sort_descending_Arrays {

    public static void main(String[] args) {


        int[] arr ={ 10, 11, 8, 9, 12, 5, 15};
        Arrays.sort(arr); //arr: {1, 2, 3}
        System.out.println( Arrays.toString(arr));

        int[] desc = new int[arr.length];      // { 3, 2, 1}
            /*
            desc[0] =  arr[2];
             desc[1] =  arr[1];
             desc[2] =  arr[0];
        */

        int k =arr.length-1;
        for(int i =0; i <= desc.length-1; i++ ){ //i: 0, 1, 2
            desc[i] =  arr[k];
            k--; // k: 2, 1, 0
        }


        System.out.println(Arrays.toString(desc));






    }

}
