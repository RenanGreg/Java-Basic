package operadoreslogicos; 

public class OperadoresLogicos{
  
  public static void main(String[] args){

    int x, y, z; 
    x = 5;
    y = 10; 
    z = 15;

    boolean r; 
    r = (x < y && y < z) ? true : false; 
    r = (x < y || y < z) ? true : false; 
    r = (x < y ^ y < z) ? true : false; 
    System.out.println(r);
  }
}