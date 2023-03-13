//Mateus Kenzo Iochimoto TIA: 32216289
//Rodrigo Machado de Assis Oliveira de Lima TIA: 32234678
/*(1) Crie e compile a classe Carro que possui ano, marca, modelo e categoria com atributos privados (conforme diagrama UML abaixo: - significa private).
Crie os devidos métodos de acesso (sets e gets) e construtores (padrão e com parâmetros)
Crie um programa principal (com a função main) em que sejam criados dois Carros a partir de dados fornecidos no código.
O símbolo de + no diagrama significa que o método deve ser public (público). */
class Carro{
  private int ano;
  private String marca;
  private String modelo;
  private String categoria;

  public void show(){
    System.out.print(ano+"\t");
    System.out.print(marca+"\t");
    System.out.print(modelo+"\t");
    System.out.print(categoria+"\t");
  }
  public int getAno(){
    return ano;
  }
  public void setAno(final int ano){
    this.ano = ano;
  }
  public String getMarca(){
    return marca;
  }
  public void setMarca(final String marca){
    this.marca = marca;
  }
  public String getModelo(){
    return modelo;
  }
  public void setModelo(final String modelo){
    this.modelo = modelo;
  }
  public String getCategoria(){
    return categoria;
  }
  public void setCategoria(final String categoria){
    this.categoria = categoria;
  }
  public Carro(){
    ano = 0;
    marca = new String("Nenhuma-marca");
    modelo = new String("Nenhum-modelo");
    categoria = new String("Nenhuma-categoria");
  }
  public Carro(final int ano, final String marca, final String modelo, final String categoria){
    this.ano = ano;
    this.marca = marca;
    this.modelo = modelo;
    this.categoria = categoria;
  }
}

class Main{
  public static void main(String[] args){
    Carro carroA = new Carro();
    carroA.show();
    System.out.print("\n");
    Carro carroB = new Carro(2001, "chevrolet", "onix", "g2");
    carroB.show();
  }
}
