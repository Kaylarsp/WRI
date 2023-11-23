import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String menu;
        int price, delivery, shipCost, total, totalShipCost;

        System.out.println("Enter the food name :");
        menu = sc.nextLine();
        System.out.println("Enter the food price :");
        price = sc.nextInt();
        System.out.println("Do you want to express delivery (0 = no, 1 = yes)?");
        delivery = sc.nextInt();
        System.out.println("Press the same number (0 = no, 1 = yes)?");
        totalShipCost = sc.nextInt();

        if (price <= 100_000) {
            shipCost = 20_000;
            if (delivery == 1) {
                totalShipCost = shipCost + 25_000;
            } else if (delivery == 0) {
                totalShipCost = shipCost;
            }
        } else {
            shipCost = 30_000;
            if (delivery == 1) {
                totalShipCost = shipCost + 25_000;
            } else if (delivery == 0) {
                totalShipCost = shipCost;
            }
        }
        System.out.println("RECEIPT");
        System.out.println(menu + "\t\t\t" + price);
        System.out.println("Shipping Cost\t\t" + totalShipCost);
        total = price + totalShipCost;
        System.out.println("Total\t\t\t" + total);
    }
}
