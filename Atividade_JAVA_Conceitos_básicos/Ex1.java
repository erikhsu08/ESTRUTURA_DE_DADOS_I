//NOME: Rodrigo Machado de Assis Oliveira de Lima
//TIA: 32234678

import java.util.Scanner;

class Ex1 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Digite o valor da altura dos tanques em decímetros: ");
    float h = s.nextFloat();  
    System.out.print("Digite o valor do raio da base dos tanques em decímetros: ");
    float r = s.nextFloat();
    System.out.print("Digite a quantidade de tanques: ");
    int M = s.nextInt();

    s.close();

    double vi = ((Math.PI * r * r) * h);
    double vtotal = (vi * M);
    System.out.print("É necessário " + (int)((vtotal/100)+1) +" barris para preencher os " + M + " tanques");
    
  }
}