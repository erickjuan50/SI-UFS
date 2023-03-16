package POO.QuestõesDeProva.Questão1;

import java.util.Scanner;

public class AppPOO {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("1","Erick Juan",7.5,8.3);
        Aluno aluno2 = new Aluno("2","Nine",7.3,8.9);
        Aluno aluno3 = new Aluno("3","Joao Pedro",7.3,8.1);
        Aluno aluno4 = new Aluno("4","Aruna",7.2,8.8);
        Aluno aluno5 = new Aluno("5","Diogo",7.5,8.3);
        Aluno aluno6 = new Aluno("6","Papel",7.5,8.3);
        Aluno aluno7 = new Aluno("7","Pitico",7.5,8.3);
        Aluno aluno8 = new Aluno("8","Lidia",7.5,8.3);
        Aluno aluno9 = new Aluno("9","Jordan",7.5,8.3);
        Aluno aluno10 = new Aluno("10","Ricardo",7.5,8.3);
        Aluno[] listaTurma1 ={aluno1,aluno2,aluno3,aluno4,aluno5,aluno6,aluno7,aluno8,aluno9,aluno10};
        POO turma1 = new POO("Turma 01", listaTurma1);
        if(turma1.procurarAluno("11")!=null){
            System.out.println(turma1.procurarAluno("11").getNome() + turma1.procurarAluno("11").getNota1() + turma1.procurarAluno("11").getNota2());
        }
        else
            System.out.println("Erro, não existe aluno com essa matricula");
            
    }
    
}
