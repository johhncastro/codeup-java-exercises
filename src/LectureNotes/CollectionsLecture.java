package LectureNotes;

import java.util.*;

// =========================== COLLECTION LESSON =========================
// below is a collection of monsters
public class CollectionsLecture {
    public static void main(String[] args) {
        // this is how you make an array list aka collection
        ArrayList<Monster> monsterList = new ArrayList<>();


        // here we are making the new monsters to add to our collection using the monster class
        Monster orc = new Monster("Orc", 13, 15, 9);
        Monster ogre = new Monster("Ogre", 11, 59, 13);
        Monster blueDragon = new Monster("Blue Dragon", 19, 225, 23);

        // here we are adding all the monsters to add to the monsterList
        monsterList.add(orc);
        monsterList.add(ogre);
        monsterList.add(blueDragon);
        // this is where we sout the monsterList size
        System.out.println(monsterList.size());
        // this is displaying all the names of the monsters inside the console by override the toString method in the monster class
        System.out.println(monsterList);

        // this is a basic i for loop that displays the name dmg and hit points of each monster
//        for (int i = 0; i < monsterList.size();i++){
//            String name = monsterList.get(i).getName();
//            int dmg = monsterList.get(i).getDamage();
//            int hitPoints = monsterList.get(i).getHitPoints();
//            System.out.printf("The %s does %d damage and has %d hit points%n",name,dmg,hitPoints);
//        }


        // this is the same code as above however this is an enhanced for loop and more readable.
        for (Monster monster : monsterList) {
            String name = monster.getName();
            int dmg = monster.getDamage();
            int hitPoints = monster.getHitPoints();
            System.out.printf("The %s does %d damage and has %d hit points%n", name, dmg, hitPoints);
        }



        // below i show how to remove obj from list
        // here we remove blue dragon from monster list and then check the size
//        monsterList.remove(blueDragon);
//        System.out.println(monsterList.size());


        // here we remove orc by using the index to which it was added then checking the  size of the list.
//        monsterList.remove(1);
//        System.out.println(monsterList.size());

        //this is how you make a collection of numbers using array list.
        ArrayList<Integer> myNumbers = new ArrayList<>();
        // here we add 3 numbers to the array list.
        myNumbers.add(13);
        myNumbers.add(134);
        myNumbers.add(3);
        // here we are going to get "134" in the console because 134 is at the index of 1 and 13 is at 0
        System.out.println(myNumbers.get(1));
        //since the data is primitive u can read in console and using collections.sort u can sort the numbers in the console
        System.out.println(myNumbers);
        // line 68 is what sorts the nums this can only be uses bc myNumbers are a primitive data type
        Collections.sort(myNumbers);
        System.out.println(myNumbers);

        // ======================== END OF ARRAY LIST SECTION =====================//
        System.out.println("///////// START OF HASH MAP ////////////");
        /// ======================= HASH MAP LESSON ===============================//
        HashMap<String,Integer> careerWins = new HashMap<>();
        // what we have are keys and values (String = key) and the  (int =num)
        careerWins.put("john: ",99);
        careerWins.put("goog: ",3);
        careerWins.put("ariel: ",11);

        System.out.println(careerWins.get("john"));
        // this shows the structure of the hash map (the order is very random so if u need to order use a list)
        System.out.println(careerWins);


        // here we can add 1 more win to john
        careerWins.replace("john",100);
        System.out.println(careerWins);

        System.out.println("////////////// START OF SET COLLECTION ///////////////");
        // this is an enhanced for loop that will iterate over each obj and display in console in no particular order
        for (Map.Entry<String,Integer> careerWinsSet: careerWins.entrySet()){
            System.out.println(careerWinsSet.getKey() +careerWinsSet.getValue());
        }


        // this is how we are going to receive a value to the console
        Set<String> playerNames = careerWins.keySet();
        for (String playerName : playerNames){
            System.out.println(playerName);
        }

        // =========================== END OF HASH MAP =============================//


    }
}
