import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //create age(int) and price(double) variables
        Scanner scan = new Scanner(System.in);
        NumberFormat numFor = NumberFormat.getCurrencyInstance();

        double price = 12.5;
        int age;
        String extra = "";

//        String test = extra + " yay";


        System.out.println("Please enter your age");
        age = scan.nextInt();
        scan.nextLine();
//        \n \s \t

        if (age <= 10) {
            price = 5;

            if (age <= 1) {
                extra = "diaper";
            } else if (age < 5) {
                extra = "toy";
            }
        } else if (age > 65) {
            price = 8;

            if (age > 85) {
                extra = "drink";
            } else if (age > 75) {
                extra = "sticker";
            }
        }

//        print out result
        System.out.println("Your ticket price is: " + numFor.format(price));

        switch (extra) {
            case "toy":
                System.out.println("You get a toy!");
                break;
            case "diaper":
                System.out.println("You get a diaper!");
                break;
            case "sticker":
                System.out.println("You get a sticker!");
                break;
            case "drink":
                System.out.println("You get a free drink!");
                break;
            default:
                System.out.println("You get no extra");
                break;
        }
    }
}

//        if (age <= 10)
//         if (age < 5)
//            System.out.println("Free toy!");
//        else
//            System.out.println("Toys are for kids!");


//    boolean canIf = true;
//        int switcher = 43;

//             if (canIf) {
//                    System.out.println("this works!");
//
//                    switch (switcher) {
//                        case 0:
//                            System.out.println("this is nuts");
//                            break;
//                        default:
//                            System.out.println("why would you do this???");
//                    }
//                }

//        if (extra.equals("toy")) {
//            System.out.println("You get a toy!");
//        } else if (extra.equals("diaper")) {
//            System.out.println("You get a diaper!");
//        } else if (extra.equals("sticker")) {
//            System.out.println("You get a sticker!");
//        } else if (extra.equals("drink")) {
//            System.out.println("You get a free drink!");
//        } else {
//            System.out.println("You get no extra");
//        }