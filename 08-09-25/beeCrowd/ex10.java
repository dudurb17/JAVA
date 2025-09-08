import java.util.Scanner;
import java.io.IOException;

public class Main {

  public static void main(String [] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    int segundos = scanner.nextInt();
    
    int horas = segundos / 3600;
    int minutos = (segundos % 3600) / 60;
    int segundosRestantes = segundos % 60;
    
    System.out.println(horas + ":" + minutos + ":" + segundosRestantes);
  }
}
