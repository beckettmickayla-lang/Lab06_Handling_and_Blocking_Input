import java.util.Scanner;
void main() {
Scanner scanner = new Scanner (System.in);
    double celsius = 0;
    boolean done = false;
    String trash = "";
    do {
        System.out.print("Enter the temperature in Celsius: ");
                if (scanner.hasNextDouble()) {
                    celsius = scanner.nextDouble();
                    scanner.nextLine();
                    done = true;
                } else {
                    trash = scanner.nextLine();
                    System.out.println("Please enter a valid Celsius temperature. You entered: " + trash);
                    scanner.next();
                }
    } while (!done);
        double farenheit = (celsius * 9/5) + 32;
                System.out.print("The Farenheit temperature is: " + farenheit);
        scanner.close();
}
