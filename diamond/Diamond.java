import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int size = scan.nextInt();
    int num = size / 2;

    if (size % 2 == 0) {

      // even numbers
      for (int i = num * 2; i > 0; i--) {
        System.out.print(" ");
      }

      System.out.print("*");

      for (int i = 0; i <= num; i++) {
        for (int j = 0; j < num * 2 - (i * 2); j++) {
          System.out.print(" ");
        }

        for (int j = 1; j <= i * 2; j++) {
          System.out.print(" *");
        }

        System.out.println();
      }

      for (int i = num - 1; i >= 1; i--) {
        for (int j = 0; j < num * 2 - (i * 2); j++) {
          System.out.print(" ");
        }

        for (int j = 1; j <= i * 2; j++) {
          System.out.print(" *");
        }

        System.out.println();
      }

      for (int i = num * 2; i > 0; i--) {
        System.out.print(" ");
      }

      System.out.println("*");
    } else {

      // odd numbers
      for (int i = 0; i <= num; i++) {
        for (int j = 0; j <= num - i; j++) {
          System.out.print(" ");
        }

        for (int j = 0; j < i * 2 + 1; j++) {
          System.out.print("*");
        }

        System.out.println();
      }

      for (int i = num - 1; i >= 0; i--) {
        for (int j = 0; j <= num - i; j++) {
          System.out.print(" ");
        }

        for (int j = 0; j < i * 2 + 1; j++) {
          System.out.print("*");
        }

        System.out.println();
      }
    }

    scan.close();
  }
}
