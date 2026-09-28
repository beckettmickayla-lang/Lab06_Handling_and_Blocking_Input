import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width = 0;
        double height = 0;
        boolean done = false;
        String trash = "";
        do {
            System.out.print("Enter the height of the rectangle: ");
            if (scanner.hasNextDouble()) {
                height = scanner.nextDouble();
                scanner.nextLine();
                done = true;
            } else {
                trash = scanner.nextLine();
                System.out.print("Please enter a valid rectangle height. You entered: " + trash);
            }
        } while (!done);
        System.out.print("The height of the rectangle is " + height + ". ");
        done = false;
        do {
            System.out.print("Enter the width of the rectangle: ");
            if (scanner.hasNextDouble()) {
                width = scanner.nextDouble();
                scanner.nextLine();
                done = true;
            } else {
                trash = scanner.nextLine();
                System.out.print("Please enter a valid rectangle width. You entered: " + trash);
            }
        } while (!done);
        System.out.print("The width of the rectangle is: " + width + ". ");
        done = false;
        double area = (width * height);
        double perimeter = (width * 2 + height * 2);
        double cSquared = (width * width + height * height);
        double hypotenuse = Math.sqrt(cSquared);
            System.out.print(" The are of the rectangle is " + area + ". ");
            System.out.print("The perimeter of the rectangle is " + perimeter + ". ");
            System.out.print("The diagonal of the rectangle is " + hypotenuse);
            scanner.close();
        }
    }

