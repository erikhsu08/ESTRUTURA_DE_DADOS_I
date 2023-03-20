//Mateus Kenzo Iochimoto TIA: 32216289
//Rodrigo Machado de Assis Oliveira de Lima TIA: 32234678
//3.	Escreva um programa que usa pilha para verificar e informar se uma expressão (string) possui a correspondência e ordem correta dos 
//símbolos (), [], {} e <>. A expressão deve ser informada pelo usuário.


package exercicio3;

import java.util.*;

public class exercicio3 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Digite uma expressão: ");
		String e = s.nextLine();
		s.close();
		
		Pilha p = new Pilha(e.length());
		boolean verifica = true;
		int len = e.length();
		for (int i = 0; i < len; i++) {
			if (e.charAt(i) == '(' || e.charAt(i) == '[' || e.charAt(i) == '{' || e.charAt(i) == '<' ){
				p.push(e.charAt(i));	
			}
			else if (e.charAt(i) == ')' || e.charAt(i)== ']' || e.charAt(i) == '}' || e.charAt(i) == '>') {
	             if (p.isEmpty()) {
	                verifica = false;
	                break;
	             }
	             else {
	            	 if ((p.top() == '(' && e.charAt(i) != ')') || 
	            		 (p.top() == '[' && e.charAt(i) != ']') || 
	            		 (p.top() == '{' && e.charAt(i) != '}') || 
	            		 (p.top() == '<' && e.charAt(i) != '>')) {
	            		  p.pop();
	            		  verifica = false;
	            		  break;
	            	 	 }
	            	 p.pop();
	             }
			}
		}
		
		if (!p.isEmpty()) {
            verifica = false;
		}
		if (verifica == true) {
			System.out.print("A correspondência e ordem dos símbolos da expressão está correta");
		}
		else {
			System.out.print("a correspondência e ordem dos símbolos da expressão não é válida");
		}
		

	}

}
