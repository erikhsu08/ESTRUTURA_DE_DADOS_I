import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    //char[] operacoes = {'+','-','*','/','^'}; 
    //char[] parenteses = {'(', ')'};
    String operacoes = "+-*/^";
    String parenteses = "()";
  
    Scanner s = new Scanner(System.in);
    System.out.print("\nDigite a expressão matemática em notação infixa: ");
    String expressao = s.nextLine();
    
    for (int i = 0; i < expressao.length(); i++){ // for que percorre cada char da expressao 
      if ((operacoes.indexOf(expressao.charAt(i)) == -1) || (parenteses.indexOf(expressao.charAt(i)) == -1)) // se o expressao[i] não for uma operacao
        System.out.print("\nQual o valor de "+ expressao.charAt(i) + " ?");
        
  }
}}
