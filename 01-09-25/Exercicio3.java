import java.util.Arrays;

public class Exercicio3 {
    public static void main(String[] args) {
        double[] valores = {10.5, 8.2, 15.7, 12.1, 9.8, 14.3, 11.0, 13.6};
        
        System.out.println("Vetor original:");
        for (int i = 0; i < valores.length; i++) {
            System.out.print(valores[i] + " ");
        }
        System.out.println();
        
        double soma = 0;
        for (int i = 0; i < valores.length; i++) {
            soma += valores[i];
        }
        double media = soma / valores.length;
        
        Arrays.sort(valores);
        
        System.out.println("\nVetor ordenado:");
        for (int i = 0; i < valores.length; i++) {
            System.out.print(valores[i] + " ");
        }
        System.out.println();
        
        double mediana;
        if (valores.length % 2 == 0) {
            int meio1 = valores.length / 2 - 1;
            int meio2 = valores.length / 2;
            mediana = (valores[meio1] + valores[meio2]) / 2;
        } else {  
            int meio = valores.length / 2;
            mediana = valores[meio];
        }
        
        System.out.println("\nResultados:");
        System.out.println("Média: " + media);
        System.out.println("Mediana: " + mediana);
    }
} 