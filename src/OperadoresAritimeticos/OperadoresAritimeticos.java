package operadoresaritimeticos; 

public class OperadoresAritimeticos{

  public static void main(String[] args) {

    int n1 = 3;
    int n2 = 2; 
    float m = (n1 + n2) / 2; 
    System.out.println("A media é igual a" + m); 
    

    int numero = 5; 
    int valor = 5 + numero++; 
    System.out.println("O numero é " + numero); 
    

    int x = 4; 
    x += 2; 
    System.out.println("O valor de x é " + x);
  }
}