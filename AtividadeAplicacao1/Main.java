//NOME: Mateus Kenzo Iochimoto TIA: 32216289

import java.util.*;

class Main {
  public static void main(String[] args) {
    Map<Character, Integer> valorVariaveis = new HashMap<>();
    Pilha op = new Pilha(); // pilha para operações

    Scanner s = new Scanner(System.in);
    //char[] operacoes = {'+','-','*','/','^'}; 
    //char[] parenteses = {'(', ')'};
    String operacoes = "+-*/^(";

    System.out.print("\nDigite a expressão matemática em notação infixa: ");
    String expressao = s.nextLine();
    
    for (int i = 0; i < expressao.length(); i++){ // for que percorre cada char da expressao 

      if (operacoes.indexOf(expressao.charAt(i)) == -1){ // "se o char não estiver em operacoes" 
        if (valorVariaveis.containsKey(expressao.charAt(i))) // "se o char estiver no dicionário" pule a iteração
          continue;
        System.out.printf("\nQual o valor de %c? ", expressao.charAt(i));
        int valor = s.nextInt();
        valorVariaveis.put(expressao.charAt(i), valor);
      }
        // input do valor da variável, se possível guardar esse valor em algum lugar
      else // "se o char estiver em operacoes"
        op.push(expressao.charAt(i));
  }
    
  for (Map.Entry<Character, Integer> entry : valorVariaveis.entrySet()) {
      char key = entry.getKey();
      int value = entry.getValue();
      System.out.println("A chave " + key + " está associada ao valor " + value);
    }
}}

// TODO: criar uma pilha para os valores das variáveis
// opcional^  TODO: dicionário que recebe as variáveis inputadas pelo usuário
// TODO: fazer a string da expressão em notação posfixa e dar um print dela
// TODO: fazer o cálculo da expressão pela string em notação posfixa (printar o passo a passo do cálculo?)
// obs: a classe pilha está configurada para char, será necessário configurar ela para int também, mas se possível procurar um jeito fácil sem ter que criar outro arquivo
