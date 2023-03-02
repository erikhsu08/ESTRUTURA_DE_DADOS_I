//NOME: Mateus Kenzo Iochimoto TIA: 32216289
//

import java.util.Scanner;

public class fibo {
	static long fibo(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 System.out.print("Digite n: ");
	     int n = input.nextInt();
	     System.out.print(fibo(n));
	}

}
