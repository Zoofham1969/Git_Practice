package officeHour_day21;



import java.util.Scanner;

public class remove_Duplication {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();   // "nal"


        String result = ""; //"nal"

        for(int i = 0;  i <= str.length()-1; i++ ){

            String s =""+ str.charAt(i);  //s: n, a, l, a, n

            if(result.contains(s)){
                continue;
            }else{
                result += s;
            }

        }

        System.out.println(result);


    }

}























