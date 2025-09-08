public class Exercicio9 {
    public static void main(String[] args) {

      for (int i = 1; i <= 100; i++) {
        System.out.print(i + " Java ");
        for (int j = 1; j <= i; j++) {
          System.out.print( i == 1 ? "atrapalha " : "atrapalham ");
        }
        System.out.println("muita gente");
      }
      
    }
} 