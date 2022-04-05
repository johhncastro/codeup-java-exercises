import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1 ,2 ,3 ,4 ,5 };
//        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));

//        Person john = new Person("John");
//        Person ariel = new Person("Ariel");
//        Person google = new Person("Google");

        Person[] people = {
                new Person("John"),
                new Person("Ariel"),
                new Person("Google")
        };
//        personArray(people);
        Person[] newArray = addPerson(people, new Person ("kat"));
        personArray(newArray);


    }
    public static void personArray(Person[] people){
        for (int i = 0 ; i < people.length;i++){
            System.out.println(people[i].getName());
        }
    }
    public static Person[] addPerson (Person[] people, Person newPerson){
        Person[] returnPeople = Arrays.copyOf(people, people.length+1);
        returnPeople[people.length]=newPerson;
        return returnPeople;
    }

}
