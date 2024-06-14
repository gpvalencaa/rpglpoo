package seres;

import ambientetecnico.Teclado;
import ambientetecnico.Tela;

public class Sorrateiro extends Personagem{
    public Sorrateiro(Tela tela, Teclado teclado){
        super(tela,teclado);
        super.setVida(50);
        super.setPontosPoder(50);
        super.alteraMoedas(300);
    }
    
}
