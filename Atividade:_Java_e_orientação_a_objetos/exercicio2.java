//Mateus Kenzo Iochimoto TIA: 32216289
//Rodrigo Machado de Assis Oliveira de Lima TIA: 32234678
/*(2) 2.	Elaborar uma classe Circulo, com um atributo raio e métodos que permitam: instanciar objetos desta classe, 
métodos get/set adequados para manipular o atributo raio (Faça pré-condição: raio > 0), métodos para calcular o diâmetro e a área do círculo 
e um método para visualizar todos os dados de um círculo. 
Lembre-se que: área = PI * r2 */
class Circulo{
  private float raio;
  
  public Circulo(float raio){
    this.raio = raio;
  }
  public float calculaDiametro(float raio){
    return raio*2;
  }
  public double calculaArea(float raio){
    return 3.14*(raio*raio);
  }

  public void mostraDados(){
    System.out.print(raio);
    System.out.print("\n");
    System.out.print(calculaDiametro(raio));
    System.out.print("\n");
    System.out.print(calculaArea(raio));
    System.out.print("\n");
  }
  
  public float getRaio(){
    return raio;
  }

  public void setRaio(float raio){
    if (raio>0){
      this.raio = raio;
    }
    else{
      System.out.print("Raio inválido\n");
    }
  }
}

class Main{
  public static void main(String[] args){
    Circulo circuloA = new Circulo(4);
    circuloA.mostraDados();
    circuloA.setRaio(-1);
  }
}
