import java.util.Scanner;

public class rectangle {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("\nPlease enter a length: ");
    double length = in.nextDouble();
    System.out.print("Please enter a width: ");
    double width = in.nextDouble();
    double area = length * width;
    System.out.printf("\nThe area of a %.1f-by-", length);
    System.out.printf("%.1f rectangle is ", width);
    System.out.printf("%.1f.\n", area);
    in.close();
  }
}
