/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor.mazo;

import javafx.scene.layout.StackPane;

/**
 *
 * @author josue
 */
public class PersonalStackPane extends StackPane{

    public int colorCarta;
    public int jugador;
    public PersonalStackPane(int color, int jugador) {
        super();
        colorCarta = color;
        this.jugador = jugador;
        setWidth(62);
        setHeight(85);
    }
    
    
}
