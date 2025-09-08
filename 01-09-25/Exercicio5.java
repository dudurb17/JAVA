import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite uma string: ");
        String texto = scanner.nextLine();
        
        int contadorVogais = 0;
        
        for (int i = 0; i < texto.length(); i++) {
            char caractere = texto.charAt(i);
              
            if (caractere == 'a' || caractere == 'A' ||
                caractere == 'e' || caractere == 'E' ||
                caractere == 'i' || caractere == 'I' ||
                caractere == 'o' || caractere == 'O' ||
                caractere == 'u' || caractere == 'U') {
                contadorVogais++;
            }
        }
        
        System.out.println("A string \"" + texto + "\" contém " + contadorVogais + " vogais.");
        
        scanner.close();
    }
} 