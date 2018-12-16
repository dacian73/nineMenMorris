/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proiectpiu;
import javafx.scene.paint.Color;
/**
 *
 * @author alex
 */
public class Pozitie {
   // Atributele pozitiei
    boolean posibil;
    boolean moara;
    Color culoare;
    boolean ocupat;
    
    // Constructor
    public Pozitie(boolean posibil, boolean moara, boolean ocupat, Color culoare){
        this.culoare = culoare;
        this.moara = moara;
        this.ocupat = ocupat;
        this.posibil = posibil;
}

    // Functii setter
    public void setPosibil(boolean posibil) {
        this.posibil = posibil;
    }

    public void setMoara(boolean moara) {
        this.moara = moara;
    }

    public void setCuloare(Color culoare) {
        this.culoare = culoare;
    }

    public void setOcupat(boolean ocupat) {
        this.ocupat = ocupat;
    }

    // Functii getter
    public boolean isPosibil() {
        return posibil;
    }

    public boolean isMoara() {
        return moara;
    }

    public Color getCuloare() {
        return culoare;
    }

    public boolean isOcupat() {
        return ocupat;
    }
    
}
