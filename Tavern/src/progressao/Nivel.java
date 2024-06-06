package progressao;
import seres.*;

public class Nivel  {
    private int numeroNivel;
    
    public void setNumeroNivel(int numeroNivel) {
        this.numeroNivel = numeroNivel;
    }

    public boolean avancouNivel(Personagem personagem){
        this.numeroNivel++;
        return true;
    }

    public void xpRewards (Personagem personagem){
        personagem.alteraMoedas(this.numeroNivel*20);
        personagem.alteraPontosPoder(this.numeroNivel*50);
        personagem.alteraVida(this.numeroNivel);
    }

    public int getNumeroNivel() {
        return numeroNivel;
    }
    
}
