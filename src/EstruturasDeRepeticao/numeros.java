packag estruturasderepeticao; 
import java.util.Scanner;

public class Numeros{

  public static void main(String[] args){ 

    int n, soma=0; 
    String resp;
    Scanner tec = new Scanner(System.in); 

    do{
      System.out.print("Digite um numero:"); 
      n = tec.nextInt(); 
      soma += n; 
      System.out.print("Deseja continuar? [S/N]"); 
      resp = tec.next();
      
    }while (resp.equals("soma"))

     system.out.println("A soma de todos os valores é:" + soma); 
  }
}