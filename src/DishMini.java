import java.util.Locale;

class Dish {
    private int costInCents;
    private String nameOfDish;
    private Boolean wouldRec;

    private static long totalDishes = 0;


    public Dish() {
        totalDishes++;
    }



    public String getDish(){
        return "\nDish name: "+nameOfDish+"\n"+
                "Cost in Cents: "+costInCents+"\n"+
                "Would Recommend: "+wouldRec+"\n"+
                "Dish number: "+totalDishes+"\n";

    }

    public Dish(String nameOfDish, Integer costInCents, Boolean wouldRec) {
        this();
        this.nameOfDish = nameOfDish;
        this.costInCents = costInCents;
        this.wouldRec = wouldRec;
    }


    public static long getTotalDishes() {
        return totalDishes;
    }

    public static void setTotalDishes(long totalDishes) {
        Dish.totalDishes = totalDishes;
    }

    public String getNameOfDish() {
        return nameOfDish;
    }

    public void setNameOfDish(String nameOfDish) {
        this.nameOfDish = nameOfDish;
    }

    public Boolean getWouldRec() {
        return wouldRec;
    }

    public void setWouldRec(Boolean wouldRec) {
        this.wouldRec = wouldRec;
    }

    public int getCostInCents() {
        return costInCents;
    }

    public void setCostInCents(int costInCents) {
        this.costInCents = costInCents;
    }



}
class DishTools{
    static final int AVG_COST_OF_DISH_IN_CENTS = 13000;


    public static void shoutDishName( Dish dish){
        System.out.println(dish.getNameOfDish().toUpperCase());
    }

    public static void  analyzeDishCost(Dish dish){
        String moreOrLess =
                (dish.getCostInCents() > AVG_COST_OF_DISH_IN_CENTS) ? "More" : "Less" ;
        System.out.println( moreOrLess + " expensive then avg \n" );
    }

}




public class DishMini {
    public static void main(String[] args) {
        // this is where we will work on the mini exercises
        Dish dish1 = new Dish(
                "small snails",
                30,
                false);

        System.out.println("dish1 = " + dish1.getDish());
        DishTools.analyzeDishCost(dish1);
        DishTools.shoutDishName(dish1);
        Dish dish2 = new Dish(
                "tacos",
                200,
                true);

        System.out.println("dish2 = " + dish2.getDish());
        DishTools.analyzeDishCost(dish2);
        DishTools.shoutDishName(dish2);
        Dish dish3 = new Dish(
                "golden ice cream",
                100000,
                true);
        System.out.println("dish3 = " + dish3.getDish());
        DishTools.analyzeDishCost(dish3);
        DishTools.shoutDishName(dish3);

    }
}
