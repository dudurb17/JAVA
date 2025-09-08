import java.util.Scanner;
import java.io.IOException;

public class Main {
  public static void main(String [] args) throws IOException {

    Scanner scanner = new Scanner(System.in);

     double raio = scanner.nextDouble();

     double area = 3.14159 * (raio * raio);

     System.out.println("A=" + String.format("%.4f", area));
  }
}