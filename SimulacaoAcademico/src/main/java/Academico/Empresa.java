/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Academico;

import java.util.Date;

public class Empresa extends Pessoa {
    public Empresa(String _Nome, String _CPF, Date _DtNascimento) {
        super(_Nome, _CPF, _DtNascimento);
    }
    String login;
    String matricula;
}