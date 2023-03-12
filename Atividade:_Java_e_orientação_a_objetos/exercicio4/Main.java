class Main{
  public static void main(String[] args) {
    int qtde = 50;
    		Aluno alunos[] = new Aluno[qtde];
    		alunos[0] = new Aluno("32216289", "Mateus", 'M',4,5,6,7);
    		alunos[1] = new Aluno("5131", "Ana", 'F',7,9,6,8);
    		alunos[2] = new Aluno("6254", "Pedro", 'M',1,4,2,3);
        alunos[3] = new Aluno("3142", "Julia", 'F',10,9,9,2); 
        alunos[4] = new Aluno("1111", "dadada"); 
        alunos[5] = new Aluno();

    		for(int i = 0; i <= qtde; i++){
          alunos[i].mostraTudo();
          System.out.print("\n");
    }
    System.out.println(); 
}}
