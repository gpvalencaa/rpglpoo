package ambiente;

import seres.Entidade;

public class ItemCura extends Item{
    public ItemCura(){
        super("Cura");
    }

    public void curaEntidade (Entidade curada){
        curada.alteraVida(50);
    }

    
}
