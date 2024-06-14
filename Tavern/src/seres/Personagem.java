package seres;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.*;

import javax.imageio.ImageIO;

import ambiente.*;
import progressao.*;
import ambientetecnico.*;

public class Personagem extends Entidade{
    private int moedas;
    //private Item[] item = new Item[11];
    Nivel nivel; 
    Inventario inventario;
    Tela tela;
    Teclado teclado;
    



    public Personagem(Tela tela, Teclado teclado){ 
        //System.out.println("Digite o nome do personagem: ");
        //super.nome = scaneiaNome();

        this.tela = tela;
        this.teclado = teclado;
        setValoresDefault();
        getImagemPlayer();

        nivel = new Nivel();
        this.nivel.setNumeroNivel(1);
        inventario = new Inventario();
        }

    public String scaneiaNome (){
        Scanner lernome = new Scanner(System.in);
        String nomePersonagem = new String (lernome.nextLine());
        return nomePersonagem;
    }

    public int getMoedas () {
        return this.moedas;
    }

    public void alteraMoedas (int quantidade) {
        moedas = moedas + quantidade;

    }

    public void progressaoPersonagem(){
        if (nivel.avancouNivel(this)== true){
            nivel.xpRewards(this);
        }
    }

    public int getNivel() {
        return this.nivel.getNumeroNivel();
    }

    public int getContadorItemInventario(){
        return inventario.getContadorItem();
    }

    public void addItemInventario(Item item){
        inventario.addItem(item);
    }

    public void setValoresDefault(){
        posicaoX = 100;
        posicaoY = 100;
        velocidade = 4;
        direcao = "baixo";
    }

    public void update(){
        if (teclado.pressionouCima == true){
            direcao = "cima";
            posicaoY -= velocidade;
        } else if (teclado.pressionouBaixo == true){
            direcao = "baixo";
            posicaoY += velocidade;
        } else if (teclado.pressionouDireita == true){
            direcao = "direita";
            posicaoX += velocidade;
        } else if (teclado.pressionouEsquerda == true){
            direcao = "esquerda";
            posicaoX -= velocidade;
        }

    }

    public void draw(Graphics2D g2){
        //g2.setColor(Color.white);
        //g2.fillRect(posicaoX, posicaoY, tela.tamanhoDefault, tela.tamanhoDefault);

        BufferedImage imagem = null;

        switch (direcao) {
            case "cima":
            imagem = cima1;
                break;
            case "baixo":
            imagem = baixo1;
                break;
            case "esquerda":
            imagem = esquerda1;
                break;
            case "direita":
            imagem = direita1;
                break;
        }
        g2.drawImage(imagem, posicaoX, posicaoY, tela.tamanhoDefault, tela.tamanhoDefault, null);

    }   

    public void getImagemPlayer(){
        try {
            cima1 = ImageIO.read(getClass().getResourceAsStream("/personagem/up1.png"));
            cima2 = ImageIO.read(getClass().getResourceAsStream("/personagem/up2.png"));
            baixo1 = ImageIO.read(getClass().getResourceAsStream("/personagem/down1.png"));
            baixo2 = ImageIO.read(getClass().getResourceAsStream("/personagem/down2.png"));
            direita1 = ImageIO.read(getClass().getResourceAsStream("/personagem/right1.png"));
            direita2 = ImageIO.read(getClass().getResourceAsStream("/personagem/right2.png"));
            esquerda1 = ImageIO.read(getClass().getResourceAsStream("/personagem/left1.png"));
            esquerda2 = ImageIO.read(getClass().getResourceAsStream("/personagem/left2.png"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}

/*public void ataqueUsuario (Entidade atacado, int quantidade){
        Scanner opcao = new Scanner(System.in);
        //System.out.println("Aperte 1 para atacar:");
        int escolha = opcao.nextInt();
        if (escolha == 1){
            super.ataque(atacado, quantidade);
        }
    }*/