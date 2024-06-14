package seres;

import ambientetecnico.*;

public class Arqueiro extends Personagem {
    public Arqueiro (Tela tela, Teclado teclado){
        super(tela, teclado);
        super.setVida(100);
        super.setPontosPoder(100);
    }
    
}
