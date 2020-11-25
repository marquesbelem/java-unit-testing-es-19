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
        atual = jogador.dano(100,20);

        //assert - verficação
        Assert.assertEquals(esperado, atual);
    }

    @Test
    public  void DanoMenorQueZero() {

        Jogador jogador = new Jogador();
        int atual = 100;
        int esperado = 50;

        atual = jogador.dano(100,-50);

        Assert.assertEquals(esperado, atual);
    }

    @Test
    public  void DanoIgualZero() {

        Jogador jogador = new Jogador();
        int atual = 100;
        int esperado = 100;

        atual = jogador.dano(100,0);

        Assert.assertEquals(esperado, atual);
    }


    //Testes que aplicam cura
    @Test
    public  void CuraIgualZero() {

        Jogador jogador = new Jogador();
        int atual = 80;
        int esperado = 100;

        atual = jogador.cura(100,80,30);

        Assert.assertEquals(esperado, atual);
    }

}
