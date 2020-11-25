public class Jogador {

    private int _vida;
    private int _maxVida;

    public int GetVida ()
    {
        return  _vida;
    }

    public void SetVida(int vida)
    {
        _vida = vida;
    }

    public int GetMaxVida ()
    {
        return  _maxVida;
    }

    public void SetMaxVida(int maxVida)
    {
        _maxVida = maxVida;
    }

    public Jogador()
    {
        SetVida(100);
        SetMaxVida(100);
    }

    public int Dano(int danoAplicado) {

        if(danoAplicado < 0)
            danoAplicado = danoAplicado * -1;

        return GetVida() - danoAplicado;
    }

    public int Cura (int curaAplicada) {

        if(curaAplicada < 0)
            curaAplicada = curaAplicada * -1;

        int vidaFinal = GetVida() + curaAplicada;

        if(vidaFinal > GetMaxVida())
            vidaFinal = GetMaxVida();

        System.out.println("Vida Maxima: " + GetMaxVida());
        System.out.println("Vida Atual: " + GetVida());
        System.out.println("Cura Aplicada: " + curaAplicada);
        System.out.println("Vida Final: " + vidaFinal);

        return  vidaFinal;
    }
}
