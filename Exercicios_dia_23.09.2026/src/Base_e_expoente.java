import java.util.Scanner;

public class Base_e_expoente {
    public static void main(String[] args) {
        int i = 1, resultado = 1;
        int base, expoente;
        Scanner Ler = new Scanner(System.in);
        
        System.out.println("digite a base: ");
        base = Ler.nextInt();
        
        System.out.println("Digite o expoente: ");
        expoente = Ler.nextInt();
        
        do {
            resultado = resultado * base;
            i++;
        } while(i<=expoente);
        System.out.println(base + " elevado a " + expoente + " e igual a: " + resultado);
        
    }
}
