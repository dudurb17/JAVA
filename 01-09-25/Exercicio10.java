import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um valor inteiro: ");
        int valor = scanner.nextInt();
        
        int valorOriginal = valor;
        
        int[] notas = {100, 50, 20, 10, 5, 2, 1};
        
        System.out.println("Para R$ " + valorOriginal + " são necessárias:");
        
        for (int i = 0; i < notas.length; i++) {
            int quantidade = valor / notas[i];
            
            if (quantidade > 0) {
                System.out.println(quantidade + " nota(s) de R$ " + notas[i]);
                valor = valor % notas[i]; 
            }
        }
        
        scanner.close();
    }
} 