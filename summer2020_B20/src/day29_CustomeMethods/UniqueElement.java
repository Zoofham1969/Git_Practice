package day29_CustomeMethods;

public class UniqueElement {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "B", "C"};
        uniques(arr);

        System.out.println("Hello");

    }



    public static void uniques(String[] arr){
        for( String a: arr){ // gets each of the element
            int count = 0;
            for( String each: arr ){ // gets the frequency of the element
                if( a.equals(each) ){
                    count++;
                }
            }
            if(count == 1){ // unique
                System.out.print(a+" ");
            }
        }

        System.out.println();















    }





}
