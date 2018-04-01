/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JoseSanchez
 * @version 1.0
 * Clase para representar los productos del restaurante a facturar.
 */
public class Product {    
  
    private String name; //nombre del producto  
    private Double cost; //Costo base del producto

    public Product( String name, Double cost) {
       
        this.name = name;
        this.cost = cost;
    }

   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }
 
}