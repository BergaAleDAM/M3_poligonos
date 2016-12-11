package practicafigura.model;


 public class Cercle extends Figura {

    final double pi = 3.14;
     double radi;
    

    public Cercle(String nombre, double radi) {
        super(nombre);
        this.radi = radi;
    }

    
    public double getRadi(){
        return this.radi;
    }
    
    public void setRadi(double radi) {
        this.radi = radi;
    }

      @Override
    double calcularArea() {
          return (pi * Math.pow(radi, 2));
    }

    @Override
    double calcularPerimetre() {
        return (2 *  pi * radi);
    }  
    
    

    @Override
    public String toString() {
        return "nom= " + nombre +  "radi= " + radi + ", area= " + calcularArea();
    }

 
    
    
}
