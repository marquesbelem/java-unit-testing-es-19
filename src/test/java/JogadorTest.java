import org.junit.Test;
import org.testng.Assert;

public class JogadorTest {

    @Test
    public  void DarDano() {

        //arrange - preparação
        Jogador jogador = new Jogador();
        int atual = 100;
        int esperado = 80;

        //act - ação
        atual = jogador.dano(100,-20);

        //assert - verficicação
        Assert.assertEquals(esperado, atual);
    }
}
