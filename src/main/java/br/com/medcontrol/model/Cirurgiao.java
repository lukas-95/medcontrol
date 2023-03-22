package br.com.medcontrol.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.SimpleDateFormat;

public class Cirurgiao extends Pessoa {

    private int CRM;
    private String Especializacao;

    private int telefone;




    public int getCRM() {
        return CRM;
    }

    public void setCRM(int CRM) {
        this.CRM = CRM;
    }

    public String getEspecializacao() {
        return Especializacao;
    }

    public void setEspecializacao(String especializacao) {
        Especializacao = especializacao;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public Cirurgiao(String nome, int idade, SimpleDateFormat nascimento, String sexo, int CRM, String especializacao, int telefone) {
        super(nome, idade, nascimento, sexo);
        this.CRM = CRM;
        Especializacao = especializacao;
        this.telefone = telefone;
    }
}
