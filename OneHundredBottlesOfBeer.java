import java.util.Scanner;

public class OneHundredBottlesOfBeer {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in)

    System.out.print("Enter the number of veerses to print (1-100): ");

    while (verses < 1 || verses > 100 ) {

      System.out.print("Invalid input. Enter a number 1 and 100:" );

      verses = scan.nextInt();

    }

    System.out.println();

    int bottles = 100;

    for (int count = 0; count < verses; count++) {

      System.out.println(bottles + " bottles of beer on the wall");
      System.out.println(bottles + "bottles of beer");
      System.out.println("if one of those bottles should happen to fall");

      bottles--;

      if (bottles > 0)
        System.err.println(bottles + "bottles of beer on the wall");
      else
        System.out.println("No more bottles of beer on the wall");

      System.out.println();

    }

    scan.close();

  }
}
