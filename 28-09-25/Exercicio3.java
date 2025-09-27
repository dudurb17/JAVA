class Conversor{

  public static double celsiusParaFahrenheit(double celsius){
    return (celsius * 9/5) + 32;
  }

  public static double fahrenheitParaCelsius(double fahrenheit){
    return (fahrenheit - 32) * 5/9;
  }

  public static void main(String[] args){
    System.out.println(Conversor.celsiusParaFahrenheit(100));
    System.out.println(Conversor.fahrenheitParaCelsius(212));
  }
}