import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //create age(int) and price(double) variables
        Scanner scan = new Scanner(System.in);
        NumberFormat numFor = NumberFormat.getCurrencyInstance();

        double price = 12.5;
        int age;
        boolean hasToy = false;
        boolean hasSticker = false;
        boolean hasDrink = false;
        boolean hasDiaper = false;


        System.out.println("Please enter your age");
        age = scan.nextInt();
        scan.nextLine();
//        \n \s \t

        if (age <= 10) {
            price = 5;

            if (age <= 1) {
                hasDiaper = true;
            }else if (age < 5) {
                hasToy = true;
            }
        } else if (age > 65) {
            price = 8;

            if (age > 85) {
                hasDrink = true;
            } else if (age > 75) {
                hasSticker = true;
            }
        }

//        print out result
        System.out.println("Your ticket price is: " + numFor.format(price));

        if (hasToy) {
            System.out.println("You get a toy!");
        } else if (hasDiaper) {
            System.out.println("You get a diaper!");
        } else if (hasSticker) {
            System.out.println("You get a sticker!");
        } else if (hasDrink) {
            System.out.println("You get a free drink!");
        } else {
            System.out.println("You get no extra");
        }
    }
}



