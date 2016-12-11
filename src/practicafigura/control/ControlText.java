package practicafigura.control;

import java.util.ArrayList;
import practicafigura.model.Cercle;
import practicafigura.model.Figura;
import practicafigura.model.PoligonRegular;
import practicafigura.model.Rombe;
import practicafigura.model.Trapezi;
import practicafigura.vista.VistaText;

public class ControlText {

    VistaText vista = new VistaText();

    public ArrayList<Figura> Figures = new ArrayList<>();

    public void menuInicial() {
        do {

            int opcio = vista.mostrarMenuInicial();

            switch (opcio) {
                case 1:
                    crearFigura();
                    break;

                case 2:
                    mostrarFigura();
                    break;

                case 3:
                    modificarFigura();
                    break;

                case 4:
                    System.exit(0);
                    break;
            }
        } while (true);
    }

    public void crearFigura() {

        int opcio = vista.mostrarMenuCrearFigura();
        MenuCrear(opcio);

    }

    public void mostrarFigura() {

        int opcio = vista.mostrarMenuVeureFigures();
        MenuVeureFigures(opcio);
    }

    public void modificarFigura() {

        MenuModificar();

    }

    public void MenuCrear(int opcio) {

        switch (opcio) {
            case 1:

                String nomCercle = vista.mostrarCrearNombre();
                double radi = vista.mostrarIntroduirRadi();

                Figures.add(new Cercle(nomCercle, radi));

                break;

            case 2:

                String nomPoligonRegular = vista.mostrarCrearNombre();

                int numCostatsPoligonRegular = vista.mostrarIntroduirNumCostats();

                double midaCostatsPoligonRegular = vista.mostrarIntroduirMidaCostats();

                Figures.add(new PoligonRegular(nomPoligonRegular, numCostatsPoligonRegular, midaCostatsPoligonRegular));

                break;

            case 3:

                String nomRombe = vista.mostrarCrearNombre();

                String missatgeDiagonal1 = "Introdueix la mida de la diagonal major.";
                double diagonal = vista.mostrarIntroduirMidaDiagonal(missatgeDiagonal1);
                
                String missatgeDiagonal2 = "Introdueix la mida de la diagonal menor.";
                double diagonalPeque = vista.mostrarIntroduirMidaDiagonal(missatgeDiagonal2);

                Figures.add(new Rombe(nomRombe, diagonal, diagonalPeque));

                break;

            case 4:

                String nomTrapezi = vista.mostrarCrearNombre();

                String missatgeBase1 = "Introdueix la mida de la base major.";
                
                double baseMajor = vista.mostrarIntroduirBase(missatgeBase1);
                
                String missatgeBase2 = "Introdueix la mida de la base menor.";

                double baseMenor = vista.mostrarIntroduirBase(missatgeBase2);

                double altura = vista.mostrarIntroduirAltura();

                Figures.add(new Trapezi(nomTrapezi, baseMajor, baseMenor, altura));

                break;

        }

    }

    public void MenuVeureFigures(int opcio) {

        switch (opcio) {

            case 1:
                for (Figura f : Figures) {
                    if (f instanceof Cercle) {
                        System.out.println(f.toString());
                    }
                }
                break;
            case 2:
                for (Figura f : Figures) {
                    if (f instanceof PoligonRegular) {
                        System.out.println(f.toString());
                    }
                }
                break;
            case 3:
                for (Figura f : Figures) {
                    if (f instanceof Rombe) {
                        System.out.println(f.toString());
                    }
                }

                break;

            case 4:
                for (Figura f : Figures) {
                    if (f instanceof Trapezi) {
                        System.out.println(f.toString());
                    }
                }

                break;


        }
    }

    public void MenuModificar() {
        
        String nom;
        int opcio;
        

        opcio = vista.mostrarMenuModificarFigures();
        nom = vista.mostrarDemanarNomFiguraModificar();

        switch (opcio) {

            case 1:
                buscarCercleModificar(nom);
                break;

            case 2:
                regularModificar(nom);
                break;
            case 3:
                rombeModificar(nom);
                break;
    
            case 4:
                trapeziModificar(nom);
                break;

        }
    }


    public void buscarCercleModificar(String nom) {

        Cercle c;
        for (Figura j : Figures) {
            if ((j instanceof Cercle) && ((Cercle) j).getNombre().equals(nom)) {
                c = (Cercle) j;
                c.setRadi(vista.mostrarIntroduirRadi());
            }

        }
    }



    public void regularModificar(String nom) {

        PoligonRegular regular;
        for (Figura j : Figures) {
            if ((j instanceof PoligonRegular) && ((PoligonRegular) j).getNombre().equals(nom)) {
                regular = (PoligonRegular) j;

                regular.setMidaCostats(vista.mostrarIntroduirMidaCostats());
            }

        }
    }
    
    
    public void rombeModificar(String nom) {

        String diagonal = "Introdueix la mida de la diagonal major.";
        String diagonalpeque = "Introdueix la mida de la diagonal menor.";

        Rombe r;
        for (Figura j : Figures) {
            if ((((Rombe) j).getNombre().equals(nom) && j instanceof Rombe) ) {
                r = (Rombe) j;

                r.setDiagonal(vista.mostrarIntroduirMidaDiagonal(diagonal));
                r.setDiagonalPeque(vista.mostrarIntroduirMidaDiagonal(diagonalpeque));
            }

        }
    }


    public void trapeziModificar(String nom) {

        String baseMajor = "Introdueix la mdia de la base Major.";
        String baseMenor = "Introdueix la mida de la base Menor.";

        Trapezi t;
        for (Figura f : Figures) {
            if (((Trapezi) f).getNombre().equals(nom) &&(f instanceof Trapezi)  ) {
                t = (Trapezi) f;

                t.setBaseMajor(vista.mostrarIntroduirBase(baseMajor));
                t.setBaseMenor(vista.mostrarIntroduirBase(baseMenor));
                t.setAltura(vista.mostrarIntroduirAltura());
            }

        }
    }
    
}
