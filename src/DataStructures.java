import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class DataStructures {

    //2//Write a method called mostFrequentElement that takes an ArrayList of Integers
    // and finds the most frequently occurring element in the ArrayList. At the end
    // print the element and its number of occurrences. If there is more than one s
    // uch element, any one of them may be printed.
    public static void mostFrequentElement(ArrayList<Integer> intArray){

        HashMap<Integer,Integer> hashmap = new HashMap<Integer, Integer>();



        for(int i = 0; i < intArray.size(); i++){

           int currentItem = intArray.get(i);

            if(!hashmap.containsKey(currentItem)){
                hashmap.put(currentItem,1);

            }else {
                hashmap.put(currentItem,hashmap.get(currentItem)+1);

            }

        }
        int biggestVal = 0;
        int keyVal= 0;

        for(Map.Entry<Integer,Integer>  entry : hashmap.entrySet()){

            if(entry.getValue()>biggestVal){

                biggestVal = entry.getValue();
                keyVal = entry.getKey();
            }
        }


        System.out.println(keyVal+":"+biggestVal);

    }
    //4//Write a method called canRentACar that takes the Pod HashMap as
    // a parameter and returns whether or not the Pod can rent a car.
    // If one or more studetns is over 25, it should return true. If
    // no one in the Pod is over 25, it should return false.
    public static boolean canRentAcar(HashMap<String,Integer> podMap){


//        for(int i =0; i < podMap.size(); i++)
//        {
//            Integer j = 25;
//
//            if(podMap.values().contains(j))
//            {
//                return true;
//            }
//        }
//            return false;
//        for (Integer v : podMap.values()) {
//            if (v >= 25) {
//                return true;
//            }
//        }
//        return false;

        for(Integer value : podMap.values())
            if(value != null && value >= 25)
                return true;
        return false;


    }
  public static void main (String args[]) {

      //1//Cool cats pt2
            //1//Create an ArrayList of 5 Cats.

      Cat scutttleButt = new Cat("Scuttlebutt");
      Cat chubbz = new Cat("Chubbz");
      Cat simba = new Cat("Simba");
      Cat leo = new Cat("Leo");
      Cat mark = new Cat("Mark");

      ArrayList<Cat> catLitter = new ArrayList<Cat>();

      catLitter.add(0,scutttleButt);
      catLitter.add(1,chubbz);
      catLitter.add(2,simba);
      catLitter.add(3,leo);
      catLitter.add(4,mark);

              //2//Use a loop to print the contents of each object in the ArrayList.
      for(int i =0; i < catLitter.size(); i ++){
          System.out.println(catLitter.get(i).getName());
      }
      //2// most frequent element.
      ArrayList<Integer> intArray = new ArrayList<Integer>();

      intArray.add(0,1);
      intArray.add(1,1);
      intArray.add(2,3);
      intArray.add(3,5);
      intArray.add(4,1);

      mostFrequentElement(intArray);
      //2: Bonus// What needs to be changed to make this work on an array of Strings?
      //A: Changing both the input parameters and elements of the key and values in the hashmap. Values only in the array (because of index)

      //3//Pod Hashmap
            //1// Create a HashMap that maps the names of all the Access Coders in your Pod to their age.
      HashMap<String,Integer>  podMap = new HashMap<String, Integer>();

      podMap.put("Elvis", 21 );
      podMap.put("Allison",20);
      podMap.put("Sarah", 18);
      podMap.put("Marbella",19);
      podMap.put("John",50);

            //2// Use a loop to print each key-value pair of the HashMap.

      for(int i =0; i<podMap.size()-podMap.size()+1; i++){

          System.out.println(podMap);

            //If it's stupid but it works, it ain't stupid. :)
      }


      //4//canRentACar
      System.out.println(canRentAcar(podMap));









  }
}
