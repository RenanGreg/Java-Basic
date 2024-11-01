import java.awt.Button;
import java.awt.Label;

public class FXMLDocumentController 
             implements Initializable { 
    
    private Button bntClick; 
    private Label lblMensagem; 
    private void clicouBotao (){ 
      lblMensagem.setText("Ola, Mundo"); 
    }
  } 


