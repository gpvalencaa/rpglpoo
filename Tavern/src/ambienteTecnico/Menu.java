package ambienteTecnico;

import java.awt.Graphics;
import java.awt.Image;

import java.awt.Graphics2D;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;






public class Menu extends JPanel  {
    private Image fundoMenu;
    private JButton botaoJogar;
    private JLabel nomeJogo;
    private ImageIcon logoJogo;
    

    public Menu (){
        ImageIcon referencia = new ImageIcon("tavern\\res\\backgrey.jpg");
        fundoMenu = referencia.getImage();
        setLayout(null);
        botaoJogar = new JButton("Jogar");
        

        botaoJogar.setBounds(650, 300, 150, 75);

        
        
        
        add(botaoJogar);
        logoJogo = new ImageIcon("tavern\res\tavernlogo.png");
        
        


    }

    public void paint(Graphics g){
        Graphics2D graficos = (Graphics2D) g;
        graficos.drawImage (fundoMenu, 0, 0, null);
        g.dispose();

    }

    
    
}
