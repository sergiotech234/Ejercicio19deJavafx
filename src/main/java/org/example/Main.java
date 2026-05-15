package org.example;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {

        // Botón de la ventana principal
        Button btnAbrir = new Button("Abrir ventana secundaria");

        // Llamar al método privado
        btnAbrir.setOnAction(e -> abrirVentanaSecundaria());

        VBox root = new VBox(20);
        root.getChildren().add(btnAbrir);

        Scene scene = new Scene(root, 400, 250);

        primaryStage.setTitle("Ventana principal");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Método privado para abrir la segunda ventana
    private void abrirVentanaSecundaria() {

        Stage ventana2 = new Stage();

        Label mensaje = new Label("¡Esta es la ventana secundaria!");

        VBox layout = new VBox(15);
        layout.getChildren().add(mensaje);

        Scene escena2 = new Scene(layout, 300, 150);

        ventana2.setTitle("Ventana secundaria");
        ventana2.setScene(escena2);

        ventana2.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}