package teste.heranca;

import infra.DAO;
import modelo.heranca.Aluno;
import modelo.heranca.AlunoBolsista;

public class NovoAluno {
    public static void main(String[] args) {

        DAO< Aluno> alunoDAO = new DAO<>();

        Aluno aluno1 = new Aluno(123L, "joao");
        AlunoBolsista aluno2 = new AlunoBolsista(234L, "Maria", 1000.00);
        alunoDAO.incluirAtomico(aluno1);
        alunoDAO.incluirAtomico(aluno2);

        alunoDAO.fechar();
    }
}
