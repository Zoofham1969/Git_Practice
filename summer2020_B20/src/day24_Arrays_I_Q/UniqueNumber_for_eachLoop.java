package day24_Arrays_I_Q;
/*
Task:
    1. write a program that can print out the unique numbers from an array of integers
    Ex:
        int[] arr ={1,1,2,3,3,4}
        output:
            2 4
 */
   public class UniqueNumber_for_eachLoop {
         public static void main(String[] args) {

      //       int[] arr = {1,1,2,3,3};
             int[] arr = {1,1,2,3,3,4,5,5,6,7,7,8,9,9};
             //{1,1,2,3,3

             for(int j=0; j <= arr.length-1; j++){
                 // j: 0,1,2,3,4
                 int num1 = arr[j];  //1  1  2  3  3
                 int count = 0 ;
                 for(int i=0; i <= arr.length-1; i++){  // only calculates the frequnecy of num
                     int each =  arr[i]; // 1  1  2  3  3
                     if(each == num1){
                         count++;
                     }
                 }

                 if(count == 1){
                     System.out.println(num1);
                     System.out.print(num1+" ");
                 }
             }





    }


}