import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String data = "";
    for (int i=0; i<3; i++){
      System.out.printf("Digite o %dº numero de DD/MM/YYYY: ", i+1);
      String entrada = scanner.nextLine();
      data += entrada;
    }
    Pilha p = new Pilha(data.length());
    
    for (int i = 0; i < data.length(); i++)
      p.push(data.charAt(i));
    for (int i = 0; i <data.length(); i++){
      if (data.charAt(i) != p.pop()){
        System.out.print("Não é palíndromo");
        break;
      }
      if (i == data.length()-1)
        System.out.print("É palíndromo");
      }
}}
