package br.com.alura.leilao.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class LeilaoTest {

    private Leilao console = new Leilao("Console");
    private Usuario alex = new Usuario("Alex");
    private Usuario fran = new Usuario("Fran");

    @Test
    public void deve_DevolverDescricao_QuandoREcebeDescricao() {
        String descricaoDevolvida = console.getDescricao();
        assertEquals("Console", descricaoDevolvida);
    }

    @Test
    public void deve_DevolverMaiorLance_QuandoRecebeMaiorLance(){
        console.propoe(new Lance(alex, 200.0));

        double maiorLanceDevolvido = console.getMaiorLance();

        assertEquals(200.0, maiorLanceDevolvido, 0.0001);
    }

    @Test
    public void deve_DevolverMaiorLance_QuandoRecebeEntreDoisLancesOrdemCrescente(){
        console.propoe(new Lance(alex, 100.0));
        console.propoe(new Lance(fran, 200.0));

        double maiorLanceDevolvido = console.getMaiorLance();

        assertEquals(200.0, maiorLanceDevolvido, 0.0001);
    }

    @Test
    public void deve_DevolverMaiorLance_QuandoRecebeEntreDoisLancesOrdemDescrescente(){
        console.propoe(new Lance(alex, 10000.0));
        console.propoe(new Lance(fran, 9000.0));

        double maiorLanceDevolvido = console.getMaiorLance();

        assertEquals(10000.0, maiorLanceDevolvido, 0.0001);
    }

    @Test
    public void deve_DevolverMenorLance_QuandoRecebeMenorLance(){
        console.propoe(new Lance(alex, 200.0));

        double menorLanceDevolvido = console.getMenorLance();

        assertEquals(200.0, menorLanceDevolvido, 0.0001);
    }

    @Test
    public void deve_DevolverMenorLance_QuandoRecebeEntreDoisLancesOrdemCrescente(){
        console.propoe(new Lance(alex, 100.0));
        console.propoe(new Lance(fran, 200.0));

        double menorLanceDevolvido = console.getMenorLance();

        assertEquals(100.0, menorLanceDevolvido, 0.0001);
    }

    @Test
    public void deve_DevolverMenorLance_QuandoRecebeEntreDoisLancesOrdemDescrescente(){
        console.propoe(new Lance(alex, 10000.0));
        console.propoe(new Lance(fran, 9000.0));

        double menorLanceDevolvido = console.getMenorLance();

        assertEquals(9000.0, menorLanceDevolvido, 0.0001);
    }
}