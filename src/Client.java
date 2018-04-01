/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JoseSanchez
 * @version 1.0
 * Clase para representar el cliente del restaurante, con sus campos o atributos basicos.
 */
public class Client {
    
    private Integer cedula; //cedula o codigo del cliente
    private String name; // nombre del cliente   

    public Client(Integer cedula, String name) {
        this.cedula = cedula;
        this.name = name;
       
    }
    
    public Integer getCedula() {
        return cedula;
    }

    public void setCedula(Integer cedula) {
        this.cedula = cedula;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

       
}
