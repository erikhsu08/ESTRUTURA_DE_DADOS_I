/*⦁	Modifique o exemplo da classe Trabalhador considerando agora os atributos: cpf, nome, idade, sexo, endereco, salario. Não se esqueça dos métodos get/set.
Colocar na classe principal: 
⦁	A leitura dos dados de N trabalhadores (utilizar um vetor de no máximo MAX_TRABALHADOR = 50 (constante) objetos da classe Trabalhador. Não se esqueça de fazer a verificação no main e a sua alocação); 
⦁	Calcular a média dos salários dos trabalhadores; 
⦁	Apresentar os dados dos homens com salário acima da média;
⦁	Calcular a média dos salários dos homens com idade superior a 30 anos e determinar quantos homens (com idade superior a 30 ) tem salário abaixo dessa média.
⦁	Determinar e visualizar os dados do trabalhador que possui o maior salário. 
⦁	Determinar e visualizar os dados da mulher com menor salário.
*/
class Trabalhador {
  private String nome;
  private float salario;
  private String cpf;
  private int idade;
  private char sexo; 
  private String endereco;
  public Trabalhador(String nome, float salario, String cpf, int idade, char sexo, String endereco){
    this.nome = nome;
    this.salario = salario;
    this.cpf = cpf;
    this.idade = idade;
    this.sexo = sexo;
    this.endereco = endereco;
  }

  public Trabalhador(){
    nome = new String("Nenhum-nome");
    salario = 0;
    cpf = new String("Nenhum-cpf");
    idade = 0;
    sexo = new char '';
    endereco = new String("Nenhum-endereco");
  }

  public void show(){
    System.out.print(nome + "\t");
    System.out.print(salario+ "\t");
    System.out.print(cpf+ "\t");
    System.out.print(idade+ "\t");
    System.out.print(sexo+ "\t");
    System.out.print(endereco);
  }
  public float calculaSalarioAnual(){
    return salario*12;
  }

  public String getNome(){
    return nome;
  }
  public void setNome(String nome){
    this.nome = nome;
  }
  public float getSalario(){
    return salario;
  }
  public void setSalario(float salario){
    this.salario = salario;
  }
  public String getCpf(){
    return cpf;
  }
  public void Cpf(String cpf){
    this.cpf = cpf;
  }
  public int getIdade(){
    return idade;
  }
  public void setIdade(int idade){
    this.idade = idade;
  }
  public int getSexo(){
    return sexo;
  }
  public void setSexo(char sexo){
    this.sexo = sexo;
  }
  public String getEndereco(){
    return endereco;
  }
  public void setEndereco(String endereco){
    this.endereco = endereco;
  }
}

class Main{
  public static void main(String[] args) {
    int qtde = 50;
    		Trabalhador trabs[] = new Trabalhador[qtde];
    		trabs[0] = new Trabalhador("Mariana Pil", 2500.f, "4141413123", 23, 'M', "rua A");
    		trabs[1] = new Trabalhador("Anacleto Eli", 1780.f, "3124515111", 35, 'F', "rua A");
    		trabs[2] = new Trabalhador("Joao", 1000000.f, "412354252", 10, 'M', "rua D");
        trabs[4] = new Trabalhador("Irene", 3.f, "4141415", 45, 'F', "rua R"); // mulher com menor salário
        trabs[5] = new Trabalhador("Roger", 231312451.f, "414144566", 60, 'M', "rua G"); //homem com maior salário
        trabs[6] = new Trabalhador();

    		for(int i = 0; i < qtde; i++){
      			trabs[i].show();
            System.out.print("\n");
    }
    System.out.println(); 
}}