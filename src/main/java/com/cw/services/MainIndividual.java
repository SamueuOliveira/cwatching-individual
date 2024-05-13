package com.cw.services;

import com.cw.conexao.Conexao;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class MainIndividual {
    public static void main(String[] args) {
        Conexao conexao = new Conexao();
        JdbcTemplate con = conexao.getConexaoDoBanco();


// OCIOSIDADE / DISPONIBILIDADE
        con.execute("DROP TABLE IF EXISTS tempo_ociosidade");

        con.execute("""
    CREATE TABLE IF NOT EXISTS tempo_ociosidade (  
        id_tempo_ociosidade INT PRIMARY KEY AUTO_INCREMENT,
        dt_hora_registro DATETIME DEFAULT CURRENT_TIMESTAMP,
        tempo_registro_seg INT,
        fk_usuario INT,
        CONSTRAINT fk_usuario_tempo_ociosidade FOREIGN KEY (fk_usuario) REFERENCES usuario(id_usuario)
    )
""");
        con.update("INSERT INTO tempo_ociosidade (tempo_registro_seg) VALUES (500)");
        con.update("INSERT INTO tempo_ociosidade (tempo_registro_seg) VALUES (980)");
        con.update("INSERT INTO tempo_ociosidade (tempo_registro_seg) VALUES (1425)");
        con.update("INSERT INTO tempo_ociosidade (tempo_registro_seg) VALUES (1308)");

        List<Tempo_ociosidade> tempoOcioso = con.query("SELECT * FROM tempo_ociosidade", new BeanPropertyRowMapper<>(Tempo_ociosidade.class));

        System.out.println(tempoOcioso);

// TAREFAS / DESEMPENHO

        con.execute("DROP TABLE IF EXISTS tarefa");

        con.execute("""
    CREATE TABLE IF NOT EXISTS tarefa (  
        id_tarefa INT PRIMARY KEY AUTO_INCREMENT,
                         descricao VARCHAR(255),
                         dt_fim DATE,
                         dt_inicio DATE,
                         concluida TINYINT DEFAULT 0,
                         dt_concluida DATE DEFAULT (CURRENT_DATE));
""");

        con.update("INSERT INTO tarefa (descricao, dt_fim, dt_inicio, concluida, dt_concluida) VALUES " +
                "('Atendimento ao cliente', '2024-05-20', '2024-05-15', 1, '2024-05-20'), " +
                "('Reunião de equipe', '2024-05-25', '2024-05-24', 0, NULL), " +
                "('Treinamento em novos sistemas', '2024-06-10', '2024-06-01', 0, NULL)");


        List<Tarefa> tarefas = con.query("SELECT * FROM tarefa", new BeanPropertyRowMapper<>(Tarefa.class));

        System.out.println(tarefas);



    }
}
