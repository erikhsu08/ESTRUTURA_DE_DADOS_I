import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    //char[] operacoes = {'+','-','*','/','^'}; 
    //char[] parenteses = {'(', ')'};
    String operacoes = "+-*/^(";

    Pilha op = new Pilha(); // pilha para operações
    
    Scanner s = new Scanner(System.in);
    System.out.print("\nDigite a expressão matemática em notação infixa: ");
    String expressao = s.nextLine();
    
    for (int i = 0; i < expressao.length(); i++){ // for que percorre cada char da expressao 

      if (operacoes.indexOf(expressao.charAt(i)) == -1) // "se o char não estiver em operacoes" 
        System.out.print("\nQual o valor de "+ expressao.charAt(i) + " ?");
      else // "se o char estiver em operacoes"
        op.push(expressao.charAt(i));
        
  }
}}
