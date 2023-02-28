class Carro{
  private int ano;
  private String marca;
  private String modelo;
  private String categoria;

  public void show(){
    System.out.print(ano);
    System.out.print(marca);
    System.out.print(modelo);
    System.out.print(categoria);
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
