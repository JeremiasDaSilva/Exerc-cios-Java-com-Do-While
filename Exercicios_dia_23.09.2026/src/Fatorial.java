import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		int fatoriado, anterior, soma, i;
		
		Scanner Ler = new Scanner(System.in);
		
		
		System.out.println("Digite o número a ser fatoriado");
		fatoriado = Ler.nextInt();
		i = fatoriado;
		
		soma=fatoriado;
		
		do {
				
            anterior = i - 1;
            soma = soma * anterior;
            i--;
		
			System.out.println(soma);
		} while(i > 1);
		
	}

}
 