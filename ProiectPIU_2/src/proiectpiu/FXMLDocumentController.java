/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proiectpiu;


import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;

/**
 *
 * @author alex
 */
public class FXMLDocumentController implements Initializable {

    int pieseJucator = 9;
    int pieseCalculator = 9;
    Pozitie[][] matrice;
    int moaraJucator = 0;

    @FXML
    private Text text1;
    @FXML
    private Text text2;
    @FXML
    private Circle cerc1;
    @FXML
    private Circle cerc2;
    @FXML
    private Circle cerc3;
    @FXML
    private Circle cerc4;
    @FXML
    private Circle cerc5;
    @FXML
    private Circle cerc6;
    @FXML
    private Circle cerc7;
    @FXML
    private Circle cerc8;
    @FXML
    private Circle cerc9;
    @FXML
    private Circle cerc10;
    @FXML
    private Circle cerc11;
    @FXML
    private Circle cerc12;
    @FXML
    private Circle cerc13;
    @FXML
    private Circle cerc14;
    @FXML
    private Circle cerc15;
    @FXML
    private Circle cerc16;
    @FXML
    private Circle cerc17;
    @FXML
    private Circle cerc18;
    @FXML
    private Circle cerc19;
    @FXML
    private Circle cerc20;
    @FXML
    private Circle cerc21;
    @FXML
    private Circle cerc22;
    @FXML
    private Circle cerc23;
    @FXML
    private Circle cerc24;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");

