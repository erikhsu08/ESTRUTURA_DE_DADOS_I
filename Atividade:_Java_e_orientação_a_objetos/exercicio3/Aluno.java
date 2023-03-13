/*⦁	Seja a Classe Aluno com os atributos privados: rgm, nome, sexo, notaA, notaB, notaC e nota D (como apresentado no diagrama UML abaixo).
⦁	Os quatro últimos atributos representam as notas do aluno em quatro disciplinas. 
⦁	Programe os três métodos construtores, conforme modelo UML. 
⦁	Defina um método que permita calcular e retornar a média das notas de um aluno. 
⦁	Define um método que avalia a situação do aluno no curso e verifica se média >=6, verdadeiro = “aluno aprovado”, e falso, caso contrário.
⦁	Defina outro método que mostre na tela todos os dados de um aluno, inclusive sua média e sua situação (Utilize os métodos dos itens iii e iv). 
⦁	Defina uma classe principal em outro arquivo que criará dois objetos da classe Aluno (por exemplo, com seus dados e os de um colega da turma). Mostre na tela os dados destes dois alunos, utilizando o método solicitado no item anterior. 

*/
class Aluno {
  private String rgm;
  private String nome;
  private char sexo;
  private float notaA;
  private float notaB;
  private float notaC;
  private float notaD;
  
  public Aluno(String rgm, String nome, char sexo, float notaA, float notaB, float notaC, float notaD){
    this.rgm = rgm;
    this.nome = nome;
    this.sexo = sexo;
    this.notaA = notaA;
    this.notaB = notaB;
    this.notaC = notaC;
    this.notaD = notaD;
  }
  public Aluno(String rgm, String nome){
    this.rgm = rgm;
    this.nome = nome;
  }
  public Aluno(){
    rgm = new String("Nenhum-rgm");
    nome = new String("Nenhum-nome");
    sexo = 'n';
    notaA = 0;
    notaB = 0;
    notaC = 0;
    notaD = 0;
  }

  public void mostraDados(){
    System.out.print(rgm + "\t");
    System.out.print(nome+ "\t");
    System.out.print(sexo+ "\t");
    System.out.print(notaA+ "\t");
    System.out.print(notaB+ "\t");
    System.out.print(notaC+ "\t");
    System.out.print(notaD+ "\t");
  }
  
  public boolean avaliaSituacao(){
    if((notaA+notaB+notaC+notaD)/4>=6)
      return true;
    else
      return false;
  }
  
  public float calculaMedia(){
    return (notaA+notaB+notaC+notaD)/4;
  }

  public void mostraTudo(){
    mostraDados();
    System.out.print(calculaMedia());
    System.out.print(avaliaSituacao());
  }
  
  public String getRgm(){
    return rgm;
  }
  public void setRgm(String rgm){
    this.rgm = rgm;
  }
  
  public String getNome(){
    return nome;
  }
  public void setNome(String nome){
    this.nome = nome;
  }
  public float getSexo(){
    return sexo;
  }
  public void setSexo(char sexo){
    this.sexo = sexo;
  }
  public float getNotaa(){
    return notaA;
  }
  public void setNotaa(float notaA){
    this.notaA = notaA;
  }
  public float getNotab(){
    return notaB;
  }
  public void setNotab(float notaB){
    this.notaB = notaB;
  }
  public float getNotac(){
    return notaC;
  }
  public void setNotac(float notaC){
    this.notaC = notaC;
  }
  public float getNotad(){
    return notaD;
  }
  public void setNotad(float notaD){
    this.notaD = notaD;
  }
}

