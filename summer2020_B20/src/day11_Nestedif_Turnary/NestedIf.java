package day11_Nestedif_Switch;
/* 90 ~ 100 ==> A
    80 ~ 89 ==> B
    70 ~ 79 ==> C
    60 ~ 69 ==> D
    0 ~ 59 ==> F
    other ==> Invalid
 */
public class NestedIf {
    public static void main(String[] args) {

    int score = 40 ;

    String result = "";

    if (score>=0 && score <= 100){
        if (score >=90 ){

           result = "A";
        }else if (score >=80){
            result = "B";
        }else if (score>=70){
            result = "C";
        }else if (score >=60){
            result = "D";
        }else {
            result = "F";
        }

        }else {
            result = "Invalid" ;


    }

        System.out.println(result);

        System.out.println("========================================================");
    /*  task01 :
    precondition : minimum salary of 30K
        sub condition: minimum 2 years of job history
        Task02:
        1 monday
        2 Tuesday
        3 Wednesday
        ....
        7 Sunday
        invalid ==> there is no such a day

     */







    }

}
