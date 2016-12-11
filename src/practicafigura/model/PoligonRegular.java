package practicafigura.model;


 public class PoligonRegular extends Poligono {

    double midaCostats;
    int costats;

    public PoligonRegular(String nombre, int costats, double midaCostats) {
        super(nombre);
        this.costats = costats;
        this.midaCostats = midaCostats;
    }

    public double getMidaCostats() {
        return this.midaCostats;
    }

    public void setMidaCostats(double mida) {
        this.midaCostats = mida;
    }

    @Override
    double calcularArea() {
     double area = ( (costats * midaCostats * (midaCostats / (2 * (Math.tan(Math.toRadians((360 / costats) /2)))))) /2 );
        
     return area;
    }

    @Override
    double calcularPerimetre() {
        return costats * midaCostats;
    }

    @Override
    public String toString() {
        return "Nom: " + this.nombre + ", midaCostats= " + midaCostats + ", costats= " + costats + ", area= " + calcularArea()
                + '}';
    }



}
