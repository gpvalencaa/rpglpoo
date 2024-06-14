package seres;
import java.util.*;
import progressao.Inventario;
import ambiente.*;

public class Personagem extends Entidade{
    private int moedas;
    //private Item[] item = new Item[11];
    Nivel nivel; 
    Inventario inventario;


    public Personagem(){
        //System.out.println("Digite o nome do personagem: ");
        //super.nome = scaneiaNome();
        nivel = new Nivel();
        this.nivel.setNumeroNivel(1);
        inventario = new Inventario();
        }

    /*public void ataqueUsuario (Entidade atacado, int quantidade){
        Scanner opcao = new Scanner(System.in);
        //System.out.println("Aperte 1 para atacar:");
        int escolha = opcao.nextInt();
        if (escolha == 1){
            super.ataque(atacado, quantidade);
        }
    }*/

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
    
}
