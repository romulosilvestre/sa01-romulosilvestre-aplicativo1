package br.com.senaitagua.sa1.app1;
import javax.swing.JOptionPane;

import br.com.senaitagua.sa1.bo.CalculoBO;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double valor1,valor2;
		JOptionPane.showMessageDialog(null,"Empresa Voe - Grupo Empresarial");
		
		//Entrada de Dados
		valor1 = Double.parseDouble(JOptionPane.showInputDialog("digite o valor do primeiro avião"));
		valor2 = Double.parseDouble(JOptionPane.showInputDialog("digite o valor do segundo avião"));
		
		//Passar uma mensagem (método) para o objeto
		CalculoBO cbo = new CalculoBO();
		
		//utilizar o objeto
		
		
		JOptionPane.showMessageDialog(null,cbo.Somar(valor1,valor2));

	}

}
