import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(JogadorMock.class)
public class JogadorMockTest {

    private double valorMenor;
    private double valorMaior;
    private double valorMeia;
    private double valorCheia;

    @Before
    public void prepareTests(){
        valorMenor = 9;
        valorMaior = 21;
        valorMeia = 10;
        valorCheia = 20;
    }

    @Test
    public void testComprarMeiaVida() throws Exception {

        //arrange
        JogadorMock compraVida =  new JogadorMock();

        double esperado = 50;
        double atual;

        //act
        compraVida.comprarCura(valorMeia);

        atual = compraVida.getTotal();

        //assert
        Assert.assertEquals(  esperado, atual, 0);

    }
}
