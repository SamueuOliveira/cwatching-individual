package com.cw.services;

import com.cw.conexao.Conexao;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class MainIndividual {
    public static void main(String[] args) {
        Conexao conexao = new Conexao();
        JdbcTemplate con = conexao.getConexaoDoBanco();

        List<RegistroFuncionario> registros = con.query("SELECT * FROM registroFuncionario",
                new BeanPropertyRowMapper<>(RegistroFuncionario.class));

        System.out.println(registros);



    }
}
