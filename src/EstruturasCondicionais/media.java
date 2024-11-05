package estruturascondicionais;
import java.util.Scanner;

public class EstruturasCondicionais{ 

  public static void main(String[] args){

    Scanner teclado = new Scanner(System.in);
    System.out.print("Primeiara nota:");
      
    float n1 = teclado.nextFloat();
    System.out.print("Segunda nota:");
      
    float n2 = teclado.nextFloat();
    float m = (n1 + n2); 
    System.out.println(m); 

    if (n>9) {
      System.out.println("Aprovado");
    }
  }
}