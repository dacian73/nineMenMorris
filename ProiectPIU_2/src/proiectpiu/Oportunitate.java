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
public class Oportunitate extends Spatiu{

    // Atributele Oportunitatii
    int creazaMoara;
    int impiedicaMoara;
    int posibilitatiViitoareDeMoara;

    // Constructor
    public Oportunitate(int adresaX, int adresaY, int creazaMoara, int impiedicaMoara, int posibilitatiViitoareDeMoara) {
        super (adresaX , adresaY);
        this.creazaMoara = creazaMoara;
        this.impiedicaMoara = impiedicaMoara;
        if (adresaX == adresaY) {
        ++posibilitatiViitoareDeMoara;
        }
        this.posibilitatiViitoareDeMoara = posibilitatiViitoareDeMoara;
    }

    public int getValoareOportunitate() {
        int scor = creazaMoara * 6 + impiedicaMoara * 4 + posibilitatiViitoareDeMoara;
        return scor;
    }

    // Functii getter

    public int getCreazaMoara() {
        return creazaMoara;
    }

    public int getImpiedicaMoara() {
        return impiedicaMoara;
    }

    public int getPosibilitatiViitoareDeMoara() {
        return posibilitatiViitoareDeMoara;
    }

    // Functii setter

    public void setCreazaMoara(int creazaMoara) {
        this.creazaMoara = creazaMoara;
    }

    public void setImpiedicaMoara(int impiedicaMoara) {
        this.impiedicaMoara = impiedicaMoara;
    }

    public void setPosibilitatiViitoareDeMoara(int posibilitatiViitoareDeMoara) {
        this.posibilitatiViitoareDeMoara = posibilitatiViitoareDeMoara;
    }

}
