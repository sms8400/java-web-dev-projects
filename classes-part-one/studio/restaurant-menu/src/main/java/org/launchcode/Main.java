package org.launchcode;


public class Main {

    public static void main(String[] args) {
        // write your code here
        Menu menu = new Menu();

        MenuItem pizza = new MenuItem("Pizza", "Cheese bread","Main Course", 15.99);
        MenuItem chickenPasta = new MenuItem("Chicken Pasta", "Fettuccine with grilled free roam chicken ","Main Course", 18.99);
        MenuItem iceCream = new MenuItem("Ice Cream", "Vanilla butter churned","Dessert", 5.99);
        MenuItem macAttack = new MenuItem("Mac Attack", "Mac & Cheese Balls","Appetizer", 9.99);
        MenuItem wine = new MenuItem("Wine", "Italian wine","Alcohol", 19.99);

        menu.addMenuItem(pizza);
        menu.addMenuItem(chickenPasta);
        menu.addMenuItem(iceCream);
        menu.addMenuItem(macAttack);
        menu.addMenuItem(wine);

        menu.printMenu();

    }


}