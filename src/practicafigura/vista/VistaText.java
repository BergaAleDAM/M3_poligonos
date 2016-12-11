package practicafigura.vista;

import java.util.Scanner;
import practicafigura.model.Figura;


public class VistaText {

        Scanner lector = new Scanner(System.in);

    public int mostrarMenuInicial() {
        int opcio;

        System.out.println("MENU INICIAL: \n"
                + "1. Crear figura.\n"
                + "2. Veure una figura.\n"
                + "3. Modificar una figura.\n"
                + "4. Sortir");

        do {
            
            System.out.println("Quina opció vols?");

            opcio = lector.nextInt();
 
            
        } while (comprovarOpcio(opcio));

        return opcio;
    }
    
    public int mostrarMenuModificarFigures() {
        int opcio;

        System.out.println("MENÚ: \n"
                + "Quin tipus de figura vols modificar? \n"
                + "1. Cercle.\n"
                + "2. Poligon regular"
                + "3. Rombe.\n"
                + "4. Trapezi.\n"
                );

        do {
            System.out.println("Quina opció vols?");
            if (lector.hasNext()) {
                opcio = 0;
            }
            opcio = lector.nextInt();
        } while (comprovarOpcio(opcio));

        return opcio;
    }

    public boolean comprovarOpcio(int opcio) {
        boolean comprovacio = false;

        if (opcio > 0 && opcio < 5) {
            comprovacio = true;
        }

        return comprovacio;
    }

    public int mostrarMenuCrearFigura() {
        int opcio;

        System.out.println("MENU DE LA FIGURA: \n"
                + "Quin tipus de figura vols crear?\n"
                + "1. Cercle.\n"
                + "2. Poligon regular"
                + "3. Rombe.\n"
                + "4. Trapezi.\n"
                 );

        do {
            System.out.println("Escull una opció adequadament");
            if (lector.hasNext()) {
                opcio = 0;
            }
            opcio = lector.nextInt();
        } while (comprovarOpcio(opcio));

        return opcio;
    }
    
    public int mostrarMenuVeureFigures() {
        int opcio;

        System.out.println("MENÚ: \n"
                + "Quin tipus de figura vols veure? \n"
                + "1. Cercle.\n"
                + "2. Poligon regular"
                + "3. Rombe.\n"
                + "4. Trapezi.\n"
                );

        do {
            System.out.println("Escull una opció adequadament");
            if (lector.hasNext()) {
                opcio = 0;
            }
            opcio = lector.nextInt();
        } while (comprovarOpcio(opcio));

        return opcio;
    }

    public String mostrarCrearNombre() {
        

        System.out.println("Posa-li nom a la nova figura: ");
        String nombre = lector.next();

        return nombre;
    }

    public int mostrarIntroduirNumCostats() {
        int num;

        System.out.println("Introdueix el nombre de costats de la figura: ");
        num = lector.nextInt();

        return num;
    }

    public int mostrarIntroduirMidaCostats() {
        

        System.out.println("Introdueix la mida costats: ");
        int midaCostats = lector.nextInt();

        return midaCostats;
    }
    
    public double mostrarIntroduirRadi() {
        double radi;

        System.out.println("Introdueix el radi del cecle: ");
        radi = lector.nextDouble();

        return radi;
    }

    public double mostrarIntroduirMidaDiagonal(String missatge) {

        System.out.println(missatge);
         double midaDiagonals = lector.nextDouble();

        return midaDiagonals;
    }

    public double mostrarIntroduirBase(String missatge) {

        System.out.println(missatge);
        double midaBase = lector.nextDouble();

        return midaBase;
    }

    public double mostrarIntroduirAltura() {
         

        System.out.println("Introdueix-li altura del trapezi: ");
        double altura = lector.nextDouble();

        return altura;
    }
    
    public String mostrarDemanarNomFiguraModificar() {
        String nom;

        System.out.println("Introdueix el nom de la figura que vols modificar: ");
        nom = lector.next();

        return nom;
    }

    public void mostrarFigures(Figura figures){
        System.out.println(figures);
    }
    
    
}
