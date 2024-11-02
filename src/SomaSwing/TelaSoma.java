package somaswing;

public class TelaSoma extends javax.swing.JFrame {

    public TelaSoma() {
        initComponents();
    }

    public void bntSomarActionPerformed(java.awt.event.ActionEvent evt) {
        int n1 = Integer.parseInt(txtNumero1.getText());
        int n2 = Integer.parseInt(txtNumero2.getText());
        int soma = n1 + n2;
        lblSoma.setText(Integer.toString(soma));
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
                new TelaSoma().setVisible(true);
            } 
        }); 
    } 