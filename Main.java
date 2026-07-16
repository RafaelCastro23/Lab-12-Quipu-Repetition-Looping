/********************************************
*	AUTHOR:	Rafael Castro
* COLLABORATORS: 
*	LAST MODIFIED:	7/16/26
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
  public static final int QUIPU_WIDTH = 30;

  public static void main (String[] args)

  {


    /***** DECLARATION SECTION *****/
    int num, hundredsPlace, remainder, tensPlace, onesPlace;


    /***** INITIALIZATION SECTION *****/
    
    
    /***** INTRO SECTION *****/


    /***** INPUT SECTION *****/
    num = 352;


    /***** PROCESSING SECTION *****/
    hundredsPlace = num / 100;
    remainder = num % 100;
    tensPlace = remainder / 10;
    onesPlace = remainder % 10;
    
    /***** OUTPUT SECTION *****/
    System.out.println("Hundres = " + hundredsPlace);
    System.out.println("Tens = " + tensPlace);
    System.out.println("Ones = " + onesPlace);
    System.out.println("\nYour quipu: ");
    Main.printQuipu(hundredsPlace, tensPlace, onesPlace);

    
  }
  /***** STATIC METHODS *****/
  public static void printQuipu(int hundres, int tens, int ones){
    UtilityBelt.printCentered(QUIPU_WIDTH, "---");
    Main.printKnots(hundres);
    UtilityBelt.printCentered(QUIPU_WIDTH, "|");
    Main.printKnots(tens);
    UtilityBelt.printCentered(QUIPU_WIDTH, "|");
    Main.printKnots(ones);
    UtilityBelt.printCentered(QUIPU_WIDTH, "\u203E")
    ;
  }


  //description: prints centered knots to the screen
  //precondition: numKnots is >= 0
  //postcondition: * aligned for numKnots will be printed vertically
  public static void printKnots(int numKnots){
    for(int i =0; i < numKnots; i++){
      //System.out.println("*");
      UtilityBelt.printCentered(QUIPU_WIDTH, "*");
    }
  }

}
