package comparacaodestring; 

public class ComparacaoString {

  public static void main(String[] args) {

    String nome1 = "Renan";
    String nome2 = "Renan"; 
    String nome3 = new String ("Renan"); 
    
    String res; 
    res = (nome1.equals (nome3)) ? "São iguais" : "São diferentes"; 
    System.out.println(res);
  }
}