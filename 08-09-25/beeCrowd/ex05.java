import java.util.Scanner;
import java.io.IOException;

public class Main {

  public static void main(String [] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    
    int codigo1 = scanner.nextInt();
    int quantidade1 = scanner.nextInt();
    double valorUnitario1 = scanner.nextDouble();
    
    int codigo2 = scanner.nextInt();
    int quantidade2 = scanner.nextInt();
    double valorUnitario2 = scanner.nextDouble();
    
    double valorTotal = (quantidade1 * valorUnitario1) + (quantidade2 * valorUnitario2);
    
    System.out.println("VALOR A PAGAR: R$ " + String.format("%.2f", valorTotal));
  }
}