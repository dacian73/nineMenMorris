/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proiectpiu;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author alex
 */
public class FXMLDocumentController2 implements Initializable {

    @FXML
    private AnchorPane rootAnchorPane;
    @FXML
    private Label label;
    @FXML
    private Button start;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void loadGame(ActionEvent event) throws IOException {
        ProiectPIU.culoareJucator = javafx.scene.paint.Color.WHITE;
        ProiectPIU.culoareCalculator = javafx.scene.paint.Color.BLACK;
        AnchorPane pane = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        rootAnchorPane.getChildren().setAll(pane);
    }
    
        @FXML
    private void loadGameNegru(ActionEvent event) throws IOException {
        ProiectPIU.culoareJucator = javafx.scene.paint.Color.BLACK;
        ProiectPIU.culoareCalculator = javafx.scene.paint.Color.WHITE;
        AnchorPane pane = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        rootAnchorPane.getChildren().setAll(pane);
    }
    
}
