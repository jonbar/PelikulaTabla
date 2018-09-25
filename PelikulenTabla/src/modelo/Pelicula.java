/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author aitor
 */

public class Pelicula {
        
    private final SimpleStringProperty titulo;
    private final SimpleStringProperty director;
    private final SimpleStringProperty anio;
    
    public Pelicula(String fName, String lName, String email) { //derrigortuta nago, ezta? public jartzera beste pakete batetik sortuko dudalako?
        this.titulo = new SimpleStringProperty(fName);
        this.director = new SimpleStringProperty(lName);
        this.anio = new SimpleStringProperty(email);
    }
    public String getFirstName() {
        return titulo.get();
    }
    public void setFirstName(String fName) {
        titulo.set(fName);
    }
    public String getLastName() {
        return director.get();
    }
    public void setLastName(String fName) {
        director.set(fName);
    }
    public String getEmail() {
        return anio.get();
    }
    public void setEmail(String fName) {
        anio.set(fName);
    }
}