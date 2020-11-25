public class JogadorMock {
    private double saldo, vidaAtual;

    public JogadorMock(){
        carregarSaldo();
    }

    private void carregarSaldo(){
        saldo = 20;
    }

    public double comprarCura(double valor){
        if(saldo > 10) {
            if (valor > 0) {
                if (valor == 10) {
                    setVida(getVida() + 50);
                    saldo = saldo - 10;

                } else if (valor == 20) {
                    setVida(100);
                    saldo = saldo - 20;
                }
            } else {
                System.out.println("O valor deve ser igual a R$10,00 ou R$20,00 para comprar Cura.");
            }
        } else {
            System.out.println("O saldo deve ser igual ou superior a R$10,00 para comprar Cura.");
        }
        return getTotal();
    }

    private void setVida(double vidaAtual) {
        this.vidaAtual = vidaAtual;
    }

    public double getVida(){
        return vidaAtual;
    }

    public double getTotal(){
        return vidaAtual;
    }

}