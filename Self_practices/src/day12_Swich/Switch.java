  package day12_Swich;

  public class Switch {
/*
switch statement:

        syntax:
            switch(expression){ // 1
                case caseValue1:
                            statementsA;
                            break;
                case caseValue2:
                            statementsA;
                            break;
                case caseValue2:
                            statementsA;
                            break;
                default:
                            statementsA;
                            break;
            }
            caseValue MUST match with switch statement's expression' data type
            caseValue MUST be unique
            which ever case is same with the expressions that' case will be executed
            default: gets executed if none of the cases are matching. can be placed at anywhere. not mandatory
            break: used for exiting bthe switch
*/
    public static void main(String[] args) {
  int a = 1;

   switch(a){

       case 5 :
           System.out.println("five");
           break;

       case 1:
           System.out.println("one");
       //    break;
       default:
           System.out.println("invalid case");
          break;
   }









}







}
