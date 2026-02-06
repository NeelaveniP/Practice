import java.util.Scanner;

public class ElectricityBillCalculator {

    // Method 1: Get rate based on consumer type and slab
    static int getRate(int consumerType, int slab) {
        if (consumerType == 1) { // Domestic
            if (slab == 1) return 2;
            else if (slab == 2) return 3;
            else return 5;
        } else if (consumerType == 2) { // Commercial
            if (slab == 1) return 5;
            else if (slab == 2) return 7;
            else return 10;
        }
        return 0;
    }

    // Method 2: Calculate total bill
    static double calculateBill(int consumerType, int units) {
        double bill = 0;

        if (units > 200) {
            bill += 100 * getRate(consumerType, 1);
            bill += 100 * getRate(consumerType, 2);
            bill += (units - 200) * getRate(consumerType, 3);
        } else if (units > 100) {
            bill += 100 * getRate(consumerType, 1);
            bill += (units - 100) * getRate(consumerType, 2);
        } else {
            bill += units * getRate(consumerType, 1);
        }

        return bill;
    }

    // Method 3: Display bill details
    static void displayBill(int consumerId, int units, double amount) {
        System.out.println("\n----- Electricity Bill -----");
        System.out.println("Consumer ID     : " + consumerId);
        System.out.println("Units Consumed  : " + units);
        System.out.println("Total Amount    : ₹" + amount);
        System.out.println("-----------------------------\n");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.print("Enter Consumer ID: ");
            int consumerId = sc.nextInt();

            System.out.print("Enter Consumer Type (1-Domestic, 2-Commercial): ");
            int consumerType = sc.nextInt();

            if (consumerType != 1 && consumerType != 2) {
                System.out.println("Invalid Consumer Type! Skipping...\n");
                continue;
            }

            System.out.print("Enter Units Consumed: ");
            int units = sc.nextInt();

            if (units <= 0) {
                System.out.println("Invalid Units! Skipping...\n");
                continue;
            }

            double billAmount = calculateBill(consumerType, units);
            displayBill(consumerId, units, billAmount);

            System.out.print("Do you want to continue? (Y/N): ");
            char choice = sc.next().charAt(0);

            if (choice == 'N' || choice == 'n') {
                break;
            }
        }

        sc.close();
        System.out.println("\nProgram Ended Successfully.");
    }
}