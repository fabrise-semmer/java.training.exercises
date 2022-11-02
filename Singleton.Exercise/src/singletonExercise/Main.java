package singletonExercise;

public class Main {
    public static void main(String[] args) {

        ShopList firstList = ShopList.getInstance();
        System.out.println(firstList);

        System.out.println("retorno: " + firstList.addItem("Food Tomato"));
        System.out.println("retorno: " + firstList.addItem("Food Tomato"));
        System.out.println("retorno: " + firstList.addItem("Food Tomato"));
        System.out.println("retorno: " + firstList.addItem("Other Soap"));
        System.out.println("retorno: " + firstList.addItem("Other Tomato"));

        System.out.println(firstList.getFood());
        System.out.println(firstList.getOther());


    }
}