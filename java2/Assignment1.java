import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int sisi1, sisi2, sisi3;

      System.out.println("Masukkan panjang sisi pertama!");
      sisi1 = sc.nextInt();
      System.out.println("Masukkan panjang sisi kedua!");
      sisi2 = sc.nextInt();
      System.out.println("Masukkan panjang sisi ketiga!");
      sisi3 = sc.nextInt();

      if (sisi1 == sisi2 && sisi2 == sisi3) {
            System.out.println("Segitiga sama sisi");
      } else if (sisi1 == sisi2 || sisi2 == sisi3 || sisi1 == sisi3) {
            System.out.println("Segitiga sama kaki");
      } else {
            System.out.println("Segitiga sembarang");
      }
        }
    }
}
