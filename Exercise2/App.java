import Explorers.*;
import Planets.*;

public class App {
public static void main(String [] args) {

    Planet jupiter = new Jupiter();
    Planet mars = new Mars();
    Planet mercury = new Mercury();
    Planet neptune = new Neptune();
    Planet saturn = new Saturn();
    Planet venus = new Venus();
    Planet astro = new AstroWorld();
    Explorer jack = new HumanExplorer();
    Explorer Rovergang = new RobotExplorer();

    mars.accept(jack);
    jupiter.accept(jack);
    astro.accept(jack);

    mars.accept(Rovergang);
    saturn.accept(Rovergang);
    jupiter.accept(Rovergang);



}
}