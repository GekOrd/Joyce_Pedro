package Academico;

import java.util.Date;

public class Professor extends Pessoa {

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public Professor(String _Nome, String _CPF, Date _DtNascimento) {
        super(_Nome, _CPF, _DtNascimento);
    }
    private String login;
    private String matricula;
}
