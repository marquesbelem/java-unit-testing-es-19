import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.testng.Assert;

import javax.swing.plaf.synth.Region;
@RunWith(PowerMockRunner.class)
@PrepareForTest(Jogador.class)
public class JogadorTest {

    //Testes que aplicam dano
    @Test
    public  void DanoMaiorQueZero() {

        //arrange - preparação
        Jogador jogador = new Jogador(false);
        int atual = 100;
        int esperado = 80;

        //act - ação
        atual = jogador.Dano(20);

        //assert - verficação
        Assert.assertEquals(esperado, atual);
    }

    @Test
    public  void DanoMenorQueZero() {

        Jogador jogador = new Jogador(false);
        int atual = 100;
        int esperado = 50;

        atual = jogador.Dano(-50);

        Assert.assertEquals(esperado, atual);
    }

    @Test
    public  void DanoIgualZero() {

        Jogador jogador = new Jogador(false);
        int atual = 100;
        int esperado = 100;

        atual = jogador.Dano(0);

        Assert.assertEquals(esperado, atual);
    }


    //Testes que aplicam cura
    @Test
    public  void CuraIgualZero() {

        Jogador jogador = new Jogador(false);

        int atual = 80;
        int esperado = 80;

        jogador.SetVida(80);
        atual = jogador.Cura(0);

        Assert.assertEquals(esperado, atual);
    }

    @Test
    public  void CuraMaiorQueVidaMaxima() {

        Jogador jogador = new Jogador(false);
        int atual = 100;
        int esperado = 100;

        atual = jogador.Cura(30);

        Assert.assertEquals(esperado, atual);
    }

    @Test
    public  void CuraMenorQueZero() {

        Jogador jogador = new Jogador(false);
        int atual = 100;
        int esperado = 100;

        atual = jogador.Cura(-5);

        Assert.assertEquals(esperado, atual);
    }

    @Test
    public  void CuraMaxima150CuraMaiorQueZero() {

        Jogador jogador = new Jogador(false);
        int atual = 100;
        int esperado = 150;

        jogador.SetMaxVida(150);
        atual = jogador.Cura(50);

        Assert.assertEquals(esperado, atual);
    }

    private double valorZerado;
    private double valorMeia;
    private double valorCheia;

    @Before
    public void PrepareTests(){
        valorZerado = 0;
        valorMeia = 10;
        valorCheia = 20;
    }

    //Teste de comprar colete
    @Test
    public void ComprarColeteValorNormal() throws Exception {

        //arrange
        Jogador compraColete =  new Jogador(true);

        double esperado = 50;
        double atual;

        //act
        compraColete.ComprarColete(valorMeia);

        atual = compraColete.GetTotalColete();

        //assert
        Assert.assertEquals(  esperado, atual, 0);
    }

    @Test
    public void ComprarColeteValorSuper() throws Exception {

        //arrange
        Jogador compraColete =  new Jogador(true);

        double esperado = 100;
        double atual;

        //act
        compraColete.ComprarColete(valorCheia);

        atual = compraColete.GetTotalColete();

        //assert
        Assert.assertEquals(  esperado, atual, 0);

    }

    @Test
    public void ComprarColeteValorZerado() throws Exception {

        //arrange
        Jogador compraColete =  new Jogador(true);

        double esperado = 0;
        double atual;

        //act
        compraColete.ComprarColete(valorZerado);

        atual = compraColete.GetTotalColete();

        //assert
        Assert.assertEquals(esperado, atual, 0);
    }

    @Test
    public void ComprarColeteValorDiferentede10e20() throws Exception {

        //arrange
        Jogador compraColete =  new Jogador(true);

        double esperado = 0;
        double atual;

        //act
        compraColete.ComprarColete(30);

        atual = compraColete.GetTotalColete();

        //assert
        Assert.assertEquals(  esperado, atual, 0);
    }

    @Test
    public void SaldoMenorQue10eComprarColete() throws Exception {

        //arrange
        Jogador compraColete =  new Jogador(true);

        double esperado = 0;
        double atual;

        //act
        compraColete.SetSaldo(5);
        atual = compraColete.ComprarColete(10);

        //assert
       Assert.assertEquals(esperado, atual, 0);
    }

}
