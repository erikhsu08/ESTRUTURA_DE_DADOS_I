//Mateus Kenzo Iochimoto TIA: 32216289
//Rodrigo Machado de Assis Oliveira de Lima TIA: 32234678
/*1.	Escreva um programa que leia uma string e indique se o texto informado é ou não é um palíndromo. 
Seu programa deve usar uma pilha para auxiliar na verificação do palíndromo.*/

class Main {
  public static void main(String[] args) {
    //palavra a ser verificada
    String palavra = "arara";
    Pilha p = new Pilha(palavra.length());
    int len = palavra.length();
    for (int i = 0; i < palavra.length(); i++)
      p.push(palavra.charAt(i));
    for (int i = 0; i <palavra.length(); i++){
      if (palavra.charAt(i) != p.pop()){
        System.out.print("Não é palíndromo");
        break;
      }
      if (i == palavra.length()-1)
        System.out.print("É palíndromo");
      }
    
}}
