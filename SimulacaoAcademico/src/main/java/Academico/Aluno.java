package Academico;

import java.util.Date;

public class Aluno extends Pessoa {
    public Aluno(String _Nome, String _CPF, Date _DtNascimento) {
        super(_Nome, _CPF, _DtNascimento);
    }
    String login;
    String matricula;
}