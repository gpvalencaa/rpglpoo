package ambientetecnico;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class Tela extends JPanel implements Runnable{

    final int tamanhoDefaultOriginal = 16;
    final int escala = 3;
    final int tamanhoDefault = tamanhoDefaultOriginal * escala;
    final int quantidadeMaxTerrenoX = 16;
    final int quantidadeMaxTerrenoY = 12;
    final int larguraTela = tamanhoDefault * quantidadeMaxTerrenoX;
    final int alturaTela = tamanhoDefault * quantidadeMaxTerrenoY;

    Thread threadJogo;

    public Tela(){
        this.setPreferredSize(new Dimension(larguraTela, alturaTela));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
    }

    public void comecaThreadJogo(){
        threadJogo = new Thread(this);
        threadJogo.start();
    }

    @Override
    public void run() {
        while(threadJogo != null){
            System.out.println("Game loop rodando!");
        }
        update();
        repaint();
        
    }

    public void update(){

    }

    @Override
    public void paintComponent(Graphics g) {
        // TODO Auto-generated method stub
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;


        g2.setColor(Color.white);
        g2.fillRect(100, 100, tamanhoDefault, tamanhoDefault);
        g2.dispose();
    }
}