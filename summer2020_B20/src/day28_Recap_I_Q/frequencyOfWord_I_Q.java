package day28_Recap_I_Q;
/*
  1. write a program return the frequency of a word from a string
            ex:
                str = "JavajavaJAVA";
                word = "java";
                output:
                    3
        do not use same the approach we did in last office hour

 */
public class frequencyOfWord_I_Q {

    public static void main(String[] args) {




        String str = "javajava";
        //            01234567

        //substring(0, 4) ==> java
        // substring(1, 5) ==> avaj
        // substring(2, 6) ==> vaja
        // substring(3, 7) ==> ajav
        // substring(4, 8) ==> java

        //substring(i, i+4)

        //"java"

        int count = 0;
        for(int i= 0 ; i <= str.length()-4; i++){ //i:0 , 1, 2,3, 4

            String s = str.substring(i, i+4);
            if(s.equalsIgnoreCase("java")){
                count++;
            }

        }

        System.out.println(count);
/*
package officeHour_day21.practice07_15_20;

public class FrequencyOfWord_I_Q {

    public static void main(String[] args) {

        String str = "cat cat cat cat cat cat " ;

        int count = 0 ;
        while(str.contains("cat")){
            count++ ;
        str = str.replaceFirst("cat"  , "");
        }

        System.out.println(count);

 */






    }


}
