package br.com.exemplo.basico;
import com.matematica.funcoes.*;
public class UsarFuncoes {

	public static void main(String[] args) {
		// Vamos declarar um array de valores
		//do tipo double e passar as funcoes
		double[] valores = {15 , 32, 56 ,80 ,11};
		
		Mfuncoes funcoes = new Mfuncoes();
		
		System.out.println("O resultado da soma �: "+funcoes.soma(valores));
		System.out.println("O resultado da m�dia � "+funcoes.media(valores));
		System.out.println("O maior valor �: "+funcoes.maximo(valores));

	}

}
