import java.util.Random;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class Methods {
    //1//Write a method called calculateSquare that takes an int as a parameter and returns the square of that integer.
    public static int calculateSquare(int num){
        return num*num;
    }
    //2//Write a method called calculateSquareRoot that takes an int as a parameter and returns the square root of that integer.
    public static double calculatesquareRoot(double num){
        return  Math.sqrt(num);
    }
    //3//Write a method called toLowerCase that takes a String as a parameter and returns the String in lower case.
    public static String toLowerCase(String string){
        String lowerString = string.toLowerCase();
        return lowerString;
    }
    //4//Write a method called isMultiple that takes 2 int parameters and determines if the second is a multiple of the first.
    public static boolean isMultiple(int num1, int num2){

        if(num1 % num2==0){
            return true;
        }else {
            return false;
        }

    }
    //5//Write a method called prettyInteger that takes an int as a parameter and prints the integer surrounded by asterisks
    // with the length of each side equal to the given integer.
    public static void prettyInteger(int param){

        String dec = "*";

        for(int i = 0; i <param; i ++){

            System.out.print(dec);

        }
        System.out.print(" " + param + " ");
        for(int i = 0; i <param; i ++){

            System.out.print(dec);

        }

    }
    //6//Write a method called random that takes 2 ints as parameters and returns a random int within that range.
    public static int random(int base, int top){

        int random = (int )(Math.random() * top + base);

        return  random;
    }

  public static void main (String args[]) {
      //1//
      System.out.println("calculateSquare: "+ calculateSquare(4));
      //2//
      System.out.println("calculateSquareRoot: "+calculatesquareRoot(25));
      //3//
      System.out.println("toLowerCase: "+toLowerCase("THIS IS ALL CAPS"));
      //4//
      System.out.println("isMultiple: "+isMultiple(2,3));
      //5//
      System.out.print("prettyInteger: ");prettyInteger(5);
      System.out.println("");
      //6//
      System.out.println("random: "+random(1, 100));

  }
}
