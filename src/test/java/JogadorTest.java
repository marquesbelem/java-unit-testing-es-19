import org.junit.Test;
import org.testng.Assert;

import javax.swing.plaf.synth.Region;

public class JogadorTest {

    //Testes que aplicam dano
    @Test
    public  void DanoMaiorQueZero() {

        //arrange - preparação
        Jogador jogador = new Jogador();
        int atual = 100;
        int esperado = 80;

        //act - ação
        atual = jogador.Dano(20);

        //assert - verficação
        Assert.assertEquals(esperado, atual);
    }

    @Test
    public  void DanoMenorQueZero() {

        Jogador jogador = new Jogador();
        int atual = 100;
        int esperado = 50;

        atual = jogador.Dano(-50);

        Assert.assertEquals(esperado, atual);
    }

    @Test
    public  void DanoIgualZero() {

        Jogador jogador = new Jogador();
        int atual = 100;
        int esperado = 100;

        atual = jogador.Dano(0);

        Assert.assertEquals(esperado, atual);
    }


    //Testes que aplicam cura
    @Test
    public  void CuraIgualZero() {

        Jogador jogador = new Jogador();

        //Fazer o mock setando a vida para 80 e mudar o valor atual para 80

        int atual = 100;
        int esperado = 100;

        atual = jogador.Cura(0);

        Assert.assertEquals(esperado, atual);
    }

    @Test
    public  void CuraMaiorQueVidaMaxima() {

        Jogador jogador = new Jogador();
        int atual = 100;
        int esperado = 100;

        atual = jogador.Cura(30);

        Assert.assertEquals(esperado, atual);
    }

    @Test
    public  void CuraMenorQueZero() {

        Jogador jogador = new Jogador();
        int atual = 100;
        int esperado = 100;

        atual = jogador.Cura(-5);

        Assert.assertEquals(esperado, atual);
    }
}
