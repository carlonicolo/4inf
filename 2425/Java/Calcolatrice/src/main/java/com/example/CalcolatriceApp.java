package com.example;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CalcolatriceApp extends Application {
    private TextField display = new TextField();
    private double primoNumero = 0;
    private String operatore = "";

    @Override
    public void start(Stage primaryStage) {
        display.setEditable(false);
        display.setStyle("-fx-font-size: 18px;");
        GridPane griglia = new GridPane();
        griglia.setPadding(new Insets(10));
        griglia.setVgap(5);
        griglia.setHgap(5);
        griglia.add(display, 0, 0, 4, 1);

        String[] tasti = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "C", "=", "+"
        };

        for (int i = 0; i < tasti.length; i++) {
            String testo = tasti[i];
            Button btn = new Button(testo);
            btn.setPrefSize(50, 50);
            btn.setStyle("-fx-font-size: 16px;");
            btn.setOnAction(e -> gestisciInput(testo));
            griglia.add(btn, i % 4, 1 + i / 4);
        }

        Scene scena = new Scene(griglia);
        primaryStage.setTitle("Calcolatrice JavaFX");
        primaryStage.setScene(scena);
        primaryStage.show();
    }

    private void gestisciInput(String input) {
        switch (input) {
            case "C":
                display.clear();
                primoNumero = 0;
                operatore = "";
                break;
            case "=":
                double secondoNumero = Double.parseDouble(display.getText());
                double risultato = switch (operatore) {
                    case "+" -> primoNumero + secondoNumero;
                    case "-" -> primoNumero - secondoNumero;
                    case "*" -> primoNumero * secondoNumero;
                    case "/" -> secondoNumero != 0 ? primoNumero / secondoNumero : 0;
                    default -> 0;
                };
                display.setText(String.valueOf(risultato));
                operatore = "";
                break;
            case "+", "-", "*", "/":
                primoNumero = Double.parseDouble(display.getText());
                operatore = input;
                display.clear();
                break;
            default:
                display.appendText(input);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
