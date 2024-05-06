package jogoo;
import java.util.*;

public class Personagem {
    String nome;
    int vida;
    int pontosPoder;
    int moedas;


    public Personagem (){
        Scanner leitor = new Scanner(System.in);
        this.nome = new String (leitor.nextLine());
        
    }

    public String getNome (){
        return nome;
    }


    public int getVida () {
        return vida;
    }

    public int getMoedas () {
        return moedas;
    }

    public int getPontosPoder () {
        return pontosPoder;

    }

    public void somaVida (int quantidade) {
        vida = vida + quantidade;
    }

    public void subtraiVida (int quantidade) {
        vida = vida - quantidade;
    }

    public void addMoedas (int quantidade) {
        moedas = moedas + quantidade;

    }
    
    public void subtraiMoedas (int quantidade) {

    }



    
}
