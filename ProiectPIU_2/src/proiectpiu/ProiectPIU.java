/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proiectpiu;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


/**
 *
 * @author alex
 */
public class ProiectPIU extends Application {
    
    public static Color culoareJucator;
    public static Color culoareCalculator;
    public static Color culoareGol;
    
    @Override
    public void start(Stage stage) throws Exception {
        culoareGol = javafx.scene.paint.Color.GREEN;
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument2.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
