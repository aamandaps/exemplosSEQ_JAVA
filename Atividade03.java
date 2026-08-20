import javax.swing.JOptionPane;

public class Atividade03 {
    
    public static void main(String[] args) 
    {
        int n1,n2,soma;
        
        n1 = Integer.parseInt (JOptionPane.showInputDialog("Insira o primeiro valor: "));
        n2 = Integer.parseInt (JOptionPane.showInputDialog("Insira o segundo valor: "));
        
        //SOMA
        soma = n1 + n2;
        
        JOptionPane.showMessageDialog(null, "A soma dos valor é igual a: " +soma);
    
    }
    
}
