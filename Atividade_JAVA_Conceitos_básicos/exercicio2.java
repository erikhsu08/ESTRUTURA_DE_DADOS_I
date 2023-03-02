//NOME: Mateus Kenzo Iochimoto TIA: 32216289
//

import java.util.Scanner; //para fazer o input()

class PauArara{
	static double calculaPauArara(double h, double min, double s) {
		return (15.*h)+(0.5*min)+(0.05*s);
	}
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in); 
		 System.out.print("Digite as horas: ");
	     int h = input.nextInt();
	     System.out.print("Digite os minutos: ");
	     int min = input.nextInt();
	     System.out.print("Digite os segundos: ");
	     int s = input.nextInt();
	     System.out.print(calculaPauArara(h, min, s));
	}
}
