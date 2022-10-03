import java.util.Scanner;
public class FuelCost {
    public static void main(String[] args) {
        double numGallons;
        double fuelEfficency;
        double price;
        double milesCanGo;
        double numofGallonsPer100Miles;
        String trash;

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number of fuel gallons in the car's tank:");
        if (in.hasNextDouble()) {
            numGallons = in.nextDouble();
            in.nextLine();
            System.out.println(" What is the fuel efficiency of you car in miles/gallons");
            if (in.hasNextDouble()) {
                fuelEfficency = in.nextDouble();
                in.nextLine();
                System.out.println("How much is the price per gallon:");
                if (in.hasNextDouble()) {
                    price = in.nextDouble();
                    milesCanGo = fuelEfficency * numGallons;
                    double numOfGallonsPer100Miles = 100 / fuelEfficency;
                    in.nextLine();
                    System.out.println(" The cost per 100 miles is: " + numOfGallonsPer100Miles * price);
                    System.out.println("You car can go as far as: " + milesCanGo + " miles with the current fuel " + "in your tank ");
                    in.nextLine();
                } else {
                    trash = in.nextLine();
                    System.out.println("You entered an invalid valued " + trash);
                }
            }
        }
    }
}
