/**
 * Created by alexandraqin on 4/14/15.
 */
public class Loops {
    //1//Write a method that prints the numbers 1 through 10 using a loop.
    public static void tenLoop(){
        for(int i=1; i<11; i++){
            System.out.print( i+" ");
        }
    }
    //2//Write a method that prints the numbers 1 through 10 using a different kind of loop.
    public static void tenloopdiff(int n){
        while(n >=1 ){

                System.out.print( n++ +" ");

            if(n > 10)
            {
                break;
            }

        }
    }
    //3//Write a method that takes in an int n and prints the numbers 1 through n.
    public static void nLoop(int n){

        for(int i=1; i<n+1; i++){
            System.out.print(i + " ");
        }

    }
    //4//Write a method that takes in an int n and prints the even numbers 2 through n.
    public static void evenN(int n)
    {

        for(int i = 0; i <= n; i++)
        {

            if(i % 2 == 0)
            {

                System.out.print(" " + i);

            }

        }

    }
    //5//Write a method that prints the sum of 1 through 10 using a loop.
    public static void printSumOf1Upto10UsingForLoop() {


        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;

        }
        System.out.println(sum);
        //if you want to print out every single instance simply put inside loop.

    }
    //6//Write a method that takes in an int n and prints the sum of the numbers 1 through n using a loop.
    public static void sumNPrint(int f){

       int sum = (f+1) * (f/2);
        System.out.println(sum);
    }
    //7//Use the method you wrote in part 6 to print the sum of the numbers from 1 through 10000.
    public static void sumTenThousand(){
        int sum = 0;
        for (int i = 1; i <= 10000; i++) {
            sum += i;

        }
        System.out.println(sum);
    }
    //8//Write a method that takes in an int n and a String s and prints out s on its own line, n times. If n is negative, print "".
    public static void numString(int n, String s){

        for(int i = 0; i< n; i++){
            System.out.println(s);

        }
            System.out.println("");

    }
    //9//Modify the method to print out the string concatenated with itself n times.
    public static void numString2(int n, String s){
        for(int i = 0; i< n; i++){

            System.out.print(s);

        }
    }
    //10//Write a method that prints the first ten Fibonnaci numbers.
    public static void fibonachi10(){

        long I = 0;
        long J = 1;
        long Sum;

        for (long i = 0; i < 10; i++) {


                Sum =  (I + J);
            I = J;
            J = Sum;

            System.out.print(Sum+" ");
        }


    }
    //11//Modify the method to sum the first ten Fibonnaci numbers.
    public static void fibonachi10Sum(){

        long I = 0;
        long J = 1;
        long Sum=0;

        for (long i = 0; i < 10; i++) {


            Sum =  (I + J);
            I = J;
            J = Sum;


        }

        System.out.println(Sum-1 + " ");


    }
    //12//Modify the method to take in an int n and sum the first n Fibonnaci numbers.
    public static void fibonachi10SumN(int n){

        long I = 0;
        long J = 1;
        long Sum=0;

        for (long i = 0; i < n; i++) {


            Sum =  (I + J);
            I = J;
            J = Sum;


        }
        System.out.println(Sum -1+ " ");


    }
    //1++//Given a string, return the sum of the numbers appearing in the string, ignoring all other
    // characters. A number is a series of 1 or more digit chars in a row. (Note: Character.isDigit
    // (char) tests if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string)
    // converts a string to an int.)
    public static int  sumNumbers(String string){
        int sum =0;

        for(int i = 0; i < string.length(); i++){


            if(Character.isDigit(string.charAt(i))){

                int ascii = string.charAt(i);
                char  val = ((char) ascii);
                int charval = Character.getNumericValue(val);

                sum = sum + charval ;


            }else continue;
        }
        return  sum;
    }
    //2++//Given a string, return a string where every appearance of the lowercase word "is" has been
    // replaced with "is not". The word "is" should not be immediately preceeded or followed by a
    // letter -- so for example the "is" in "this" does not count. (Note: Character.isLetter(char)
    // tests if a char is a letter.)
    public static String notReplace(String string){
        String newString="";

        for(int i =0; i < string.length(); i++)

            if(string.contains("is"))
            {
                newString = string.replace(" is ", " is not ");

            }else return string;

        return newString;
    }
    //3++//Given a string and a non-empty word string, return a string made of each char just before
    // and just after every appearance of the word in the string. Ignore cases where there is no
    // char before or after the word, and a char may be included twice if it is between two words.
    public static String wordEnds(String sentence, String word ){
        String cleaned = "";

            while(sentence.contains(word))
            {
                if(sentence.indexOf(word) != 0){
                    int before = sentence.charAt(sentence.indexOf(word)-1);
                    cleaned += sentence.replace(word,"");
                }
                if(sentence.indexOf(word.lastIndexOf(word)) >= +1){
                    cleaned += word.replace(word,"");
                }

            }

        return cleaned;
    }


  public static void main (String args[]) {

      //1//
      System.out.print("tenLoop: "); tenLoop();
      System.out.println("");
      //2//
      System.out.print("tenLoopDiff: "); tenloopdiff(1);
      System.out.println("");
      //3//
      System.out.print("nLoop: "); nLoop(20);
      System.out.println("");
      //4//
      System.out.print("evenN: "); evenN(20);
      System.out.println();
      //5//
      System.out.print("printSumOf1UpTo10UsingForLoop: "); printSumOf1Upto10UsingForLoop();
      //6//
      System.out.print("sumNPrint: "); sumNPrint(15);
      //7//
      System.out.print("sumTenThousand: "); sumTenThousand();
      //8//
      System.out.print("numString: "); numString(3, "butt");
      //9//
      System.out.print("numString2: "); numString2(3, "butt");
      System.out.println(" ");
      //10//
      System.out.print("fibonacci10: "); fibonachi10();
      System.out.println(" ");
      //11//
      System.out.print("fibonacci10sum: ");fibonachi10Sum();
      //12//
      System.out.print("fibonacci10SumN: "); fibonachi10SumN(20);

      //1++//
      System.out.println("sumNumbers: "+sumNumbers("i3am2a5pin5ata"));

      //2++//
      System.out.println("notReplace: "+ notReplace("this is right"));

      //3++//
      System.out.println("wordEnds: "+ wordEnds("abcXY123XYijk","XY"));









  }
}
