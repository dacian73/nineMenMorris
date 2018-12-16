/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proiectpiu;

/**
 *
 * @author alex
 */
public class Spatiu {
    
    // Atributele Spatiului
    int adresaX;
    int adresaY;

    public Spatiu(int adresaX, int adresaY) {
        this.adresaX = adresaX;
        this.adresaY = adresaY;
    }

    public int getAdresaX() {
        return adresaX;
    }

    public int getAdresaY() {
        return adresaY;
    }

    public void setAdresaX(int adresaX) {
        this.adresaX = adresaX;
    }

    public void setAdresaY(int adresaY) {
        this.adresaY = adresaY;
    }
    
}
