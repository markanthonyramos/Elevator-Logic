import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Grocery {
    public static ArrayList<String> foodCategories = new ArrayList<String>();

    public static ArrayList<Order> meatAndFish = new ArrayList<Order>();
    public static ArrayList<Order> produce = new ArrayList<Order>();
    public static ArrayList<Order> grainsAndBread = new ArrayList<Order>();
    public static ArrayList<Order> condiments = new ArrayList<Order>();
    public static ArrayList<Order> oilAndFat = new ArrayList<Order>();
    public static ArrayList<Order> dairyAndEggs = new ArrayList<Order>();

    public static ArrayList<Order> totalOrder = new ArrayList<Order>();

    public static int totalPrice = 0;

    public static String customerName;

    public static void checkout(){
        StringBuilder sb = new StringBuilder();

        sb.append("Here are your lists of order").append("\n").append("\n");

        totalOrder.forEach(order -> {
            sb.append(order.foodCategory).append(": ").append(order.foodName).append("\n");
            totalPrice += order.price;
        });

        sb.append("\n").append("Total Orders: ").append(totalOrder.size());
        sb.append("\n").append("Total Price: ").append(totalPrice);
        sb.append("\n").append("Customer Name: ").append(customerName);

        JOptionPane.showMessageDialog(null,sb.toString(),"E-Market",JOptionPane.PLAIN_MESSAGE);
    }

    public static void orderAgain() {
        int again = Integer.parseInt(JOptionPane.showInputDialog("Do you want to order again?" +
                "\n1 - Yes" + "\n2 - No, Proceed to checkout"));

        switch (again) {
            case 1:
                selectCategory();
                break;
            case 2:
                checkout();
                break;
        }
    }

    public static void placeOrder(String foodCategory, String foodName, int price) {
        totalOrder.add(new Order(foodCategory, foodName, price));
    }

    public static String returnCategoryFoodName(ArrayList foodCategory) {
        StringBuilder sb = new StringBuilder();

        sb.append("Choose a number you want to order").append("\n").append("\n");

        for(int i = 0; i < foodCategory.size(); i++) {
            sb.append(i + " - ").append(foodCategory.get(i)).append("\n");
        }

        return sb.append("\n").append("Enter the number you want to order:").toString();
    }

    public static String returnFoodNames(ArrayList<Order> foodCategory) {
        StringBuilder sb = new StringBuilder();

        sb.append("Choose a number you want to order").append("\n").append("\n");

        for(int i = 0; i < foodCategory.size(); i++) {
            sb.append(i + " - ").append(foodCategory.get(i).foodName).append(" | ").append(foodCategory.get(i).price).append("\n");
        }

        return sb.append("\n").append("Enter the number you want to order:").toString();
    }

    public static void meatAndFishOrder() {
        int meat = Integer.parseInt(JOptionPane.showInputDialog(null,returnFoodNames(meatAndFish)));

        placeOrder(foodCategories.get(0), meatAndFish.get(meat).foodName, meatAndFish.get(meat).price);
    }

    public static void produceOrder() {
        int pro = Integer.parseInt(JOptionPane.showInputDialog(null,returnFoodNames(produce)));

        placeOrder(foodCategories.get(1), produce.get(pro).foodName, produce.get(pro).price);
    }

    public static void grainsAndBreadOrder() {
        int grain = Integer.parseInt(JOptionPane.showInputDialog(null,returnFoodNames(grainsAndBread)));

        placeOrder(foodCategories.get(2), grainsAndBread.get(grain).foodName, grainsAndBread.get(grain).price);
    }

    public static void condimentsOrder() {
        int cond = Integer.parseInt(JOptionPane.showInputDialog(null,returnFoodNames(condiments)));

        placeOrder(foodCategories.get(3), condiments.get(cond).foodName, condiments.get(cond).price);
    }

    public static void oilAndFatOrder() {
        int oil = Integer.parseInt(JOptionPane.showInputDialog(null,returnFoodNames(oilAndFat)));

        placeOrder(foodCategories.get(4), oilAndFat.get(oil).foodName, oilAndFat.get(oil).price);
    }

    public static void dairyAndEggsOrder() {
        int dairy = Integer.parseInt(JOptionPane.showInputDialog(null,returnFoodNames(dairyAndEggs)));

        placeOrder(foodCategories.get(5), dairyAndEggs.get(dairy).foodName, dairyAndEggs.get(dairy).price);
    }
    
    public static void selectCategory(){
        int order = Integer.parseInt(JOptionPane.showInputDialog(null,returnCategoryFoodName(foodCategories)));

        switch (order) {
            case 0:
                meatAndFishOrder();
                break;
            case 1:
                produceOrder();
                break;
            case 2:
                grainsAndBreadOrder();
                break;
            case 3:
                condimentsOrder();
                break;
            case 4:
                oilAndFatOrder();
                break;
            case 5:
                dairyAndEggsOrder();
                break;
        }

        orderAgain();
    }

    public static void order(){
        customerName = JOptionPane.showInputDialog(null,"Welcome to E-Market!" + "\n" + "\n" + "What's your name?","E-Market",JOptionPane.PLAIN_MESSAGE);
    }
    
    public static void main(String[] args){
        foodCategories.add("Meat and Fish");
        foodCategories.add("Produce");
        foodCategories.add("Grains and Bread");
        foodCategories.add("Condiments");
        foodCategories.add("Oil and Fat");
        foodCategories.add("Dairy and Eggs");

        meatAndFish.add(new Order("Meat and Fish", "Skinless white meat", 123));
        meatAndFish.add(new Order("Meat and Fish", "Lean cuts of red meat", 123));
        meatAndFish.add(new Order("Meat and Fish", "Tuna", 123));
        meatAndFish.add(new Order("Meat and Fish", "Bangus", 123));
        meatAndFish.add(new Order("Meat and Fish", "Tilapia", 123));
        meatAndFish.add(new Order("Meat and Fish", "Chicken", 123));
        meatAndFish.add(new Order("Meat and Fish", "Luncheon Meat", 123));

        produce.add(new Order("Produce", "Onions", 123));
        produce.add(new Order("Produce", "Garlic", 123));

        grainsAndBread.add(new Order("Grains and Bread", "Pasta", 123));
        grainsAndBread.add(new Order("Grains and Bread", "Rice", 123));
        grainsAndBread.add(new Order("Grains and Bread", "Bread", 123));
        grainsAndBread.add(new Order("Grains and Bread", "All purpose flour", 123));

        condiments.add(new Order("Condiments", "Salt", 123));
        condiments.add(new Order("Condiments", "Pepper", 123));
        condiments.add(new Order("Condiments", "Honey", 123));
        condiments.add(new Order("Condiments", "Sugar", 123));
        condiments.add(new Order("Condiments", "Soy Sauce", 123));
        condiments.add(new Order("Condiments", "Vinegar", 123));
        condiments.add(new Order("Condiments", "Stock Cubes", 123));

        oilAndFat.add(new Order("Oil and Fat", "Cooking Oil", 123));
        oilAndFat.add(new Order("Oil and Fat", "Butter", 123));
        oilAndFat.add(new Order("Oil and Fat", "Vegetable Oil", 123));

        dairyAndEggs.add(new Order("Dairy and Eggs", "Milk", 123));
        dairyAndEggs.add(new Order("Dairy and Eggs", "Eggs", 123));
        dairyAndEggs.add(new Order("Dairy and Eggs", "Cheese", 123));
        dairyAndEggs.add(new Order("Dairy and Eggs", "Yogurt", 123));

        order();
        selectCategory();
    }
}


