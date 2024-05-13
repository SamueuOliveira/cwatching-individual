package com.cw.services;

import java.sql.Timestamp;

public class Tempo_ociosidade {
    private Integer id_tempo_ociosidade;
    private Timestamp dt_hora_registro;
    private Integer temporegistroseg;

    public Tempo_ociosidade(Integer id_tempo_ociosidade, Timestamp dt_hora_registro, Integer tempo_registro_seg) {
        this.id_tempo_ociosidade = id_tempo_ociosidade;
        this.dt_hora_registro = dt_hora_registro;
        this.temporegistroseg = tempo_registro_seg;
    }

    public Tempo_ociosidade() {

    }

    public Integer getId_tempo_ociosidade() {
        return id_tempo_ociosidade;
    }

    public void setId_tempo_ociosidade(Integer id_tempo_ociosidade) {
        this.id_tempo_ociosidade = id_tempo_ociosidade;
    }

    public Timestamp getDt_hora_registro() {
        return dt_hora_registro;
    }

    public void setDt_hora_registro(Timestamp dt_hora_registro) {
        this.dt_hora_registro = dt_hora_registro;
    }

    public Integer getTempo_registro_seg() {
        return temporegistroseg;
    }

    public void setTempo_registro_seg(Integer tempo_registro_seg) {
        this.temporegistroseg = tempo_registro_seg;
    }

    @Override
    public String toString() {
        return """
                Registro da ociosidade: %d.
                Data / Hora do registro: %tc.
                Tempo em segundos registrado: %d.
                
                """.formatted(id_tempo_ociosidade, dt_hora_registro, temporegistroseg);


    }
}
