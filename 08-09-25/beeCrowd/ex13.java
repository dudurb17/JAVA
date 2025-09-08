import java.util.Scanner;
import java.io.IOException;

public class Main {

  public static void main(String [] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    
    int codigo = scanner.nextInt();
    int quantidade = scanner.nextInt();
    
    double preco = 0.0;
    switch (codigo) {
      case 1:
        preco = 4.00;
        break;
      case 2:
        preco = 4.50;
        break;
      case 3:
        preco = 5.00;
        break;
      case 4:
        preco = 2.00;
        break;
      case 5:
        preco = 1.50;
        break;
    }
    
    double total = preco * quantidade;
    
    System.out.println("Total: R$ " + String.format("%.2f", total));
  }
}
