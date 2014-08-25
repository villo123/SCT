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

public class AutotableUsuarioCAT  extends Application{
	 private final TableView table = new TableView();
	    public static void main(String[] args) {
	        launch(args);
	    }
	 
	    @Override
	    public void start(Stage stage) {
	        Scene scene = new Scene(new Group());
	        stage.setTitle("Atendió UTIC");
	        stage.setWidth(900);
	        stage.setHeight(500);
	 
	        final Label label = new Label("Secretaría de Comunicaciones y Transportes");
	        label.setFont(new Font("Arial", 20));
	 
	        table.setEditable(false);
	 
	        TableColumn identificacion = new TableColumn("ID");
	        TableColumn nombre = new TableColumn("Nombre");
	        TableColumn apellidop = new TableColumn("Apellido Paterno");
	        TableColumn apellidom = new TableColumn("Apellido Materno");
	        TableColumn departamento = new TableColumn("Departamento");
	        TableColumn mail = new TableColumn("E-mail");
	        TableColumn cisco = new TableColumn("Cisco");
	        
	        table.getColumns().addAll(identificacion, nombre, apellidop, apellidom, departamento,mail,cisco);
	 
	        final VBox vbox = new VBox();
	        vbox.setSpacing(5);
	        vbox.setPadding(new Insets(10, 0, 0, 10));
	        vbox.getChildren().addAll(label, table);
	 
	        ((Group) scene.getRoot()).getChildren().addAll(vbox);
	 
	        stage.setScene(scene);
	        stage.show();
	    }
}