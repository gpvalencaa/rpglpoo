package seres;
import java.util.*;

public class Personagem extends Entidade{
    int moedas;
    int contadorItem;

    public Personagem(){
        //System.out.println("Digite o nome do personagem: ");
        super.nome = scaneiaNome();
        }

    public void ataqueUsuario (Entidade atacado, int quantidade){
        Scanner opcao = new Scanner(System.in);
        //System.out.println("Aperte 1 para atacar:");
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

    public int getMoedas () {
        return this.moedas;
    }

    public void alteraMoedas (int quantidade) {
        moedas = moedas + quantidade;

    }




    

    

    
}
