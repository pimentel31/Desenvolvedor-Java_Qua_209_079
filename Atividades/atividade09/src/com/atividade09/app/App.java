package com.atividade09.app;

import javax.swing.JOptionPane;
import com.atividade09.model.Veiculo;
import com.atividade09.model.Verificarvelocidade;


public class App {
    public static void main(String[] args) throws Exception {

        String modelo = JOptionPane.showInputDialog("Digite o modelo do veículo:");
        Veiculo veiculo = new Veiculo(modelo);

        double distancia = Double.parseDouble(JOptionPane.showInputDialog("Digite a distância entre os dois,pardais (em km):"));
        double tempo = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo gasto entre os pardais (em horas):"));
        double velocidadeMedia = Verificarvelocidade.calcularVelocidade(distancia, tempo);
        boolean multa = Verificarvelocidade.verificarMulta(velocidadeMedia);
        String mensagem = "Veículo: " + veiculo.getModelo() + "\nVelocidade média: " + String.format("%.2f", velocidadeMedia) + " Km/h" + (multa ? "\nSituação: MULTADO" : "\nSituação: dentro do limite");
        JOptionPane.showMessageDialog(null,mensagem);
      
    }
}
