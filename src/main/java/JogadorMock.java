public class JogadorMock {
    private double saldo, coleteAtual;

    public JogadorMock(){
        carregarSaldo();
    }

    private void carregarSaldo(){
        saldo = 20;
    }

    public double comprarColete(double valor){
        if(saldo > 10) {
            if (valor > 0) {
                if (valor == 10) {
                    setVida(getVida() + 50);
                    saldo = saldo - 10;

                } else if (valor == 20) {
                    setVida(100);
                    saldo = saldo - 20;
                } else {
                    System.out.println("Escolha R$10,00 ou R$20,00 para comprar Colete.");
                }
            } else {
                System.out.println("O valor deve ser igual a R$10,00 ou R$20,00 para comprar Colete ou o SuperColete.");
            }
        } else {
            System.out.println("O saldo deve ser igual ou superior a R$10,00 para comprar Colete ou SuperColete.");
        }
        return getTotal();
    }

    private void setVida(double coleteAtual) {
        this.coleteAtual = coleteAtual;
    }

    public double getVida(){
        return coleteAtual;
    }

    public double getTotal(){
        return coleteAtual;
    }

}