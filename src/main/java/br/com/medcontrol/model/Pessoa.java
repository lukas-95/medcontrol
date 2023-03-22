package br.com.medcontrol.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.SimpleDateFormat;

public class Pessoa {

    public String nome;
    public int idade;

    public SimpleDateFormat nascimento;

    public String sexo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public SimpleDateFormat getNascimento() {
        return nascimento;
    }

    public void setNascimento(SimpleDateFormat nascimento) {
        this.nascimento = nascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Pessoa(String nome, int idade, SimpleDateFormat nascimento, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.nascimento = nascimento;
        this.sexo = sexo;
    }
}
