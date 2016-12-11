package practicafigura.model;

public abstract class Figura {

    protected String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
        @Override
    public String toString() {
        return  (nombre + " : ");
    }


        abstract double calcularArea();
        abstract double calcularPerimetre();
}
