/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JoseSanchez
 * @version 1.0
 * Clase para representar las mesas del restaurante con su nombre y numero de sillas.
 */
public class Table {
    
    private String name; //nombre de la mesa
    private int numberChairs; // numero de sillas de la mesa

    public Table(String name, int numberChairs) {
        this.name = name;
        this.numberChairs = numberChairs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberChairs() {
        return numberChairs;
    }

    public void setNumberChairs(int numberChairs) {
        this.numberChairs = numberChairs;
    }
    
}
