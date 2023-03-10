package POO.QuestõesDeProva.Questão1;

/*Crie uma classe chamada "Poo" com dois atributos: Codigo e um vetor de Aluno com 10 elementos. Na classe Poo, alem de todos
os metodos get e set, crie um metodo chamado procurar aluno: parametro de entrada = matricula, parametro de saida = um objeto do tipo aluno.
Com esses dados, faça um programa em java que procure um aluno na turma de Poo a partir da matricula, caso exista um aluno, escreva seu nome e sua nota. Caso não
exista, avisar ao usuário. */
public class POO {
    private String codigo;
    private Aluno[] vetor = new Aluno[10];

public POO(String codigo, Aluno[] vetor){
    this.codigo = codigo;
    this.vetor = vetor;
}


public String getCodigo(){
    return codigo;
}

public Aluno[] getVetor(){
    return vetor;
}
public void setCodigo(String novoCodigo){
    this.codigo = novoCodigo;
}
public void setVetor(Aluno[] novoVetor){
    this.vetor = novoVetor;
}
public class AlunoNaoEncontradoException extends Exception {
    public AlunoNaoEncontradoException(String mensagem) {
        super(mensagem);
    }
}

public Aluno procurarAluno(String matricula) throws AlunoNaoEncontradoException{

    for(int i=0;i<10;i++){
        if(this.vetor[i].getMatricula() == matricula){
            return this.vetor[i];
        }   
    }
    throw new AlunoNaoEncontradoException("Não existe nenhum aluno com essa matricula.");
}
}