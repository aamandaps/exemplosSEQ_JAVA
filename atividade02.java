import javax.swing.JOptionPane;

// Cálculo de soma entre valores

public class atividade02 {
    
    public static void main(String[] args) 
    {
        int valor1, valor2, soma;
        
        valor1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro valor: "));
        valor2 = Integer.parseInt (JOptionPane.showInputDialog("Insira o segundo valor: "));
        
        // SOMA
        soma = valor1 + valor2;
        
        System.out.println("A soma dos valores é " +soma);
    }
}
