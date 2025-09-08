import java.util.Scanner;
import java.io.IOException;

public class Main {

  public static void main(String [] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    
    int X = scanner.nextInt();
    
    for (int i = 1; i <= X; i++) {
      if (i % 2 != 0) {
        System.out.println(i);
      }
    }
  }
}
