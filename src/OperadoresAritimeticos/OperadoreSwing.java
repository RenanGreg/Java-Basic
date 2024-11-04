package operadoreswing; 

public class OperadoreSwing extends javax.swing.JFrame{
  
  private void btnDividirActionPerformed(java.awt.event.ActionEvent evt) {

    int n = Integer.parseInt(txtNum.getText()); 
    int d = Integer.parseInt(txtDen.getText()); 
    float div = (float) n / d; 
    float res = n % d; 
    lblDiv.setText(Float.toString(div));
    lblResto.setText(Float.toString(res)); 
    
  } 
}