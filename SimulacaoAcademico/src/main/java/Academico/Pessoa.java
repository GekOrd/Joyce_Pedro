package Academico;

import java.util.Date;

public class Pessoa {

    final Date _DtNascimento;
    final String _CPF;
    final String _Nome;

    /**
     * @return the Nome
     */
    public String getNome() {
        return Nome;
    }

    /**
     * @param Nome the Nome to set
     */
    public void setNome(String Nome) {
        this.Nome = Nome;
        
    }

    /**
     * @return the CPF
     */
    public String getCPF() {
        return CPF;
    }

    /**
     * @param CPF the CPF to set
     */
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    /**
     * @return the DtNascimento
     */
    public Date getDtNascimento() {
        return DtNascimento;
    }

    /**
     * @param DtNascimento the DtNascimento to set
     */
    public void setDtNascimento(Date DtNascimento) {
        this.DtNascimento = DtNascimento;
    }

    public String Nome;
    public String CPF;
    public Date DtNascimento;

    public Pessoa(String _Nome, String _CPF, Date _DtNascimento){
        this._Nome = _Nome;
        this._CPF = _CPF;
        this._DtNascimento = _DtNascimento; 
    }
}
