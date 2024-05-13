package com.cw.services;

import java.util.Date;

public class Tarefa {


    private Integer id_tarefa;
    private Date dt_inicio;
    private Date dt_fim;
    private Integer concluida;

    public Tarefa(Integer id_tarefa, Date dt_inicio, Date dt_fim, Integer concluida) {
        this.id_tarefa = id_tarefa;
        this.dt_inicio = dt_inicio;
        this.dt_fim = dt_fim;
        this.concluida = concluida;
    }

    public Tarefa() {

    }

    public Integer getId_tarefa() {
        return id_tarefa;
    }

    public void setId_tarefa(Integer id_tarefa) {
        this.id_tarefa = id_tarefa;
    }

    public Date getDt_inicio() {
        return dt_inicio;
    }

    public void setDt_inicio(Date dt_inicio) {
        this.dt_inicio = dt_inicio;
    }

    public Date getDt_fim() {
        return dt_fim;
    }

    public void setDt_fim(Date dt_fim) {
        this.dt_fim = dt_fim;
    }

    public Integer getConcluida() {
        return concluida;
    }

    public void setConcluida(Integer concluida) {
        this.concluida = concluida;
    }

    @Override
    public String toString() {
        return """
                Registro da tarefa: %d.
                Data de inicio: %tc.
                Data limite: %tc.
                Quantidade de tarefas concluídas: %d.
                """.formatted(id_tarefa, dt_inicio, dt_fim, concluida);
    }
}
