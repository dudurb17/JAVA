import java.util.Scanner;
import java.io.IOException;

public class Main {

  public static void main(String [] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    
    double A = scanner.nextDouble();
    double B = scanner.nextDouble();
    double C = scanner.nextDouble();
    
    double discriminante = (B * B) - (4 * A * C);
    
    if (A == 0 || discriminante < 0) {
      System.out.println("Impossivel calcular");
    } else {
      double raiz1 = (-B + Math.sqrt(discriminante)) / (2 * A);
      double raiz2 = (-B - Math.sqrt(discriminante)) / (2 * A);
      
      System.out.println("R1 = " + String.format("%.5f", raiz1));
      System.out.println("R2 = " + String.format("%.5f", raiz2));
    }
  }
}
