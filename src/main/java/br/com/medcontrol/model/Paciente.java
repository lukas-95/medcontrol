package br.com.medcontrol.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.SimpleDateFormat;

public class Paciente extends Pessoa {
    private String comorbidade;
    private SimpleDateFormat entrada;

    public String getComorbidade() {
        return comorbidade;
    }

    public void setComorbidade(String comorbidade) {
        this.comorbidade = comorbidade;
    }

    public SimpleDateFormat getEntrada() {
        return entrada;
    }

    public void setEntrada(SimpleDateFormat entrada) {
        this.entrada = entrada;
    }

    public Paciente(String comorbidade, SimpleDateFormat entrada) {
        super();
        this.comorbidade = comorbidade;
        this.entrada = entrada;
    }

    public Paciente(String nome, int idade, SimpleDateFormat nascimento, String sexo, String comorbidade, SimpleDateFormat entrada) {
        super(nome, idade, nascimento, sexo);
        this.comorbidade = comorbidade;
        this.entrada = entrada;
    }
}
