class Aluno {
  private String nome;
  private int TIA;
  private String disciplina;
  private float n1;
  private float n2;
  private float psub;
  private float pf;
  private float np;
  private float media;
  private float frequencia;

  //Médtodo (função)
  //[acesso][retorno][nome]([parametros]){...}
  public String getNome(){
    return nome;
  }

  public void setNome(String nome){
    this.nome = nome;
  }
}

class Main {
  public static void main(String[] args) {
    Aluno a = new Aluno();
  }
}