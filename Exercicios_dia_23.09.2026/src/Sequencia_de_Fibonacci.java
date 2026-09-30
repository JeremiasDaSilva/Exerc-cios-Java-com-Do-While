import java.util.Scanner;

public class Sequencia_de_Fibonacci {

    public static void main(String[] args) {
        int n, ant, at, prox, i;
        
		Scanner Ler = new Scanner(System.in);
		
		
	System.out.println("Digite o número");	
	n = Ler.nextInt();
	ant = 0;
	at = 1;
	prox = 1;
	i = 1;
		
       do {
    	   System.out.println(at);
    	   prox = ant + at;
    	   ant = at;
    	   at = prox;
    	   i++;
        } while (i<=n);
       
    }
}
