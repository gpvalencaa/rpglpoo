package jogoo;

import javax.swing.JFrame;
//import javax.swing.JLabel;

public class Container extends JFrame{
    //private JLabel nomeJogo;

    public Container (){
        add(new Menu()); 
        setTitle("Tavern");
        setSize(getMaximumSize());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        this.setResizable(true);
        setVisible(true); 
        
        //nomeJogo = new JLabel("TAVERN");     

    }

    
    
}

