package day07_Unary_ShortHand;

public class short_hand {

    public static void main(String[] args) {
    int a = 100 ;
     //   a = a * a ;
          a *= a ;

        System.out.println(a);

          int b = 2 ;
              b *= 3 ;

        System.out.println(b);
    int c = 300 ;
        c-= 100 ;

        System.out.println(c);
        System.out.println("===================================");
         int z = 300 ;
        z += 200 ;
        System.out.println(z);

    //  += :
    String schoolName = "Cybertek" ;
    //     schoolName = schoolName + " School" ;
    schoolName += " School" ;

        System.out.println(schoolName);
String fullName = "Mahfooz" ;

    fullName += " Parwani" ;

        System.out.println( fullName);

    int budget = 100000 ;
    budget /= 4 ; //==> 25000
        System.out.println(  budget); // 25000

    //
        int q = 100 ;
        System.out.println(q/2);//50
          q /= 2 ;
        System.out.println(q); //50

   int x = 100 ;
      x /= 2  ;

        System.out.println(x);//50

        // %=

     int num = 100 ;
     num %= 3 ;  //1

        System.out.println(num); // 1
    double num2 = 400.5 ;
    num2 %= 2 ;
        System.out.println(num2);// 0.5





    }

}
