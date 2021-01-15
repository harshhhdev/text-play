import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner numObj = new Scanner(System.in);
    System.out.println("Enter your text to numify");

    String numTextInput = numObj.nextLine();

    for (int i = 0; i < numTextInput.length(); i++) {
      int curChar = numTextInput.charAt(i);

      if (curChar == 'a' || curChar == 'A') {
        System.out.print('4');
      } else if (curChar == 'e' || curChar == 'E') {
        System.out.print('3');
      } else if (curChar == 't' || curChar == 'T') {
        System.out.print('7');
      } else if (curChar == 's' || curChar == 'S') {
        System.out.print('5');
      } else if (
        curChar == 'i' || curChar == 'I' || curChar == 'l' || curChar == 'L'
      ) {
        System.out.print('1');
      } else if (curChar == 'o' || curChar == 'O') {
        System.out.print('0');
      } else if (curChar == 'p' || curChar == 'P') {
        System.out.print('9');
      } else {
        System.out.print(numTextInput.charAt(i));
      }
    }
  }
}
