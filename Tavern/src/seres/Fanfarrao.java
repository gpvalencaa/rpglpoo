package seres;

import ambientetecnico.Teclado;
import ambientetecnico.Tela;

public class Fanfarrao extends Personagem{

    public Fanfarrao(Tela tela, Teclado teclado){
        super(tela,teclado);
        super.setVida(400);
        super.setPontosPoder(100);

    }
    
}
