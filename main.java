import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Qual produto deseja cadastrar?");
		String produto = teclado.next();
		
		System.out.println("Qual a quantidade do produto:");
		int quantidade = teclado.nextInt();
		
		System.out.println("Insira o preço do produto:");
		double preco = teclado.nextDouble();
		
		System.out.println("Produto cadastrado com sucesso!");
		
		teclado.close();

	}

}
