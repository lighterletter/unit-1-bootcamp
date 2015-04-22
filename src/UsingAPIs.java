import com.stripe.Stripe;
import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.model.Customer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class UsingAPIs {

  public static void main (String args[]) throws CardException, APIException, AuthenticationException, InvalidRequestException, APIConnectionException
  {

      //1// Hashsets
      File dickens = new File("/Users/c4q-john/Desktop/accesscode/unit-1-bootcamp/src/mobyDick.txt");

      File melville = new File("/Users/c4q-john/Desktop/accesscode/unit-1-bootcamp/src/aTaleOfTwoCities.txt");

      HashSet<String> mobyDickSet = new HashSet<String>();

      HashSet<String> aToTCSet = new HashSet<String>();

      char [] symbols = {
              ':',';',',','.','!','?','_','-','\"'
      };

      try{
          Scanner sc = new Scanner(dickens);

          int numWords = 0;
          int numSentences = 0;

          while (sc.hasNext()) {

              String word = sc.next();



              if(!mobyDickSet.contains(word)||
                      word.contains(symbols.toString())||
                      word.equalsIgnoreCase(word))
              {

                  word.replace(symbols.toString(),"");
                  mobyDickSet.add(word);
              }

              numWords += 1;

              if (word.endsWith(".")){
                  numSentences +=1;
              }

          } System.out.print("Charles Dickens Verbosity Score: "+ numWords/numSentences+"\n");
          System.out.println("Word set: "+mobyDickSet.size());

          Scanner mv = new Scanner(melville);

          int numWord = 0;
          int numSentence = 0;

          while (mv.hasNext()) {

              String word = mv.next();

              if(!aToTCSet.contains(word)||
                      word.contains(symbols.toString())||
                      word.equalsIgnoreCase(word))
              {

                  word.replace(symbols.toString(),"");
                  aToTCSet.add(word);
              }

              numWord += 1;

              if (word.endsWith(".")){
                  numSentence +=1;
              }

          }System.out.print("Herman Melville's Verbosity Score: "+ numWord/numSentence+"\n");
          System.out.println("Word set: "+aToTCSet.size());
          System.out.print("Seems like Dickens' sunken the competition!");

      }
      catch (FileNotFoundException e){
          e.printStackTrace();
      }



      //******************************************



//
//      Stripe.apiKey = "sk_test_hSWjSO1movHbxdCFoJT0Tjdz";
//
//      Map<String, Object> customerParams = new HashMap<String, Object>();
//      customerParams.put("limit", 3);
//
//      System.out.println(Customer.all(customerParams));


  }
}

