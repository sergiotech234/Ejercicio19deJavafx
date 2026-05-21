package org.example;

// Importación de clases necesarias de JavaFX
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

// Clase principal que hereda de Application
public class Main extends Application {

    // Método que inicia la interfaz gráfica
    @Override
    public void start(Stage primaryStage) {

        // Crear botón de la ventana principal
        Button btnAbrir =
                new Button(
                    "Abrir ventana secundaria"
                );

        // Evento del botón:
        // llama al método privado que abrirá
        // una nueva ventana
        btnAbrir.setOnAction(
                e -> abrirVentanaSecundaria()
        );

        // Crear VBox con separación de 20 píxeles
        VBox root = new VBox(20);

        // Añadir el botón al contenedor
        root.getChildren().add(btnAbrir);

        // Crear escena principal
        Scene scene =
                new Scene(root, 400, 250);

        // Configurar ventana principal
        primaryStage.setTitle(
                "Ventana principal"
        );

        primaryStage.setScene(scene);

        // Mostrar ventana principal
        primaryStage.show();
    }

    // Método privado para crear y abrir
    // una segunda ventana
    private void abrirVentanaSecundaria() {

        // Crear una nueva ventana
        Stage ventana2 = new Stage();

        // Etiqueta que aparecerá en la ventana
        Label mensaje =
                new Label(
                    "¡Esta es la ventana secundaria!"
                );

        // Crear VBox con separación
        VBox layout = new VBox(15);

        // Añadir etiqueta
        layout.getChildren().add(mensaje);

        // Crear escena secundaria
        Scene escena2 =
                new Scene(layout, 300, 150);

        // Configurar ventana secundaria
        ventana2.setTitle(
                "Ventana secundaria"
        );

        ventana2.setScene(escena2);

        // Mostrar segunda ventana
        ventana2.show();
    }

    // Método principal que inicia aplicación
    public static void main(String[] args) {
        launch(args);
    }
}
