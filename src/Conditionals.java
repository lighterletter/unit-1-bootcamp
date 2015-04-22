import java.util.Calendar;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class Conditionals
{
    //1//Write a method isOdd that takes in an int n. Returns a true if n is odd, and false otherwise.
    public static boolean isOdd(int n)
    {
        if(n % 2 != 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    //2//Write a method isMultipleOfThree that takes in an int n.
    // Returns true if n is a multiple of three, and false otherwise.
    public static boolean isMultipleOfThree(int n)
    {
        if(n % 3 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    //3//Write a method isOddAndIsMultipleOfThree that takes in
    // an int n. Returns true if n is both odd and a multiple of three, and false otherwise.
    public static boolean isOddAndIsMultipleOfThree(int n)
    {

        if(n % 2 != 0 && n % 3 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }

    }

    //4//Write a method isOddAndIsMultipleOfThree2 -
    // if you used isOdd and isMultipleofThree in your last solution,
    // don't use it this time. If you did not, write this method building on your last methods.
    public static boolean isOddAndIsMultipleOfThree2(int n)
    {

        if(n % 2 == 0 && n % 3 != 0)
        {
            return false;
        }
        else
        {
            return true;
        }

    }

    //5//Write a method fizzMultipleofThree that takes
    // in an int n and prints "Fizz" if n is a multiple of three, and prints n otherwise.
    public static void fizzMultipleOfThree(int n)
    {
        if(n % 3 == 0)
        {
            System.out.println("Fizz");
        }
        else
        {
            System.out.println(n);
        }

    }
    //Person.1//Write a method that takes in a Person and
    // returns true if the person is from London, and false otherwise.

    public static boolean isFromLondon(Person person)
    {
        if(person.getCity().equals("London"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    //Person.2//Write a method that takes in a Person and prints
    // the name if the person has a name longer than 5 characters,
    // and otherwise prints "Name is too short."
    public static void personLongName(Person person)
    {
        if(person.getName().length() > 5)
        {
            System.out.println(person.getName());
        }
        else
        {
            System.out.println("Name is too short");
        }
    }

    //1++//When squirrels get together for a party, they like to have cigars.
    // A squirrel party is successful when the number of cigars is between 40
    // and 60, inclusive. Unless it is the weekend, in which case there is no
    // upper bound on the number of cigars. Write a method called cigarParty
    // that takes an int (the number of cigars) and boolean (whether or not it
    // is the weekend) as parameters, and returns true if the party with the
    // given values is successful, or false otherwise.
    public static boolean cigarParty(int cigars, boolean weekendOrWeekend)
    {

        if(cigars > 40 && cigars <= 60)
        {
            return true;
        }
        else if(weekendOrWeekend && cigars >= 40)
        {
            return true;
        }
        else
        {
            return false;
        }

    }

    //2++//You are driving a little too fast, and a police officer stops you.
    // Write code to compute the result, encoded as an int value: 0=no ticket,
    // 1=small ticket, 2=big ticket. If speed is 60 or less, the result is 0.
    // If speed is between 61 and 80 inclusive, the result is 1. If speed is
    // 81 or more, the result is 2. Unless it is your birthday -- on that day,
    // your speed can be 5 higher in all cases.
    public static int caughtSpeeding(int speed, boolean birthday)
    {
        if(speed <= 60)
        {
            return 0;
        }
        else if(speed <= 65 && birthday == true)
        {
            return 0;
        }
        else if(speed >= 61 && speed <= 80 && birthday == false)
        {
            return 1;
        }
        else if(speed >= 66 && speed <= 85 && birthday == true)
        {
            return 1;
        }
        else if(speed >= 81 && birthday == false)
        {
            return 2;
        }
        else if(speed >= 85 && birthday == true)
        {
            return 2;
        }
        return 0;
    }

    //3++//Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat,
    // and a boolean indicating if we are on vacation, return a string of
    // the form "7:00" indicating when the alarm clock should ring. Weekdays,
    // the alarm should be "7:00" and on the weekend it should be "10:00".
    // Unless we are on vacation -- then on weekdays it should be "10:00" and
    // weekends it should be "off".
    public static String alarmClock(int day, boolean vacation)
    {

        if(! vacation)
        {

            if(day == 0 || day == 6)
            {
                return "10:00";
            }
            if(day >= 1 && day <= 5)
            {
                return "7:00";
            }
        }
        if(vacation)
        {

            if(day == 6 || day == 0)
            {
                return "off";
            }
            if(day >= 1 && day <= 5)
            {
                return "10:00";
            }
        }

        return "off";
        //I had a slight bug: Wakes you up saturday at 10 regardless whether vacation or not. But Luke helped me clean
        //up the code so that would not happen.

    }

    //4++//You have a green lottery ticket, with ints a, b, and c on it. If the numbers
    // are all different from each other, the result is 0. If all of the numbers are the
    // same, the result is 20. If two of the numbers are the same, the result is 10. Write
    // a method that takes 3 ints as parameters and returns the correct result.
    public static int lotteryTicket(int a, int b, int c)
    {
        if(a != b && b != c && a != c)
        {
            return 0;
        }
        else if(a == b && b == c)
        {
            return 20;
        }
        else if(a == b || b == c || a == c)
        {
            return 10;
        }
        return 0;
    }

    //5++//Given 2 int values greater than 0, return whichever value is nearest to 21 without
    //going over. Return 0 if they both go over.
    public static int blackjack(int a, int b)
    {


        if(a <= 21 && a > b)
        {
            //winning a
            return a;

        }
        else if(b <= 21 && b > a)
        {
            //winning b
            return b;

        }
        else if(a > 21 && b < 21)
        {//winning b with a over 21
            return b;

        }
        else if(a < 21 && b > 21)
        {//winning  a with b over 21
            return b;
        }
        else if(a > 21 && b > 21)
        {
            return 0;
        }


        return 0;

    }

    //6//Given three ints, a b c, one of them is small, one is medium and one is large. Return true
    // if the three values are evenly spaced, so the difference between small and medium is the same
    // as the difference between medium and large.
    public static boolean evenlySpaced(int a, int b, int c)
    {

        if(c - b == b - a || a - b == b - c || c - a == c - b || b - a == a - c)
        {
            return true;
        }
        else
        {
            return false;
        }

    }


    public static void main(String args[])
    {
        //1//
        System.out.println("isOdd:" + isOdd(3));
        //2//
        System.out.println("isMultipleOfThree: " + isMultipleOfThree(9));
        //3//
        System.out.println("isOddAndIsMultipleOfThree: " + isOddAndIsMultipleOfThree(9));
        //4//
        System.out.println("isOddAndIsMultipleOfThree2: " + isOddAndIsMultipleOfThree2(15));
        //5//
        System.out.print("fizzMultipleOfThree: ");
        fizzMultipleOfThree(21);
        //P.1//
        Person patrick = new Person("Patrick");
        patrick.setCity("London");
        System.out.println("isFromLondon: " + isFromLondon(patrick));
        //p.2//
        System.out.print("personLongName: ");
        personLongName(patrick);

        //1++
        Calendar calendar = Calendar.getInstance();
        System.out.println("cigarParty: " + cigarParty(45, calendar.after(calendar.SATURDAY)));

        //2++
        System.out.println("caughtSpeeding: " + caughtSpeeding(81, false));

        //3++
        System.out.println("alarmClock: " + alarmClock(1, false));

        //4++
        System.out.println("lotteryTicket: " + lotteryTicket(2, 1, 3));

        //5++
        System.out.println("blackjack: " + blackjack(22, 15));

        //6++
        System.out.println("evenlySpaced: " + evenlySpaced(2, 4, 6));


    }
}
