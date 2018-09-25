package vista;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import controlador.controladorPeliculas;

import modelo.Pelicula;

public class MainWindow extends Application {

    private final TableView<Pelicula> table = new TableView<>();

    final HBox hb = new HBox();
    
    @Override
    public void start(Stage stage) {
        Scene scene = new Scene(new Group());
        
        ObservableList<Pelicula> data = controladorPeliculas.cargarDatos();
        
        stage.setTitle("TABLA PELICULAS");
        stage.setWidth(450);
        stage.setHeight(550);
        final Label label = new Label("PELICULAS");
        label.setFont(new Font("Arial", 20));
        
        table.setEditable(true);
        
        TableColumn<Pelicula, String> firstNameCol =
            new TableColumn<>("Titulo");
        firstNameCol.setMinWidth(220);
        firstNameCol.setCellValueFactory(
            new PropertyValueFactory<>("firstName"));
        firstNameCol.setCellFactory(TextFieldTableCell.<Pelicula>forTableColumn());
        firstNameCol.setOnEditCommit((TableColumn.CellEditEvent<Pelicula, String> t) -> {
            ((Pelicula) t.getTableView().getItems().get(
            t.getTablePosition().getRow())
            ).setFirstName(t.getNewValue());
            });
        
        TableColumn<Pelicula, String> lastNameCol =
            new TableColumn<>("Director");
        lastNameCol.setMinWidth(125);
        lastNameCol.setCellValueFactory(
            new PropertyValueFactory<>("lastName"));
        lastNameCol.setCellFactory(TextFieldTableCell.<Pelicula>forTableColumn());
        lastNameCol.setOnEditCommit((TableColumn.CellEditEvent<Pelicula, String> t) -> {
            ((Pelicula) t.getTableView().getItems().get(
            t.getTablePosition().getRow())
            ).setLastName(t.getNewValue());
            });
        
        TableColumn<Pelicula, String> emailCol = new TableColumn<>("Año");
        emailCol.setMinWidth(50);
        emailCol.setCellValueFactory(
        new PropertyValueFactory<>("email"));
        emailCol.setCellFactory(TextFieldTableCell.<Pelicula>forTableColumn());
        emailCol.setOnEditCommit((TableColumn.CellEditEvent<Pelicula, String> t) -> {
                ((Pelicula) t.getTableView().getItems().get(
                t.getTablePosition().getRow())
                ).setEmail(t.getNewValue());
            });
        table.setItems(data);
        table.getColumns().addAll(firstNameCol, lastNameCol, emailCol);
        final TextField addFirstName = new TextField();
        addFirstName.setPromptText("titulo...");
        addFirstName.setMaxWidth(firstNameCol.getPrefWidth());
        final TextField addLastName = new TextField();
        addLastName.setMaxWidth(lastNameCol.getPrefWidth());
        addLastName.setPromptText("director...");
        final TextField addEmail = new TextField();
        addEmail.setMaxWidth(emailCol.getPrefWidth());
        addEmail.setPromptText("año...");
       
        final Button addButton = new Button("Añadir");        
        addButton.setOnAction((ActionEvent e) -> {
            Pelicula p = new Pelicula(
                addFirstName.getText(),
                addLastName.getText(),
                addEmail.getText());
            data.add(p);
            
            addFirstName.clear();
            addLastName.clear();
            addEmail.clear();
        });
        
        final Button removeButton = new Button("Eliminar");        
        removeButton.setOnAction((ActionEvent e) -> {
            Pelicula person = table.getSelectionModel().getSelectedItem();    
            data.remove(person);
        });
        
        hb.getChildren().addAll(addFirstName, addLastName, addEmail, addButton, removeButton);
        hb.setSpacing(3);
        final VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        vbox.getChildren().addAll(label, table, hb);
        ((Group) scene.getRoot()).getChildren().addAll(vbox);
        stage.setScene(scene);
        stage.show();        
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
