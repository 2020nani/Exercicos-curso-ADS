package operacoesNumericas;

import java.util.Scanner;

public class teste {
	
	public static void main(String[] args) {
	int a;
	int b;
	int ad;	
	int sub;
	int div;
	int mult;
	Scanner sc = new Scanner(System.in);
	System.out.println("Entre com o primeiro valor");
	a = sc.nextInt();
	System.out.println("Entre com o segundo valor");
	b = sc.nextInt();
	sc.close();
	ad = a + b;
	sub = a-b;
	div = a/b;
	mult = a*b;
	System.out.println("O resultado da soma e " + ad);
	System.out.println("O resultado da subtracao e " + sub);
	System.out.println("O resultado da divisao e " + div);
	System.out.println("O resultado da multiplicacao e " + mult);

	}

}
