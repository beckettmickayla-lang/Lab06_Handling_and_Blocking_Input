import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double gasGallons = 0;
        double fuelEfficiency = 0;
        double gasPrice = 0;
        boolean done = false;
        String trash = "";
        do {
            System.out.print("Enter the number of gallons of gas in the tank: ");
            if (scanner.hasNextDouble()) {
                gasGallons = scanner.nextDouble();
                scanner.nextLine();
                done = true;
            } else {
                trash = scanner.nextLine();
                System.out.print("Please enter a valid number of gallons of gas in the tank. You entered: " + trash);
            }
        } while (!done);
        System.out.print("The number of gallons of gas in the tank is " + gasGallons + ". ");
        done = false;
        do {
            System.out.print("Enter the fuel efficiency of the vehicle in miles per gallon: ");
            if (scanner.hasNextDouble()) {
                fuelEfficiency = scanner.nextDouble();
                scanner.nextLine();
                done = true;
            } else {
                trash = scanner.nextLine();
                System.out.print("Please enter a valid fuel efficiency in miles per gallon. You entered: " + trash);
            }
        } while (!done);
        System.out.print("The fuel efficiency in miles per gallon is: " + fuelEfficiency + ". ");
        done = false;
        do {
            System.out.print("Enter the price of gas per gallon: ");
            if (scanner.hasNextDouble()) {
                gasPrice = scanner.nextDouble();
                scanner.nextLine();
                done = true;
            } else {
                trash = scanner.nextLine();
                System.out.print("Please enter a valid price of gas per gallon. You entered: " + gasPrice);
            }
        } while (!done) ;
            System.out.print("The price of gas per gallon is: " + gasPrice + ". ");
            double cost100Miles = (100 / fuelEfficiency) * gasPrice;
            double milesWithGas = gasGallons * fuelEfficiency;
            System.out.print(" The cost per 100 miles is $" + cost100Miles + ". ");
            System.out.print("The car can go " + milesWithGas + " miles with the available gas.");
            scanner.close();
        }
    }

