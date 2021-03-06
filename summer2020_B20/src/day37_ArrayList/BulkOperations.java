package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        boolean r1 = list.contains(1);//true

        ArrayList<Integer> elements = new ArrayList<>();


        //list.containsAll()
        elements.add(1);
        elements.add(2);
        elements.add(5);


        boolean r2=  list.containsAll(elements);

        System.out.println(r2);
        System.out.println("===============================");

        ArrayList<Integer> list2 = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);



     // verify that 1, 2, 4 are contained in the list2

     boolean r3 = list2.containsAll(Arrays.asList(1, 2, 4));
        System.out.println(r3);
        System.out.println("===================================");

ArrayList<Integer> numbers = new ArrayList<>();

  // add : 30, 25, 40, 15, 55, 65, 75, 85, 95, 100
    // Integer[] nums = {30, 25, 40, 15, 55, 65, 75, 85, 95, 100} ;
    // numbers.addAll(nums)  ;



    }

}
