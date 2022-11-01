import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        CoffeeShop spanishCoffeeShop = new SpanishCoffeeShop();
        CoffeeShop englishCoffeeShop = new EnglishCoffeeShop();

        System.out.println("Choose your coffee: ");
        for (CoffeeType ct: CoffeeType.values()) { //menu
            System.out.println(ct);
        }

        int choice = in.nextInt(); //coffee choice
        while(choice < 1 || choice > 4) { //checking for valid input
            System.out.println("You entered incorrectly. Try again");
            choice = in.nextInt();
        }

        System.out.println("English or Spanish?(1-eng, 2-spa)");
        int style = in.nextInt(); //style choice
        while(style < 1 || style > 2) { //checking for valid input
            System.out.println("You entered incorrectly. Try again");
            style = in.nextInt();
        }

        if(style == 1) { //for English coffee

            switch (choice) {
                case 1:
                    englishCoffeeShop.orderCoffee(CoffeeType.AMERICANO);
                    break;

                case 2:
                    englishCoffeeShop.orderCoffee(CoffeeType.ESPRESSO);
                    break;

                case 3:
                    englishCoffeeShop.orderCoffee(CoffeeType.CAPPUCCINO);
                    break;

                case 4:
                    englishCoffeeShop.orderCoffee(CoffeeType.CAFFE_LATTE);
                    break;
            }
        }

        if (style == 2) { //for Spanish coffee

            switch (choice) {
                case 1:
                    spanishCoffeeShop.orderCoffee(CoffeeType.AMERICANO);
                    break;

                case 2:
                    spanishCoffeeShop.orderCoffee(CoffeeType.ESPRESSO);
                    break;

                case 3:
                    spanishCoffeeShop.orderCoffee(CoffeeType.CAPPUCCINO);
                    break;

                case 4:
                    spanishCoffeeShop.orderCoffee(CoffeeType.CAFFE_LATTE);
                    break;
            }
        }
    }
}