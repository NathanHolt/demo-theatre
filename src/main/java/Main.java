import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //create age(int) and price(double) variables
        Scanner scan = new Scanner(System.in);
        NumberFormat numFor = NumberFormat.getCurrencyInstance();

        double price = 12.5;
        int age;

        System.out.println("Please enter your age");
        age = scan.nextInt();
        scan.nextLine();


        if (age <= 10) {
            price = 5;
        } else if (age > 65) {
            price = 8;
        }

//        print out result
        System.out.println("Your ticket price is: " + numFor.format(price));
    }
}


//        scanner.nextLine();
//
//        scanner.nextInt();
//        scanner.nextDouble();

//        System.out.println();
//        System.out.print();


//        if check for child
//        age < 11

//        if (age < 9) {
//            price = 100;
//        }

//        else {
//            price = 12.5;
//        }

