package fundamentos;

public class Inferencia {
	
	public static void main(String[] args) {
		
		double a = 4.5; // declaração e inicialização da variável na mesma linha
		System.out.println(a);
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		c = "Outro texto";
		System.out.println(c);
		
		double d; // variável foi declarada
		d = 123.65; // variável foi inicializada
		System.out.println(d); // utilizada
		
		
		var e = 123.45;
		System.out.println(e);
		// Ao utilizar o var, deve-se declarar e inicializar na mesma linha
		
		//var f = 12; // inteiro
		// f = 12.01; 
		
		/*
		 *  Criar uma variável com casas decimais e depois transformar em inteiro é válido.
		 *  Já o contrário (inteiro >>> decimais) terá problema.
		 *  O valor inteiro dentro do Java não consegue armazenar casas decimais.
		 */
	}
}
