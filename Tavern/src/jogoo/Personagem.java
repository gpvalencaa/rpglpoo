package jogoo;
import java.util.*;

public class Personagem extends Entidade{
    int contadorItem;
    public Personagem(){
        System.out.println("Digite o nome do personagem: ");
        super.nome = scaneiaNome();
        super.setVida(500);
        super.setPontosPoder(500);

    }

    public void ataqueUsuario (Entidade atacado, int quantidade){
        Scanner opcao = new Scanner(System.in);
        System.out.println("Aperte 1 para atacar:");
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
