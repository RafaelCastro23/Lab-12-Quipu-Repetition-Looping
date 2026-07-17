/********************************************
*	AUTHOR:	Rafael Castro
* COLLABORATORS: 
*	LAST MODIFIED:	7/17/26
********************************************/

/********************************************
*	Quipu
*********************************************
*	PROGRAM DESCRIPTION:
*	A user will enter a number between 0 and 999 and this program will display the number as a quipu.
*********************************************
*	ALGORITHM:
//math example
 number is 352
 hundreds is 3: 352/ 100 = 3
 tens is 5: 52 / 10 + 5 (to get 52, remainder: 352 % 100)
 ones is 2: 2 / 1 = 2 (remainder 52 % 10)
 //psuedocode
 INPUT num //0-999 is expected
 CALC hundredsPlace = num / 100
 CALC remainder = num % 100
 CALC tensPlace = remainder / 10
 CALC remainder = remainder % 10
 CALC onesPlace = remainder % 10
*********************************************/


public class Main
{

  /***** CONSTANT SECTION *****/
  public static final int QUIPU_WIDTH = 25;

  public static void main (String[] args)

  {


    /***** DECLARATION SECTION *****/
    int num, hundredsPlace, remainder, tensPlace, onesPlace;
    char userChoice;


    /***** INITIALIZATION SECTION *****/
    
    
    /***** INTRO SECTION *****/
    System.out.println("Hello! This program turns any whole number between 0 and 999 into a digital Quipu.\n");



    /***** INPUT SECTION *****/
    do {
        num = UtilityBelt.readInt("Please enter a number between 0 and 999: ", 0, 999);

        /***** PROCESSING SECTION *****/
        hundredsPlace = num / 100;
        remainder = num % 100;
        tensPlace = remainder / 10;
        onesPlace = remainder % 10;

        /***** OUTPUT SECTION *****/

        System.out.printf("%-9s  = %d%n", "Hundreds",hundredsPlace);
        System.out.printf("%-10s = %d%n", "Tens", tensPlace);
        System.out.printf("%-10s = %d%n","Ones", onesPlace);
        System.out.println("\nYour quipu: ");
        Main.printQuipu(hundredsPlace, tensPlace, onesPlace);

        //INIT+UPDATE LCV
        userChoice = UtilityBelt.readChar("\nWould you like to make another quipu? {Y/N}: ", "YyNn");
    } while(userChoice == 'Y' || userChoice =='y');//CHECK LCV
    System.out.println("\nGoodbye!");

  }
  /***** STATIC METHODS *****/
  public static void printQuipu(int hundres, int tens, int ones){
    UtilityBelt.printCentered(QUIPU_WIDTH, "___");
    UtilityBelt.printCentered(QUIPU_WIDTH, "|");
    Main.printKnots(hundres);
    UtilityBelt.printCentered(QUIPU_WIDTH, "|");
    Main.printKnots(tens);
    UtilityBelt.printCentered(QUIPU_WIDTH, "|");
    Main.printKnots(ones);
    UtilityBelt.printCentered(QUIPU_WIDTH, "|");
    UtilityBelt.printCentered(QUIPU_WIDTH, "\u203E")
    ;
  }

  public static void printKnots(int numKnots){
    for(int i =0; i < numKnots; i++){
      //System.out.println("*");
      UtilityBelt.printCentered(QUIPU_WIDTH, "*");
    }
  }

}
