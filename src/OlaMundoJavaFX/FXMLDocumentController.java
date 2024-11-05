package fxmldocumentcontroller; 

import java.awt.Button;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FXMLDocumentController {

    private Button bntClick;
    private Label lblMensagem;

    public FXMLDocumentController() {
        bntClick = new Button("Clique aqui");
        lblMensagem = new Label("Mensagem inicial");

        bntClick.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent event) {
                clicouBotao();
            }
        });
    }

    private void clicouBotao() {
        lblMensagem.setText("Olá, Mundo");
    }
}
