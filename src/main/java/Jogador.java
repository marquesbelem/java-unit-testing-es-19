public class Jogador {

    private int _vida;
    private int _maxVida;
    private double _saldo;
    private double _coleteAtual = 0;

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

    public Jogador(boolean carregaSaldo)
    {
        if(!carregaSaldo)
        {
            SetVida(100);
            SetMaxVida(100);
        }
        else {
            SetSaldo(20);
        }
    }

    public int Dano(int danoAplicado) {

        if(danoAplicado < 0)
            danoAplicado = danoAplicado * -1;

        int vidaFinal = GetVida() - danoAplicado;

        System.out.println("Evento de dano iniciado com: ");
        System.out.println("\n \t Vida Atual: " + GetVida());
        System.out.println("\n \t Dano Aplicado: " + danoAplicado);
        System.out.println("\n \t Vida Final: " + vidaFinal);
        System.out.println("\n");

        return vidaFinal;
    }

    public int Cura (int curaAplicada) {

        if(curaAplicada < 0)
            curaAplicada = curaAplicada * -1;

        int vidaFinal = GetVida() + curaAplicada;

        if(vidaFinal > GetMaxVida())
            vidaFinal = GetMaxVida();

        System.out.println("Evento de cura iniciado com: ");
        System.out.println("\n \t Vida Maxima: " + GetMaxVida());
        System.out.println("\n \t Vida Atual: " + GetVida());
        System.out.println("\n \t Cura Aplicada: " + curaAplicada);
        System.out.println("\n \t Vida Final: " + vidaFinal);
        System.out.println("\n");

        return  vidaFinal;
    }

    public double GetSaldo()
    {
        return _saldo;
    }

    public void SetSaldo(double saldo)
    {
        _saldo = saldo;
    }

    public double ComprarColete(double valor){
        if(GetSaldo() > 10) {
            if (valor > 0) {
                if (valor == 10) {
                    SetColete(GetColete() + 50);
                    _saldo = _saldo - 10;

                } else if (valor == 20) {
                    SetColete(100);
                    _saldo = _saldo - 20;
                } else {
                    System.out.println("Escolha R$10,00 ou R$20,00 para comprar Colete.");
                }
            } else {
                System.out.println("O valor deve ser igual a R$10,00 ou R$20,00 para comprar Colete ou o SuperColete.");
            }
        } else {
            System.out.println("O saldo deve ser igual ou superior a R$10,00 para comprar Colete ou SuperColete.");
        }
        return GetTotalColete();
    }

    private void SetColete(double coleteAtual)
    {
        _coleteAtual = coleteAtual;
    }

    public double GetColete()
    {
        return _coleteAtual;
    }

    public double GetTotalColete()
    {
        return _coleteAtual;
    }
}
