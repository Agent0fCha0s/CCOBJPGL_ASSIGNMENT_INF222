package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;

import model.*;

public class Drinkscontroller {
@FXML
 Button btn1,btn2,btn3,btn4,btn5;

    esprezzo esprezzo = new esprezzo();
    Mogu mogu = new Mogu();
    Pepsi pepsi = new Pepsi();
    Water water = new Water();
    WHiskey whiskey = new WHiskey();

    public void initialize(){

        esprezzo.setDrink("Espresso");
        esprezzo.setCharacter("helps me start my day");

        mogu.setDrink("Mogu Mogu");
        mogu.setCharacter("My num 1 refreshener ");

        pepsi.setDrink("Pepsi");
        pepsi.setCharacter("my favorite softdrink ");

        water.setDrink("Water");
        water.setCharacter("The greatest way to hydrate!");

        whiskey.setDrink("Jameson");
        whiskey.setCharacter("Whiskey is the way!");
    }

    public void showInfo(ActionEvent event){

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(btn1)){
            alert.setContentText("My favorite coffee is an " + esprezzo.getDrink()+" and it " + esprezzo.getCharacter());
        }
        if (sourceButton.equals(btn2)){
            alert.setContentText("If I want a drink and if there's a 7/11 nearby, my go to drink is " + mogu.getDrink()+" " + esprezzo.getCharacter());
         
        }
        if (sourceButton.equals(btn3)){
        alert.setContentText("If i need a softdrink I'll buy a  " + pepsi.getDrink()+" " + pepsi.getCharacter());
        }
        if (sourceButton.equals(btn4)){
        alert.setContentText("My Favorite out of all the drinks is " + water.getDrink()+" " + water.getCharacter());
        }
        if (sourceButton.equals(btn5)){
        alert.setContentText("I don't drink alchohol unless its " + whiskey.getDrink()+" " + whiskey.getCharacter());
        }

        alert.showAndWait();

}
}