import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(JogadorMock.class)
public class JogadorMockTest {

    private double valorZerado;
    private double valorMeia;
    private double valorCheia;

    @Before
    public void prepareTests(){
        valorZerado = 0;
        valorMeia = 10;
        valorCheia = 20;
    }

    @Test
    public void testComprarValorNormal() throws Exception {

        //arrange
        JogadorMock compraColete =  new JogadorMock();

        double esperado = 50;
        double atual;

        //act
        compraColete.comprarColete(valorMeia);

        atual = compraColete.getTotal();

        //assert
        Assert.assertEquals(  esperado, atual, 0);

    }

    @Test
    public void testComprarValorSuper() throws Exception {

        //arrange
        JogadorMock compraColete =  new JogadorMock();

        double esperado = 100;
        double atual;

        //act
        compraColete.comprarColete(valorCheia);

        atual = compraColete.getTotal();

        //assert
        Assert.assertEquals(  esperado, atual, 0);

    }

    @Test
    public void testComprarValorZerado() throws Exception {

        //arrange
        JogadorMock compraColete =  new JogadorMock();

        double esperado = 0;
        double atual;

        //act
        compraColete.comprarColete(valorZerado);

        atual = compraColete.getTotal();

        //assert
        Assert.assertEquals(  esperado, atual, 0);

    }

}
