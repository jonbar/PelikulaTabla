package controlador;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import modelo.Pelicula;

public class controladorPeliculas {

    public static ObservableList<Pelicula> cargarDatos(){
        
        return FXCollections.observableArrayList(
            new Pelicula("El señor de los anillos", "Peter Jackson", "2000"),
            new Pelicula("Drive", "Nicolas Winding Refn", "2011"),
            new Pelicula("Mad Max", "George Miller", "2015"),
            new Pelicula("El viaje de chihiro", "Hayao Miyazaki", "2001"),
            new Pelicula("El club de la lucha", "David Fincher", "1999")
        );
    }     
}
