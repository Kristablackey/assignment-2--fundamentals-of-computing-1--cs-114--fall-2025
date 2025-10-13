import java.util.Scanner;

public class PrintVowelsAndNonVowels {
  public static void main(String[] args) {

    int countA = 0, countE = 0, countI = 0, countO = 0, countU = 0;
    int nonVowels = 0;

    Scanner input = new Scanner(System.in);

    System.out.println("Write a program that reads a string from the user, then determines and prints how many of each lowercase vowel (a, e, i, o, and u) appear in the entire string. Have a separate counter for each vowel. Also count and print the number of non-vowel characters.");
    String text = input.nextLine();

    text = text.toLowerCase();

    for (int i = 0; i < text.length(); i++) {
      char letter = text.charAt(i);

      switch (letter) {
        case 'a':
          countA++;

          break;

        case 'e':
          countE++;

          break;

        case 'i':
          countI++;

          break;

        case 'o':
          countO++;

          break;

        case 'u':
          countU++;

          break;

        default:
          nonVowels++;

          break;

      }
    }
    System.out.println();
    System.out.println("Number of 'a':" + countA);
    System.out.println("Number of 'e':" + countE);
    System.out.println("Number of 'i':" + countI);
    System.out.println("Number of 'o':" + countO);
    System.out.println("Number of 'u':" + countU);
    System.out.println("Number of 'nonVowels'" + nonVowels);

    input.close();
  }
}
