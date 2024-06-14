package seres;

import ambientetecnico.Teclado;
import ambientetecnico.Tela;

public class Mago extends Personagem{
    public Mago(Tela tela, Teclado teclado){
        super(tela,teclado);
        super.setVida(50);
        super.setPontosPoder(500);
    }
    
}
