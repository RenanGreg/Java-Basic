package estruturascondicionais; 
import java.util.Scanner;

public class ProgramaIdade{

  public static void main(String[] args){
    
    Scanner t = new Scanner(System.in);
    System.out.print("Em que ano voce nasceu?: "); 
    
    int nasc = t.nextInt();
    int idade = 2024 - nasc; 

    if (idade >= 18) {
      System.out.println("Maior de idade");
    } 
    else {
      System.out.println("Menor de idade");
    }
  }
}