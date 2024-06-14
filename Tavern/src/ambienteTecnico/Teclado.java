package ambientetecnico;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Teclado implements KeyListener {
    public boolean pressionouCima, pressionouBaixo, pressionouEsquerda, pressionouDireita;

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'keyTyped'");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'keyPressed'");
        int tecla = e.getKeyCode();

        if (tecla == KeyEvent.VK_W){
            pressionouCima = true;
        }

        if (tecla == KeyEvent.VK_S){
            pressionouBaixo = true;
        }
        if (tecla == KeyEvent.VK_A){
            pressionouEsquerda = true;
        }
        if (tecla == KeyEvent.VK_D){
            pressionouDireita = true;
        }
        }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'keyReleased'");
        int tecla = e.getKeyCode();

        if (tecla == KeyEvent.VK_W){
            pressionouCima = false;
        }

        if (tecla == KeyEvent.VK_S){
            pressionouBaixo = false;
        }
        if (tecla == KeyEvent.VK_A){
            pressionouEsquerda = false;
        }
        if (tecla == KeyEvent.VK_D){
            pressionouDireita = false;
        }
    }
    
}
