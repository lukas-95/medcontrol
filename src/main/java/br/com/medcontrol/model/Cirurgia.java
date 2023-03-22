package br.com.medcontrol.model;


import java.time.LocalDate;
import java.util.ArrayList;

public class Cirurgia {

    public ArrayList<Cirurgiao> cirurgioes;
    public Paciente paciente;
    public LocalDate dataCirurgia;
    public String tipoCirurgia;

    public Cirurgia(ArrayList<Cirurgiao> cirurgioes, Paciente paciente, LocalDate dataCirurgia, String tipoCirurgia) {
        this.cirurgioes = cirurgioes;
        this.paciente = paciente;
        this.dataCirurgia = dataCirurgia;
        this.tipoCirurgia = tipoCirurgia;
    }

    public ArrayList<Cirurgiao> getCirurgiaos() {
        return cirurgioes;
    }

    public void setCirurgiaos(ArrayList<Cirurgiao> cirurgiaos) {
        this.cirurgioes = cirurgiaos;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public LocalDate getDataCirurgia() {
        return dataCirurgia;
    }

    public void setDataCirurgia(LocalDate dataCirurgia) {
        this.dataCirurgia = dataCirurgia;
    }

    public String getTipoCirurgia() {
        return tipoCirurgia;
    }

    public void setTipoCirurgia(String tipoCirurgia) {
        this.tipoCirurgia = tipoCirurgia;
    }
}
