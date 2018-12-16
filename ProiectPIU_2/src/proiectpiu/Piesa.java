package proiectpiu;


import proiectpiu.Spatiu;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alex
 */
public class Piesa extends Spatiu{

    // Atributele Oportunitatii
    int pericolMoara;
    int impiedicaMoara;

    // Constructor
    public Piesa(int adresaX, int adresaY, int pericolMoara, int impiedicaMoara) {
        super (adresaX , adresaY);
        this.pericolMoara = pericolMoara;
        this.impiedicaMoara = impiedicaMoara;
    }

    public int getValoarePiesa() {
        int scor = pericolMoara * 6 + impiedicaMoara * 4;
        return scor;
    }

    // Functii getter

    public int getPericolMoara() {
        return pericolMoara;
    }

    public int getImpiedicaMoara() {
        return impiedicaMoara;
    }

    // Functii setter

    public void setPericolMoara(int creazaMoara) {
        this.pericolMoara = creazaMoara;
    }

    public void setImpiedicaMoara(int impiedicaMoara) {
        this.impiedicaMoara = impiedicaMoara;
    }

}
