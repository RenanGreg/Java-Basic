package estruturascondicionais; 

public class ProgramaPernas {

  public static void main(String[] args) {

    Scanner tec = new Scanner(System.in); 
    System.out.print("Quantas pernas?: "); 

    int perna = tec.nextInt(); 
    String tipo; 
      
    System.out.println("Isso é um(a): "); 
    switch (perna) {
      case 1: 
        tipo = "Saci"; 
        break; 

      case 2:  
        tipo = "Bípede";
        break;

      case 3: 
        tipo = "Tripede"; 
        break;

      case 4: 
        tipo = "Quadrúpede";
        break; 

      case 6: 
        tipo = "Aranha";
        break; 

      default: 
        tipo = "ET";
        break;
    } 
    System.out.println(tipo);
  }
}