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
