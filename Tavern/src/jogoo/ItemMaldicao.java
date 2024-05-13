package jogoo;

public class ItemMaldicao extends Item{
    public ItemMaldicao (){
        super("Maldição");
    }
    
    public void tiraVida(Entidade amaldicoada){
        amaldicoada.alteraVida(-25);
    }


    
}
