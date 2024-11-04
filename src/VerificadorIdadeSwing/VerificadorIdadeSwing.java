package verificadoridadeswing; 

public class VerificadorIdadeSwing extends javax.swing.JFrame{

  public static void main(String[] args) {

    int ano = Integer.parseInt(txtAno.getText());
    int idade = 2024 - ano;
    lblIdade.setText(Integer.toString(idade));

    String sit = (idade >= 16 && idade <18 || (idade >70)) ? "É OPCIONAL" : "NÃO É OPCIONAL";
    lblSituacao.setText(sit);
  }
}