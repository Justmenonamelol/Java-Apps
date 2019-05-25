import java.util.Scanner;

public class currencyExchange {

    public static void main(String[] args) {
        int MenuList;
        char decision;
        Long Value;
        Double result;


        do {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Please make a selection:");
            System.out.println("1) Pounds to Euro"); // Europe
            System.out.println("2) Pounds to Dollars"); // USA
            System.out.println("3) Pounds to Yen"); // Japan
            System.out.println("4) Pounds to Krona"); // Sweden
            System.out.println("--------------------------");
            System.out.println("Enter The Selection Number:");
            try {
                MenuList = keyboard.nextInt();
                // Menu selection
                switch (MenuList) {
                    case 1:
                        System.out.printf("Enter The amount of how many Pounds to Euro: ");
                        Value = keyboard.nextLong(); // Amount of the Currency(In this case: Pound);
                        result = Value * 1.15;
                        System.out.printf("Converted Pounds value is: € %9.2f", result); // Currently 1£ = 1.15€ (Euro);
                        System.out.println();
                        break;
                    case 2:
                        System.out.printf("Enter The amount of how many Pounds to Dollars:");
                        Value = keyboard.nextLong(); // Amount of the Currency(In this case: Pound);
                        result = Value * 1.28;
                        System.out.printf("Converted Pounds value is:\u0024%9.2f", result); // Currently 1£ = 1.28$ (Dollar);
                        System.out.println();
                        break;
                    case 3:
                        System.out.printf("Enter The amount of how many Pounds to Yen:");
                        Value = keyboard.nextLong(); // Amount of the Currency(In this case: Pound);
                        result = Value * 142.630;
                        System.out.printf("Converted Pounds value is:¥ %9.3f", result); // Currently 1£ = 142.630‎¥‎ ‎(Yen);
                        System.out.println();
                        break;
                    case 4:
                        System.out.print("Enter The amount of how many Pounds to Krona:");
                        Value = keyboard.nextLong(); // Amount of the Currency(In this case: Pound);
                        result = Value * 12.30;
                        System.out.printf("Converted Pounds value is: %9.2f", result); // Currently 1£ = 12.30kr ‎(Krona);
                        System.out.println();
                        break;
                    default:
                        System.out.println("Pick the number range between 1 and 4");

                }
            }catch (Exception e){
                System.out.println("Something went wrong");
                break;
            }
    finally {
        System.out.println("Try to restart the program");
    }
            // This code needs some improvement
            System.out.println("Would you like to continue? (Y/y or N/n)");
            decision = keyboard.next().charAt(0); // Decision either Y (Yes) or N (No);
        }
        while (decision == 'Y' || decision == 'y'); {
        }
        System.out.println("Thank you for using the software");
    }
}
