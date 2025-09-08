import java.util.Scanner;
import java.io.IOException;

public class Main {
  public static void main(String [] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    int X = scanner.nextInt();
    double Y = scanner.nextDouble();

    double consumo = X / Y;

    System.out.println(String.format("%.3f km/l", consumo));
  }
}