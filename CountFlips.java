public class CountFlips {
//-----------------------------------------------------------
// Creates a Coin object, flips it, and prints the results.
//-----------------------------------------------------------
  public static void main(String[] args) {
    final int FLIPS = 100;
    int headsCount = 0;
    int tailsCount = 0;

    Coin myCoin = new Coin();

    for (int i = 0; i < FLIPS; i++){
      myCoin.flip();

      if (myCoin.isHeads()) {
        headsCount++;
      } else {
        tailsCount++;
      }
    }

    System.out.println("After" + FLIPS + "Flips");
    System.out.println("Heads: " + headsCount);
    System.out.println("Tails: " + tailsCount);
  }
}
