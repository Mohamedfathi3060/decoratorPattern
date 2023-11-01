/*
* this code define structure of decorator design pattern from Head First DP  Book
* Author:Mohamed Fathi
* Last Change : 1/11/2023
* V: 1.0.2
* */
public class Main {
    public static void main(String[] args) {

        // we define beverage  then it has two types of children
        // First is the regular which can be Espresso , coffee , So on
        // second is abstract decorator which contains a associate to another beverage
        // then each child of decorator should has it's beverage
        // but if beverage is regular so it's finish
        // if it's another decorator so it mean that it has another extra topic



        // regular
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()
                + " $" + beverage.cost());

        // decorate espresso with 2 mocha and soy
        // first create regular beverage
        // then create decorator child and pass regular to it as beverage
        // then create decorator child and pass another decorator to it as beverage
        // so on until finishes this extra topics addedd to regular beverage
        // each cost function in regular has dierct price
        // each decorator has it's price addedd to it's beverage to it

        Beverage beverage2 = new Espresso();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Soy(beverage2);
        System.out.println(beverage2.getDescription()
                + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Soy(beverage3);
        System.out.println(beverage3.getDescription()
                + " $" + beverage3.cost());
    }
}