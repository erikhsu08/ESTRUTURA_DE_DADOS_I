import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.print("Digite a expressão matemática em notação infixa: \"");
		Scanner s = new Scanner(System.in);
		String exp = s.nextLine();
		s.close();
		if (validaExp(exp)==true)
			System.out.print("expressao valida ");
		else
			System.out.print("expressao invalida ");
	}

	public static boolean validaExp(String exp) {
		char[] opValidos = new char[5]; 
		opValidos[0] = '+';
		opValidos[1] = '-';
		opValidos[2] = '*';
		opValidos[3] = '/';
		opValidos[4] = '^';
		
		int contAbre = 0;
		int contFecha = 0;
		int contVariavel = 0;
		
		for(int i=0; i < exp.length();i++) {
			if (exp.charAt(i) == '(')
				contAbre++;
			if (exp.charAt(i) == ')')
				contFecha++;
			if (contFecha > contAbre)
				return false;
			if(Character.isLetter(exp.charAt(i)))
					contVariavel++;
			if (i !=0 && Character.isLetter(exp.charAt(i)) && Character.isLetter(exp.charAt(i-1)) )
				return false;
			if(Character.isLetter(exp.charAt(i)) == false && exp.charAt(i) != '(' && exp.charAt(i)!= ')') {
				int valido = 0;
				for (int j=0; j < 5;j++) {
					if (exp.charAt(i) == opValidos[j])
						valido = 1;
				}
			if (valido == 0)
				return false;
			}
		}
		if (contVariavel == 0)
			return false;
		if (contAbre != contFecha)
			return false;
		return true;
	}
}
