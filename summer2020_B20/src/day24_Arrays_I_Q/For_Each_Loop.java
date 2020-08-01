package day24_Arrays_I_Q;

public class For_Each_Loop {

    public static void main(String[] args) {
/*for each loop: a loop that's already iterated.  starting from index 0 till the end of data structure
                order is fixed.
                we MUST have a data structure to use for each
                for(DataType  each : Collection Of Data ){
                }
                    each: represents every single elemnts in collection
                    DataType: MUST match with Array's dataType
*/
        int[] arr = {1, 2, 3,4,5,6,7,8,9,-1, -2, -3};

     /*   for(int i=0; i <= arr.length-1; i++){ // i is the index number
            System.out.print( arr[i] +" " );
        }
        System.out.println();
*/
        System.out.println("================================");
      /*
    for(DataType  each : Collection Of Data ){
        }
     */
        for(int each : arr ){ // each represents the elements
            System.out.print(each+" ");
        }




    }



}
