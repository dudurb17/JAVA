class Calculadora {
   public int soma(int a, int b){
    return a + b;
   }

   public double soma(double a, double b){
    return a + b;
   }

  public static void main(String[] args){
    Calculadora calculadora = new Calculadora();
    System.out.println(calculadora.soma(1, 2));
    System.out.println(calculadora.soma(1.5, 2.9));
  }
} 