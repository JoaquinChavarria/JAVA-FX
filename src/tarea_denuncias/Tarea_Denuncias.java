package tarea_denuncias;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Tarea_Denuncias extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Expediente de Denuncias");

        // Lugar del Delito
        Label lblCrimeLocation = new Label("Lugar del Delito:");
        TextField txtCrimeLocation = new TextField();

        // Estado del Caso
        Label lblCaseStatus = new Label("Estado del Caso:");
        TextField txtCaseStatus = new TextField();

        // Delitos Cometidos
        Label lblCrime = new Label("Tipo de Delito:");
        TextField txtCrime = new TextField();
        Button btnAddCrime = new Button("Guardar Delito");

        // Denunciantes
        Label lblComplainant = new Label("Nombre del Denunciante:");
        TextField txtComplainant = new TextField();
        Button btnAddComplainant = new Button("Guardar Denunciante");

        // Denunciados
        Label lblAccused = new Label("Nombre del Denunciado:");
        TextField txtAccused = new TextField();
        Button btnAddAccused = new Button("Guardar Denunciado");

        // Descripción del Hecho
        Label lblDescription = new Label("Descripción del Hecho:");
        TextArea txtDescription = new TextArea();

        // Botón de Guardar Denuncia
        Button btnSaveDenuncia = new Button("Guardar Denuncia");
        btnSaveDenuncia.setOnAction(event -> {
            String lugarDelito = txtCrimeLocation.getText();
            String estadoCaso = txtCaseStatus.getText();
            String delitos = txtCrime.getText();
            String denunciantes = txtComplainant.getText();
            String denunciados = txtAccused.getText();
            String descripcion = txtDescription.getText();

            System.out.println("Lugar del Delito: " + lugarDelito);
            System.out.println("Estado del Caso: " + estadoCaso);
            System.out.println("Delitos Cometidos: " + delitos);
            System.out.println("Denunciantes: " + denunciantes);
            System.out.println("Denunciados: " + denunciados);
            System.out.println("Descripción del Hecho: " + descripcion);
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(
                lblCrimeLocation, txtCrimeLocation,
                lblCaseStatus, txtCaseStatus,
                lblCrime, txtCrime, btnAddCrime,
                lblComplainant, txtComplainant, btnAddComplainant,
                lblAccused, txtAccused, btnAddAccused,
                lblDescription, txtDescription,
                btnSaveDenuncia
        );

        Scene scene = new Scene(root, 400, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }}