/**
 * Created by alexandraqin on 4/14/15.
 */
public class ClassesAndObjects {
    //2//Write a method called isOlder that takes 2 Cats as parameters
    // and returns whether or not the first Cat is older than the second.
    public static boolean isOlder(Cat cat1, Cat cat2){

        if(cat1.getAge()>cat2.getAge()){
            return true;
        }else {
            return false;
        }

    }
    //3//Write a method called makeBestFriends that takes 2 Cats as
    //parameters and sets both of their favorite foods to the same thing.
    public static void makeBestFriends(Cat cat1, Cat cat2){

        cat1.setFavoriteFood("Same thing");
        cat2.setFavoriteFood("Same thing");

        //**OR**
        //String favfood = cat1.getFavoriteFood();
        //cat2.setFavoriteFood(favfood);

    }
    //4//Write a method called makeKitten that takes 2 Cats as
    // parameters and returns a new Cat with a name that is
    // the combination of the 2 parent Cats' names. The age of the new Cat should be 0.
    public static Cat makeKitten (Cat cat1, Cat cat2){

        Cat babeKitten = new Cat(cat1.getName()+cat2.getName());
        babeKitten.setAge(0);

        return babeKitten;
    }
    //5//Write a method called adoption that takes 1 Cat and 1
    //Person as a paramater and sets the Cat's owner to be the Person.
    public static void adoption (Cat cat1, Person person){

        if(cat1.getName().equals("Catwoman")){
            cat1.setName(null);
            System.out.println("Catwoman will never be anyones pet!");
        }else{
            cat1.setOwner(person);
        }
    }
    //6//Write a method called isFree that checks whether or not a Cat has an owner.
    public static boolean isFree(Cat cat){
        if(cat.getOwner()==null){
            return true;
        }else{
            return false;
        }
    }
    //7/Write a method called isSibling that checks whether or not 2 Cats have the same owner.
    public static boolean isSibling(Cat cat1, Cat cat2){
        if(cat1.getOwner()==cat2.getOwner()){
            return true;
        }else{
            return false;
        }
    }
  public static void main (String args[]) {
      //1
      Cat garfield = new Cat("Garfield");
      garfield.setFavoriteFood("Lasagna");
      garfield.setAge(37);


      Cat pinkPanther = new Cat("Pink Panther");
      pinkPanther.setFavoriteFood("Diamonds");
      pinkPanther.setAge(52);

      Cat catWoman = new Cat("Catwoman");
      catWoman.setFavoriteFood("Men");
      catWoman.setAge(75);

      //2
      System.out.println(isOlder(catWoman, pinkPanther));

      //3//
      makeBestFriends(catWoman,garfield);

      //4//
      System.out.println(makeKitten(catWoman, garfield).getName());

      //5//
      Person jon = new Person("John");
      adoption(garfield,jon);
      //5:Bonus//
      adoption(catWoman,jon);
      //(darn it! I'm allergic to cats anyway.)

      //6//
      System.out.println(isFree(pinkPanther));

      //7//
      System.out.println(isSibling(pinkPanther,catWoman));






















  }
}
