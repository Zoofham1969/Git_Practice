package day10_IfStatements;

public class character_Identify {

     public static void main(String[] args) {

     char character = 'y';
     boolean isAlphabetic = (character >= 65 && character <= 90) || (character >=97 && character <=122) ;
     //                       upper  case letter                 || lower case letter

          boolean isDigit = character >= 48 && character <= 57 ;

    boolean specialChar = isAlphabetic == false && isDigit ==false;

          String alphabet = "" ;

     if(isAlphabetic){
      //    System.out.println(character + " is Alphabetic character");
     alphabet = character + " is Alphabetic character";
     }else {
       //   System.out.println(character + " is not Alphabetic character");
   alphabet = character + " is not Alphabetic character" ;

          System.out.println(alphabet);

  String digit = "" ;
     if(isDigit == true){
          digit = character + " is a digit" ;
     }else {
        digit = character + "is not a digit" ;
     }


     }
          System.out.println(isDigit);

     String specialCharacter ="" ;
     if(specialChar == true){
          specialCharacter = character + " is a special character" ;
     }else {
          specialCharacter = character + " is not a special character" ;
     }

          System.out.println(specialCharacter);

     }

}
