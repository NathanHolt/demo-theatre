public class Demo {
    public static void main(String[] args) {

        boolean lights = true;
        char initial = 'n';
        int x = 40;
        String test = "test";
        String message1 = "none";
        String message2 = "none";

//        lowercase/primitive ==
        if ('n' == initial) {
            System.out.println("correct");
        }

//        uppercase/non-primitive .equals
        if ("test".equals(test)) {
            System.out.println("This is a test!!!");
        }


        if (lights) {
            System.out.println("the lights are on");
        } else {
            System.out.println("the lights are off");
        }

        lights = !lights;

        if (lights) {
            System.out.println("the lights are on");
        } else {
            System.out.println("the lights are off");
        }


        if (x > 30) {
            message1 = "x is greater";
        }
//        else if (x > 3) {
//            message1 = "nine is greater";
//        }
        else{
            message1 = "nine is not greater";
        }

        message2 = (x > 3) ? "nine is greater" : "nine is not greater";

        System.out.println(message1);
        System.out.println(message2);

    }
}
