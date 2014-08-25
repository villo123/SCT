package com.sct.incidencias.tabla;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class AutotableCatinc extends Application{
	 private final TableView table = new TableView();
	    public static void main(String[] args) {
	        launch(args);
	    }
	 
	    @Override
	    public void start(Stage stage) {
	        Scene scene = new Scene(new Group());
	        stage.setTitle("Atendi� UTIC");
	        stage.setWidth(900);
	        stage.setHeight(500);
	 
	        final Label label = new Label("Secretar�a de Comunicaciones y Transportes");
	        label.setFont(new Font("Arial", 20));
	 
	        table.setEditable(false);
	 
	        TableColumn folio = new TableColumn("Folio");
	        TableColumn tipoin = new TableColumn("Tipo incidencias");
	        
	        table.getColumns().addAll(folio, tipoin);
	 
	        final VBox vbox = new VBox();
	        vbox.setSpacing(5);
	        vbox.setPadding(new Insets(10, 0, 0, 10));
	        vbox.getChildren().addAll(label, table);
	 
	        ((Group) scene.getRoot()).getChildren().addAll(vbox);
	 
	        stage.setScene(scene);
	        stage.show();
	    }
}

