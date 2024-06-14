package seres;

import ambientetecnico.Teclado;
import ambientetecnico.Tela;

public class Espadachim extends Personagem{

    public Espadachim(Tela tela, Teclado teclado){
        super(tela,teclado);
        super.setVida(100);
        super.setPontosPoder(300);
    }

    
}
