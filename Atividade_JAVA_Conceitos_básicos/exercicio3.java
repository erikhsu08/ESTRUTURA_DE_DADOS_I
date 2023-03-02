//NOME: Mateus Kenzo Iochimoto TIA: 32216289
//

import java.util.Scanner;
public class E {
	static float fatorial(int n) {
		if (n==0)
			return 1;
		return n*fatorial(n-1);
	}
	static float calculaE(int n) {
		if(n==0)
			return 1;
		return 1/(fatorial(n))+calculaE(n-1);
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 System.out.print("Digite n: ");
	     int n = input.nextInt();
	     System.out.print(calculaE(n));
	}

}
