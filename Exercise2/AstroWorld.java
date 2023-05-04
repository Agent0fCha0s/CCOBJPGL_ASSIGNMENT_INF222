package Planets;

import Explorers.Explorer;

public class AstroWorld implements Planet{

    public void accept(Explorer explorer){
        explorer.visit(this);
    }
    
}
