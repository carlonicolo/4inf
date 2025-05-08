package Lab72JavaFX;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Calcolatrice extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Campi di input
        TextField numero1 = new TextField();
        numero1.setPromptText("Inserisci il primo numero");
        TextField numero2 = new TextField();
        numero2.setPromptText("Inserisci il secondo numero");

        // Pulsante per eseguire la somma
        Button sommaBtn = new Button("Somma");

        // Etichetta per mostrare il risultato
        Label risultato = new Label("Risultato: ");

        // Azione al clic del pulsante
        sommaBtn.setOnAction(e -> {
            try {
                double n1 = Double.parseDouble(numero1.getText());
                double n2 = Double.parseDouble(numero2.getText());
                double somma = n1 + n2;
                risultato.setText("Risultato: " + somma);
            } catch (NumberFormatException ex) {
                risultato.setText("Inserisci numeri validi.");
            }
        });

        // Layout verticale
        VBox layout = new VBox(10, numero1, numero2, sommaBtn, risultato);
        layout.setPadding(new javafx.geometry.Insets(10));

        // Impostazione della scena
        Scene scene = new Scene(layout, 300, 200);
        primaryStage.setTitle("Calcolatrice JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
