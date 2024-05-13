package jogoo;

import java.util.Scanner;

public class Entidade {
    int vida;
    String nome;
    int pontosPoder;
    int moedas;

    public Entidade(){
           
    }

    public String getNome (){
        return this.nome;
    }

    public void setVida(int vida){
        this.vida = vida;
    }


    public int getVida () {
        return this.vida;
    }

    public int getMoedas () {
        return this.moedas;
    }

    public int getPontosPoder () {
        return this.pontosPoder;
    }

    public void alteraPontosPoder(int quantidade){
        pontosPoder = pontosPoder + quantidade;
    }

    public void setPontosPoder(int quantidade){
        pontosPoder = quantidade;
    }

    public void alteraVida (int quantidade) {
        vida = vida + quantidade;
    }

    public void alteraMoedas (int quantidade) {
        moedas = moedas + quantidade;

    }


    public void ataque (Entidade atacado,int quantidadePV){
        atacado.alteraVida(-quantidadePV);
    }
}
