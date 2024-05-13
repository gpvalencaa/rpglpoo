package jogoo;
import java.util.*;

public class Personagem extends Entidade{
    int contadorItem;
    public Personagem(){

        super.nome = scaneiaNome();
        super.setVida(500);
        super.setPontosPoder(500);

    }

    public void ataqueUsuario (Entidade atacado, int quantidade){
        Scanner opcao = new Scanner(System.in);
        int escolha = opcao.nextInt();
        if (escolha == 1){
            super.ataque(atacado, quantidade);
        }
    }

    public String scaneiaNome (){
        Scanner lernome = new Scanner(System.in);
        String nomePersonagem = new String (lernome.nextLine());
        return nomePersonagem;
    }
    public int getContadorItem(){
        return contadorItem;
    }




    

    

    
}
