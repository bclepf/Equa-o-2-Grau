package calcequacao2grau;

import javax.swing.JOptionPane;

public class Main {
    
    public static void main(String[] args) {
        double v1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor de a:"));
        double v2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor de b:"));
        double v3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor de c:"));
        
        Calculos calc = new Calculos(v1, v2, v3);
        
        double delta = calc.calculaDelta();
        
        if (delta > 0){
            double[] solucoes = calc.calculaSolucao();
            JOptionPane.showMessageDialog(null, "As soluções disponiveis para equação apresentada são: " + solucoes[0] + " e " + solucoes [1] + ". E o valor do delta é: " + delta);
        }
        
        else if(delta ==0){
            double solucao = calc.calculaDeltaZero();
            JOptionPane.showMessageDialog(null, "A única solução disponível é:" + solucao + ". E o valor do delta é: " + delta);
        }
        
        else{
            JOptionPane.showMessageDialog(null, "Não existem soluções reais para equação fornecida.Porém o valor do delta é: " + delta);
       
        }   
        
    }
}