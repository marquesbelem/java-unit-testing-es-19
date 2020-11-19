public class Jogador {

    public int dano(int vida, int dano) {

        if(dano < 0)
            dano = dano * -1;

        return  vida - dano;
    }
}
