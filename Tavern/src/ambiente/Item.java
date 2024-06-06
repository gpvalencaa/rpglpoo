package ambiente;

public class Item {
    private String nomeItem;

    public Item (String nome){
        nomeItem = nome;
    }

    public String getNome(){
        return this.nomeItem;
    }
}
