public class Jogador {

    public int dano(int vidaAtual, int danoAplicado) {

        if(danoAplicado < 0)
            danoAplicado = danoAplicado * -1;

        int vidaFinal = vidaAtual - danoAplicado;

        return  vidaFinal;
    }

    public int cura (int vidaMaxima, int vidaAtual, int curaAplicada) {

        if(curaAplicada < 0)
            vidaAtual = curaAplicada * -1;

        int vidaFinal = vidaAtual + curaAplicada;

        if(vidaFinal > vidaMaxima)
            vidaFinal = vidaMaxima;

        System.out.println("Vida Maxima: " + vidaMaxima);
        System.out.println("Vida Atual: " + vidaAtual);
        System.out.println("Cura Aplicada: " + curaAplicada);
        System.out.println("Vida Final: " + vidaFinal);

        return  vidaFinal;
    }
}
