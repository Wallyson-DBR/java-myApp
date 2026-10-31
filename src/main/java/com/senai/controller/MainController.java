package com.senai.controller;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class MainController {

    private int numClick = 0;
    private static final int MAX_LABELS = 10;

    @FXML
    private VBox containerLabels;

    @FXML
    protected void onBtnClick() {
        numClick++;

        Label novoLabel = new Label("Linha de código " + numClick + " [ATIVADA]");

        ObservableList<Node> filhos = containerLabels.getChildren();

        if (filhos.size() >= MAX_LABELS) {
            filhos.remove(0);
        }

        filhos.add(novoLabel);
    }
}