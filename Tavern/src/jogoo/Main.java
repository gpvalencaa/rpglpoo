package jogoo;

//import java.awt.Menu;

public class Main {
    private Container frame;
    private Personagem guerreiro;
    private Oponente monstro;
    public void main(String[] args) {

        //frame = new Container();
        
        guerreiro = new Personagem();
        monstro = new Oponente("Monstro");
        while (guerreiro.getVida() > 0 &&  monstro.getVida() > 0 ){
            guerreiro.ataqueUsuario(monstro, 50 );
            System.out.println("A vida do monstro é: " + monstro.getVida());

            monstro.ataque(guerreiro, 25);
            System.out.println("O monstro atacou! Sua vida é: " + guerreiro.getVida());


        }




        
        
        
    }
}
