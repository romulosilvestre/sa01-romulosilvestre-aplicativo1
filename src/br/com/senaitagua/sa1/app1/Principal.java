package br.com.senaitagua.sa1.app1; //pacote
import javax.swing.JOptionPane;

import br.com.senaitagua.sa1.bo.CalculoBO;
public class Principal { //classe

	//método main - é um método principal para executar o programa.
	public static void main(String[] args) { // chave que abre - inicio		
		// TODO Auto-generated method stub
		double valor1,valor2;
		JOptionPane.showMessageDialog(null,"Empresa Voe - Grupo Empresarial");		
		//Entrada de Dados
		valor1 = Double.parseDouble(JOptionPane.showInputDialog("digite o valor do primeiro avião"));
		valor2 = Double.parseDouble(JOptionPane.showInputDialog("digite o valor do segundo avião"));		
		//Passar uma mensagem (método) para o objeto
		CalculoBO cbo = new CalculoBO();		
		//utilizar o objeto			
		JOptionPane.showMessageDialog(null,cbo.somar(valor1,valor2));		
		String resp1 = JOptionPane.showInputDialog("Digite o fat. Jan");
		String resp2 = JOptionPane.showInputDialog("Digite o fat. Fev");
		double valorJan = Double.parseDouble(resp1);
		double valorFev = Double.parseDouble(resp2);
		JOptionPane.showMessageDialog(null,"Média Bimestral Fat:"+cbo.calcularMedia(valorJan, valorFev));	

	} //chave que fecha - fim

}
