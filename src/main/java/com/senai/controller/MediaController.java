package com.senai.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MediaController {

    @FXML
    TextField campoNum1;

    @FXML
    TextField campoNum2;

    @FXML
    Button btnCalcular;

    @FXML
    Label lblResultado;

    @FXML
    void calcularMedia(){

        double num1 = Double.parseDouble(campoNum1.getText());
        double num2 = Double.parseDouble(campoNum2.getText());

        double media = (num1 + num2) / 2;

        lblResultado.setText("Resultado: " + media);

    }

}
