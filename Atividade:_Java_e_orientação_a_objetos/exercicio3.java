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
  private Character sexo; 
  private String endereco;
  
  public Trabalhador(String nome, float salario, String cpf, int idade, Character sexo, String endereco){
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
    sexo = 'n';
    endereco = new String("Nenhum-endereco");
  }

  public void mostra(){
    System.out.print(nome + "\t");
    System.out.print(salario+ "\t");
    System.out.print(cpf+ "\t");
    System.out.print(idade+ "\t");
    System.out.print(sexo+ "\t");
    System.out.print(endereco+ "\n");
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
    int MAX_TRABALHADOR = 50;
    int cont = 0;
    float media = 0;
    int maiorSalario = 0;
    int mulherMenorSalario;
    		Trabalhador trabs[] = new Trabalhador[MAX_TRABALHADOR];
    		trabs[0] = new Trabalhador("Mariana Pil", 2500.f, "4144", 23, 'M', "rua A");
    		trabs[1] = new Trabalhador("Anacleto Eli", 1780.f, "3124", 35, 'F', "rua A");
    		trabs[2] = new Trabalhador("Joao", 10000.f, "4123", 10, 'M', "rua D");
        trabs[3] = new Trabalhador("Irene", 3.f, "4141", 45, 'F', "rua R"); // mulher com menor salário
        trabs[4] = new Trabalhador("Roger", 23131.f, "5123", 60, 'M', "rua G"); //homem com maior salário
        trabs[5] = new Trabalhador();

    		for(int i = 0; i <= MAX_TRABALHADOR; i++){
          /*if (trabs[i].getSexo() == 'F'){
            if (cont == 0){
              mulherMenorSalario = i;
              cont += 1;
            }
            if (trabs[mulherMenorSalario].getSalario() > trabs[i].getSalario())
              mulherMenorSalario = i;
          }*/
          if (trabs[maiorSalario].getSalario() < trabs[i].getSalario())
            maiorSalario = i;
            System.out.print(i);
      			trabs[i].mostra();
            media += trabs[i].getSalario();
            System.out.print("\n");
    }
    System.out.print(media);
    System.out.print("O maior salário é ");
    trabs[maiorSalario].mostra();
    System.out.println(); 
}}
