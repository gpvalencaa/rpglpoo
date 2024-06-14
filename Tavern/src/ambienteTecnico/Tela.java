package ambientetecnico;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import seres.Personagem;

public class Tela extends JPanel implements Runnable{

    final int tamanhoDefaultOriginal = 16;
    final int escala = 3;
    public final int tamanhoDefault = tamanhoDefaultOriginal * escala;
    final int quantidadeMaxTerrenoX = 16;
    final int quantidadeMaxTerrenoY = 12;
    final int larguraTela = tamanhoDefault * quantidadeMaxTerrenoX;
    final int alturaTela = tamanhoDefault * quantidadeMaxTerrenoY;

    int fps = 60;

    Teclado teclado = new Teclado();
    Thread threadJogo;
    Personagem personagemPrincipal = new Personagem(this, teclado); 

    int posX = 100;
    int posY = 100;
    int velocidadePlayer = 4;

    public Tela(){
        this.setPreferredSize(new Dimension(larguraTela, alturaTela));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
        this.addKeyListener(teclado);
        this.setFocusable(true);
    }

    public void comecaThreadJogo(){
        threadJogo = new Thread(this);
        threadJogo.start();
    }

    @Override
    public void run() {

        double intervaloDesenho = 1000000000/fps;
        double proximoDesenho = System.nanoTime() + intervaloDesenho;

        while(threadJogo != null){
            System.out.println("Game loop rodando!");

            long tempoAtual = System.nanoTime();

            update();

            repaint();


            try {
                double tempoRestante = proximoDesenho - System.nanoTime();
                tempoRestante = tempoRestante/1000000;

                if (tempoRestante < 0){
                    tempoRestante = 0;
                }

                Thread.sleep((long) tempoRestante);

                proximoDesenho += intervaloDesenho; 

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        
        
    }

    public void update(){
        personagemPrincipal.update();
        
    }

    @Override
    public void paintComponent(Graphics g) {
        // TODO Auto-generated method stub
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        personagemPrincipal.draw(g2);

        g2.dispose();
    }
}