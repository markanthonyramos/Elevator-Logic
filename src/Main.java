import java.util.*;

public class Main {
    static int floors = 5;
    static List<Passenger> passengersList = new ArrayList();
    static double totalWeight = 0;

    public static void main(String[] args) {
        System.out.println(passengersList);

        Scanner sc = new Scanner(System.in);

        System.out.println("How many passengers do we have: ");
        Integer totalPassengers = sc.nextInt();

        for (int i = 0; i < totalPassengers; i++) {
            // Kuhain name ng passenger
            System.out.println("Enter name: ");
            String name = sc.next();

            // Kuhain floor ng bababaan niya
            System.out.println("Floor of drop off: ");
            Integer floorNumber = sc.nextInt();

            System.out.println("Your weight in kilograms: ");
            Integer weight = sc.nextInt();

            // Ilagay yung passenger dun sa listahan
            passengersList.add(new Passenger(name, floorNumber, weight));
        }

        passengersList.forEach((passenger) -> {
            totalWeight += passenger.weight;
        });

        System.out.println("=============================================");
        System.out.println("Our total passengers for this trip are " + passengersList.size());
        System.out.println("The total weight of our passengers are " + totalWeight);
        System.out.println("=============================================");

        for (int currentFloor = 1; currentFloor <= floors; currentFloor++) {
            System.out.println("=============================================");

            System.out.println("We are now at the floor number " + currentFloor);
            // Mag loop dun sa listahan ng passengers para i check kung sino ang bababa
            for (int j = 0; j < passengersList.size(); j++) {
                Passenger foo = passengersList.get(j);

                // Kapag same na ng floor remove sa list ng passengers
                if (foo.floorNumber == currentFloor) {
                    System.out.println(foo.name + ", You may now leave the elevator.");
                    passengersList.remove(j);
                    totalWeight -= foo.weight;
                }
            }

            System.out.println("Our total passengers for the next trip are " + passengersList.size());
            System.out.println("The total weight of our passengers are " + totalWeight);
            System.out.println("=============================================");
        }
    }
}
