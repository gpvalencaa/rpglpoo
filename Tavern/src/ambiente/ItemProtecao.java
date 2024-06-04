package ambiente;
import seres.*;

public class ItemProtecao extends Item{
    public ItemProtecao(){
        super("Escudo");
    }
    
    public void aplicaEscudo(Entidade afetada){
       afetada.setVida(afetada.getVida()); 
    }
}
