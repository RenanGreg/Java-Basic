import javax.swing; 

public class VotacaoSwing {

private void bntVotoActionPerformed(java.awt.event.ActionEvent evt){ 

  int a = Interger.parseInt(txtAno.getText()); 
  int i = 2024 - a; 

  if (i <= 16) {
    lblR.setText("Não pode votar"); 
  } 
  else{
    if ((i >= 16 && i <18) || (i > 70)) {
      lblR.setText("Voto opcional"); 
      
    } else {
      lblR.setText("Voto obrigatório");  
    }
}
  }  
  public static void main (String [] args) {
  } 
} 