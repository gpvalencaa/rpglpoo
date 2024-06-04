package seres;

import java.util.Scanner;

public class Entidade {
    int vida;
    String nome;
    int pontosPoder;
    int posicaoX;
    int posicaoY;

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

    


    public void ataque (Entidade atacado,int quantidadePV){
        atacado.alteraVida(-quantidadePV);
    }

    public int getPosicaoX() {
        return posicaoX;
    }

    public int getPosicaoY() {
        return posicaoY;
    }

    public void andar(int quantidadeX, int quantidadeY){
        this.posicaoX = this.posicaoX + quantidadeX;
        this.posicaoY = this.posicaoY + quantidadeY;
    }

    public void interagir(int posicaoXInteragido, int posicaoYInteragido){
        if (this.posicaoX == posicaoXInteragido && this.posicaoY == posicaoYInteragido) {
            //tela de interação


        }
    }
}
