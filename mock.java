import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner memeObj = new Scanner(System.in);
    System.out.println("Enter your text to memify");

    String memeTextInput = memeObj.nextLine();

    for (int i = 0; i < memeTextInput.length(); i++) {
      int rand = (int) (1 + (Math.random() * (3 - 1)));

      char curChar = memeTextInput.charAt(i);
      String curStr = Character.toString(curChar);

      if (rand == 1) {
        System.out.print(curStr.toLowerCase());
      } else {
        System.out.print(curStr.toUpperCase());
      }
    }
  }
}
