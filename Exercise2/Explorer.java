package Explorers; 
import Planets.Mars;
import Planets.Venus;
import Planets.Mercury;
import Planets.Saturn;
import Planets.Jupiter;
import Planets.Planet;
import Planets.Neptune;


public interface Explorer {

    void visit (Mercury mercury); 

    void visit (Mars mars);

    void visit(Venus venus);

    void visit(Saturn saturn);

    void visit(Jupiter jupiter);

    void visit(Neptune neptune);

    default void visit(Planet planet){

        System.out.println(" Landed on an unknown world... ");

    }
    
}
