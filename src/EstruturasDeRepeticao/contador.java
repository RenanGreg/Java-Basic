package estruturasderepeticao; 

public class Contador {
  public static void main(String[]args){

    int cc = 0; 
    while (cc < 10) {
       cc++;
      
      if (cc == 5 || cc == 7){
        continue;
      }

      if (cc == 7) {
        break; 
      }
      system.out.println("Cambalhota" + (cc)); 
      
    }
  }
}