package br.com.alura.leilao.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class LeilaoTest {

    @Test
    public void getDescricao() {
        Leilao console = new Leilao("Console");
        String descricaoDevolvida = console.getDescricao();
        assertEquals("Console", descricaoDevolvida);
    }
}