package com.cw.services;

import java.sql.Timestamp;

public class Apontamento {
    private Integer id_apontamento;
    private Timestamp dt_hora;
    private Double satisfacao;

    public Apontamento(Integer id_apontamento, Timestamp dt_hora, Double satisfacao) {
        this.id_apontamento = id_apontamento;
        this.dt_hora = dt_hora;
        this.satisfacao = satisfacao;
    }

    public Apontamento() {

    }

    public Integer getId_apontamento() {
        return id_apontamento;
    }

    public void setId_apontamento(Integer id_apontamento) {
        this.id_apontamento = id_apontamento;
    }

    public Timestamp getDt_hora() {
        return dt_hora;
    }

    public void setDt_hora(Timestamp dt_hora) {
        this.dt_hora = dt_hora;
    }

    public Double getSatisfacao() {
        return satisfacao;
    }

    public void setSatisfacao(Double satisfacao) {
        this.satisfacao = satisfacao;
    }
}