        text1.setText("Hello World! This is a new game of nine mens' morris or whats it called. It's a game of pure reason that will give you a hard time.");

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        // Creare matrice cu pozitii
        matrice = new Pozitie[8][8];
        Pozitie pozitieImposibila = new Pozitie(false, false, true, null);
        // Initializare pozitii imposibile
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                matrice[i][j] = pozitieImposibila;
            }
        }
        // initializare pozitii goale
        Pozitie pozitieGoala = new Pozitie(true, false, false, ProiectPIU.culoareGol);
        matrice[0][0] = pozitieGoala;
        matrice[0][3] = pozitieGoala;
        matrice[0][7] = pozitieGoala;
        matrice[1][1] = pozitieGoala;
        matrice[1][3] = pozitieGoala;
        matrice[1][6] = pozitieGoala;
        matrice[2][2] = pozitieGoala;
        matrice[2][3] = pozitieGoala;
        matrice[2][5] = pozitieGoala;
        matrice[3][0] = pozitieGoala;
        matrice[3][1] = pozitieGoala;
        matrice[3][2] = pozitieGoala;
        matrice[4][5] = pozitieGoala;
        matrice[4][6] = pozitieGoala;
        matrice[4][7] = pozitieGoala;
        matrice[5][2] = pozitieGoala;
        matrice[5][4] = pozitieGoala;
        matrice[5][5] = pozitieGoala;
        matrice[6][1] = pozitieGoala;
        matrice[6][4] = pozitieGoala;
        matrice[6][6] = pozitieGoala;
        matrice[7][0] = pozitieGoala;
        matrice[7][4] = pozitieGoala;
        matrice[7][7] = pozitieGoala;

        if (ProiectPIU.culoareCalculator == javafx.scene.paint.Color.WHITE) {
            randulCalculatorului();
        }
    }

    @FXML
    private void handleButtonAction1(MouseEvent event) {
        butonApasat(0, 0);
    }

    @FXML
    private void handleButtonAction2(MouseEvent event) {
        butonApasat(0, 3);
    }

    @FXML
    private void handleButtonAction3(MouseEvent event) {
        butonApasat(0, 7);
    }

    @FXML
    private void handleButtonAction4(MouseEvent event) {
        butonApasat(1, 1);
    }

    @FXML
    private void handleButtonAction5(MouseEvent event) {
        butonApasat(1, 3);
    }

    @FXML
    private void handleButtonAction6(MouseEvent event) {
        butonApasat(1, 6);
    }

    @FXML
    private void handleButtonAction7(MouseEvent event) {
        butonApasat(2, 2);
    }

    @FXML
    private void handleButtonAction8(MouseEvent event) {
        butonApasat(2, 3);
    }

    @FXML
    private void handleButtonAction9(MouseEvent event) {
        butonApasat(2, 5);
    }

    @FXML
    private void handleButtonAction10(MouseEvent event) {
        butonApasat(3, 0);
    }

    @FXML
    private void handleButtonAction11(MouseEvent event) {
        butonApasat(3, 1);
    }

    @FXML
    private void handleButtonAction12(MouseEvent event) {
        butonApasat(3, 2);
    }

    @FXML
    private void handleButtonAction13(MouseEvent event) {
        butonApasat(4, 5);
    }

    @FXML
    private void handleButtonAction14(MouseEvent event) {
        butonApasat(4, 6);
    }

    @FXML
    private void handleButtonAction15(MouseEvent event) {
        butonApasat(4, 7);
    }

    @FXML
    private void handleButtonAction16(MouseEvent event) {
        butonApasat(5, 2);
    }

    @FXML
    private void handleButtonAction17(MouseEvent event) {
        butonApasat(5, 4);
    }

    @FXML
    private void handleButtonAction18(MouseEvent event) {
        butonApasat(5, 5);
    }

    @FXML
    private void handleButtonAction19(MouseEvent event2) {
        butonApasat(6, 1);
    }

    @FXML
    private void handleButtonAction20(MouseEvent event2) {
        butonApasat(6, 4);
    }

    @FXML
    private void handleButtonAction21(MouseEvent event2) {
        butonApasat(6, 6);
    }

    @FXML
    private void handleButtonAction22(MouseEvent event) {
        butonApasat(7, 0);
    }

    @FXML
    private void handleButtonAction23(MouseEvent event) {
        butonApasat(7, 4);
    }

    @FXML
    private void handleButtonAction24(MouseEvent event) {
        butonApasat(7, 7);
    }

    private int verificaMoara(int pozitieMutareX, int pozitieMutareY, Color culoare, boolean test) {
        int moara = 0;
        int piesePeLinie = 0;

        for (int i = 0; i < 8; i++) {
            if (matrice[pozitieMutareX][i].getCuloare() == culoare) {
                ++piesePeLinie;
            }
        }
        if (piesePeLinie == 3) {
            ++moara;
            if (!test) {
                if (culoare == ProiectPIU.culoareCalculator) {text2.setText(text2.getText() + "/nMoara orizontala!");}
                for (int i = 0; i < 8; i++) {
                    if (matrice[pozitieMutareX][i].getCuloare() == culoare) {
                        matrice[pozitieMutareX][i].setMoara(true);
                    }
                }
                matrice[pozitieMutareX][pozitieMutareY].setCuloare(culoare);
                matrice[pozitieMutareX][pozitieMutareY].setOcupat(true);
                matrice[pozitieMutareX][pozitieMutareY].setMoara(true);
            }
        }
        piesePeLinie = 0;
        for (int i = 0; i < 8; i++) {
            if (matrice[i][pozitieMutareY].getCuloare() == culoare) {
                ++piesePeLinie;
            }
        }
        if (piesePeLinie == 3) {
            ++moara;
            if (!test) {
                if (culoare == ProiectPIU.culoareCalculator) {text2.setText(text2.getText() + "/nMoara verticala!");}
                for (int i = 0; i < 8; i++) {
                    if (matrice[i][pozitieMutareX].getCuloare() == culoare) {
                        matrice[i][pozitieMutareX].setMoara(true);
                    }
                }
                matrice[pozitieMutareX][pozitieMutareY].setCuloare(culoare);
                matrice[pozitieMutareX][pozitieMutareY].setOcupat(true);
                matrice[pozitieMutareX][pozitieMutareY].setMoara(true);
            }
        }

        return moara;
    }

    private void randulCalculatorului() {
        if (pieseCalculator > 0) {
            ArrayList<Oportunitate> oportunitati = cautareOportunitati();
            int x, y;
            x = oportunitati.get(oportunitati.size() - 1).getAdresaX();
            y = oportunitati.get(oportunitati.size() - 1).getAdresaY();
            mutareCalculator(x, y);
            pieseCalculator -= 1;
        } else {
            // TODO Mutare piese
        }
    }

    private void mutareCalculator(int x, int y) {
        Pozitie pozitieDeMutat = new Pozitie(true, false, true, ProiectPIU.culoareCalculator);
        matrice[x][y] = pozitieDeMutat;
        int pieseDeLuat = 0;
        x = verificaMoara(x, y, ProiectPIU.culoareCalculator, false);
        if (x > 0) {
            iaPiese(x);
        }
        draw();
    }

    private void draw() {
        cerc1.setFill(matrice[0][0].getCuloare());
        cerc2.setFill(matrice[0][3].getCuloare());
        cerc3.setFill(matrice[0][7].getCuloare());
        cerc4.setFill(matrice[1][1].getCuloare());
        cerc5.setFill(matrice[1][3].getCuloare());
        cerc6.setFill(matrice[1][6].getCuloare());
        cerc7.setFill(matrice[2][2].getCuloare());
        cerc8.setFill(matrice[2][3].getCuloare());
        cerc9.setFill(matrice[2][5].getCuloare());
        cerc10.setFill(matrice[3][0].getCuloare());
        cerc11.setFill(matrice[3][1].getCuloare());
        cerc12.setFill(matrice[3][2].getCuloare());
        cerc13.setFill(matrice[4][5].getCuloare());
        cerc14.setFill(matrice[4][6].getCuloare());
        cerc15.setFill(matrice[4][7].getCuloare());
        cerc16.setFill(matrice[5][2].getCuloare());
        cerc17.setFill(matrice[5][4].getCuloare());
        cerc18.setFill(matrice[5][5].getCuloare());
        cerc19.setFill(matrice[6][1].getCuloare());
        cerc20.setFill(matrice[6][4].getCuloare());
        cerc21.setFill(matrice[6][6].getCuloare());
        cerc22.setFill(matrice[7][0].getCuloare());
        cerc23.setFill(matrice[7][4].getCuloare());
        cerc24.setFill(matrice[7][7].getCuloare());

    }

    // Creaza un vector cu obiecte Oportunitate
    private ArrayList cautareOportunitati() {
        Pozitie pozitieDeMutat = new Pozitie(true, false, true, ProiectPIU.culoareCalculator);
        ArrayList<Oportunitate> oportunitati = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (!matrice[i][j].isOcupat()) {
                    Oportunitate x = new Oportunitate(i, j, 0, 0, 0);
                    x.setCreazaMoara(testMutare(i, j, pozitieDeMutat));
                    x.setImpiedicaMoara(testMutare(i, j, new Pozitie(true, false, true, ProiectPIU.culoareJucator)));
                    // TODO calculare sanse creare moara pe viitor
                    x.setPosibilitatiViitoareDeMoara(posibilitatiViitoareDeMoara(i, j, ProiectPIU.culoareCalculator));
                    oportunitati.add(x);
                }
            }
        }
        oportunitati = sortareOportunitati(oportunitati);
        return oportunitati;
    }

    // Testeaza daca o mutare pe pozitia X.Y. creaza Moara sau Moara dubla
    private int testMutare(int x, int y, Pozitie pozitieDeMutat) {
        Pozitie pozitieInitiala = matrice[x][y];
        matrice[x][y] = pozitieDeMutat;
        int rezultat = verificaMoara(x, y, pozitieDeMutat.getCuloare(), true);
        matrice[x][y] = pozitieInitiala;
        return rezultat;
    }

    // Bubble sort pentru ArrayList-ul de oportunitati
    private ArrayList<Oportunitate> sortareOportunitati(ArrayList<Oportunitate> oportunitati) {
        int lungime = oportunitati.size();
        Oportunitate x;
        for (int i = 0; i < lungime - 1; i++) {
            for (int j = 0; j < (lungime - i - 1); j++) {
                if (oportunitati.get(j).getValoareOportunitate() > oportunitati.get(j + 1).getValoareOportunitate()) {
                    x = oportunitati.get(j);
                    oportunitati.set(j, oportunitati.get(j + 1));
                    oportunitati.set(j + 1, x);
                }
            }
        }
        text2.setText(text2.getText() + "\nNumarul Oportunitatilor Calculate este de " + lungime + ".\n");
        return oportunitati;
    }

    private int posibilitatiViitoareDeMoara(int x, int y, Color culoare) {
        int rezultat = 0;
        if (x == y) {
            rezultat++;
            switch (x) {
                case 0:
                    if (matrice[7][7].getCuloare() == culoare) {
                        rezultat++;
                    }
                    if (matrice[0][7].getCuloare() == culoare) {
                        rezultat++;
                    }
                    if (matrice[7][0].getCuloare() == culoare) {
                        rezultat++;
                    }
                    return rezultat;
                case 1:
                    if (matrice[6][6].getCuloare() == culoare) {
                        rezultat++;
                    }
                    if (matrice[6][1].getCuloare() == culoare) {
                        rezultat++;
                    }
                    if (matrice[1][6].getCuloare() == culoare) {
                        rezultat++;
                    }
                    return rezultat;
                case 2:
                    if (matrice[5][5].getCuloare() == culoare) {
                        rezultat++;
                    }
                    if (matrice[5][2].getCuloare() == culoare) {
                        rezultat++;
                    }
                    if (matrice[2][5].getCuloare() == culoare) {
                        rezultat++;
                    }
                    return rezultat;
                case 5:
                    if (matrice[2][2].getCuloare() == culoare) {
                        rezultat++;
                    }
                    if (matrice[2][5].getCuloare() == culoare) {
                        rezultat++;
                    }
                    if (matrice[5][2].getCuloare() == culoare) {
                        rezultat++;
                    }
                    return rezultat;
                case 6:
                    if (matrice[1][1].getCuloare() == culoare) {
                        rezultat++;
                    }
                    if (matrice[1][6].getCuloare() == culoare) {
                        rezultat++;
                    }
                    if (matrice[6][1].getCuloare() == culoare) {
                        rezultat++;
                    }
                    return rezultat;
                case 7:
                    if (matrice[0][0].getCuloare() == culoare) {
                        rezultat++;
                    }
                    if (matrice[7][0].getCuloare() == culoare) {
                        rezultat++;
                    }
                    if (matrice[0][7].getCuloare() == culoare) {
                        rezultat++;
                    }
                    return rezultat;
            }
        }
        if ((x == 7) && (y == 0)) {
            rezultat++;
            if (matrice[0][7].getCuloare() == culoare) {
                rezultat++;
            }
            if (matrice[0][0].getCuloare() == culoare) {
                rezultat++;
            }
            if (matrice[7][7].getCuloare() == culoare) {
                rezultat++;
            }
            return rezultat;
        }
        if ((x == 6) && (y == 1)) {
            rezultat++;
            if (matrice[1][6].getCuloare() == culoare) {
                rezultat++;
            }
            if (matrice[1][1].getCuloare() == culoare) {
                rezultat++;
            }
            if (matrice[6][6].getCuloare() == culoare) {
                rezultat++;
            }
            return rezultat;
        }
        if ((x == 5) && (y == 2)) {
            rezultat++;
            if (matrice[2][5].getCuloare() == culoare) {
                rezultat++;
            }
            if (matrice[2][2].getCuloare() == culoare) {
                rezultat++;
            }
            if (matrice[5][5].getCuloare() == culoare) {
                rezultat++;
            }
            return rezultat;
        }
        if ((x == 2) && (y == 5)) {
            rezultat++;
            if (matrice[5][2].getCuloare() == culoare) {
                rezultat++;
            }
            if (matrice[5][5].getCuloare() == culoare) {
                rezultat++;
            }
            if (matrice[2][2].getCuloare() == culoare) {
                rezultat++;
            }
            return rezultat;
        }
        if ((x == 1) && (y == 6)) {
            rezultat++;
            if (matrice[6][1].getCuloare() == culoare) {
                rezultat++;
            }
            if (matrice[1][1].getCuloare() == culoare) {
                rezultat++;
            }
            if (matrice[6][6].getCuloare() == culoare) {
                rezultat++;
            }
            return rezultat;
        }
        if ((x == 0) && (y == 7)) {
            rezultat++;
            if (matrice[7][0].getCuloare() == culoare) {
                rezultat++;
            }
            if (matrice[7][7].getCuloare() == culoare) {
                rezultat++;
            }
            if (matrice[0][0].getCuloare() == culoare) {
                rezultat++;
            }
            return rezultat;
        }

        return 0;
    }

    private void iaPiese(int nr) {
        // ArrayList<Oportunitate> 
        while (nr > 0) {
            ArrayList<Piesa> piese = new ArrayList<>();
            piese = cautaPieseAdversareDeLuat();
            // Ia piesa cu cea mai mare valoare
            int x = piese.get(piese.size() - 1).adresaX;
            int y = piese.get(piese.size() - 1).adresaY;
            iaPiesa(x, y);
            nr--;
        }
    }

    private ArrayList<Piesa> cautaPieseAdversareDeLuat() {
        ArrayList<Piesa> rezultat = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((matrice[i][j].getCuloare() == ProiectPIU.culoareJucator) && !(matrice[i][j].isMoara())) {
                    Piesa piesaJucator = new Piesa(i, j, calculeazaPericolMoara(i, j), calculeazaImpiedicareMoara(i, j));
                    rezultat.add(piesaJucator);
                }
            }
        }
        rezultat = sortarePieseDeLuat(rezultat);
        return rezultat;
    }

    private int calculeazaPericolMoara(int x, int y) {
        int pericol = 0;
        int pericolOrizontala = 0;
        int pericolVerticala = 0;
        for (int i = 0; i < 8; i++) {
            if (matrice[x][i].getCuloare() == ProiectPIU.culoareJucator) {
                pericolOrizontala++;
            }
        }
        for (int i = 0; i < 8; i++) {
            if (matrice[i][y].getCuloare() == ProiectPIU.culoareJucator) {
                pericolVerticala++;
            }
        }
        pericol = pericolVerticala + pericolOrizontala;
        if ((pericolVerticala == 2) || (pericolOrizontala == 2)) {
            pericol += 2;
        }
        return pericol;
    }

    private int calculeazaImpiedicareMoara(int x, int y) {
        int moara;
        int moaraOrizontala = 0;
        int moaraVerticala = 0;
        for (int i = 0; i < 8; i++) {
            if (matrice[x][i].getCuloare() == ProiectPIU.culoareCalculator) {
                moaraOrizontala++;
            }
        }
        for (int i = 0; i < 8; i++) {
            if (matrice[i][y].getCuloare() == ProiectPIU.culoareCalculator) {
                moaraVerticala++;
            }
        }
        moara = moaraVerticala + moaraOrizontala;
        if ((moaraVerticala == 2) || (moaraOrizontala == 2)) {
            moara += 2;
        }
        return moara;
    }

    // Bubble sort pentru ArrayList-ul de piese care pot fi luate
    private ArrayList<Piesa> sortarePieseDeLuat(ArrayList<Piesa> piese) {
        int lungime = piese.size();
        Piesa x;
        if (lungime < 1) {
            return piese;
        }
        for (int i = 0; i < lungime - 1; i++) {
            for (int j = 0; j < (lungime - i - 1); j++) {
                if (piese.get(j).getValoarePiesa() > piese.get(j + 1).getValoarePiesa()) {
                    x = piese.get(j);
                    piese.set(j, piese.get(j + 1));
                    piese.set(j + 1, x);
                }
            }
        }
        text2.setText(text2.getText() + "/nS-au analizat " + lungime + " posibile piese de luat.");
        return piese;
    }

    private void iaPiesa(int x, int y) {
        matrice[x][y].setCuloare(ProiectPIU.culoareGol);
        matrice[x][y].setMoara(false);
        matrice[x][y].setOcupat(false);
    }

    private void butonApasat(int x, int y) {
        if (moaraJucator == 0) {
            if (pieseJucator > 0) {
                if (!matrice[x][y].isOcupat()) {
                    Pozitie pozitieDeMutat = new Pozitie(true, false, true, ProiectPIU.culoareJucator);
                    matrice[x][y] = pozitieDeMutat;
                    pieseJucator -= 1;
                    draw();
                    moaraJucator = verificaMoara(x, y, ProiectPIU.culoareJucator, false);
                }
                if (moaraJucator == 0) {
                    randulCalculatorului();
                }
            }
        } else {
            // Ia piesa
            if ((matrice[x][y].getCuloare() == ProiectPIU.culoareCalculator) && (!matrice[x][y].isMoara())) {
                iaPiesa(x, y);
                moaraJucator--;
                randulCalculatorului();
            }

        }

    }
}
