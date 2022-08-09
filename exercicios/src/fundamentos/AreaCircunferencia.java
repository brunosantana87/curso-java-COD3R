package fundamentos;

public class AreaCircunferencia {

	public static void main(String[] args) {
		double raio = 3.4;
		final double PI = 3.14159;
		// final antes do tipo da variável = transforma em constante
		
		double area = PI * raio * raio;
		System.out.println(area);
		
		// ao mudar o valor da variável, não precisa mais dizer o tipo dela
		raio = 10;
		area = PI * raio * raio;
		System.out.println("Área = " + area + "m².");
		
	}
}
