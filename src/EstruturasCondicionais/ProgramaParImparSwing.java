package estruturascondicionais;

public class ProgramaParImparSwing{

  public void bntVerificarActionPerfomed(java.awt.event.ActionEvent evt){ 

    int v = Interger.parseInt(txtValor.getText());

    if (v % 2 == 0) {
      lblResultado.setText("Par"); 
      
    }  else {
      lblResultado.setText("Impar");
    }  
  }
}