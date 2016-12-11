package practicafigura.model;


public class Trapezi extends PoligonNoRegular{
    double baseMajor, baseMenor, altura, diagonal;
    int nombreCostats = 4;
    
    public Trapezi(String nom, double baseMajor, double baseMenor, double altura) {
        super(nom);
        this.baseMajor = baseMajor;
        this.baseMenor = baseMenor;
        this.altura = altura;
        this.nombreCostats = nombreCostats;
    }

    public void setBaseMajor(double baseMajor) {
        this.baseMajor = baseMajor;
    }

    public void setBaseMenor(double baseMenor) {
        this.baseMenor = baseMenor;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    
    
    double calculHipotenusa(){
        double cateto = baseMajor-baseMenor /2;
        return Math.sqrt((cateto*cateto )+ (altura*altura)) ;
    }
    
       @Override
    double calcularPerimetre() {
        return baseMajor + baseMenor + calculHipotenusa()*2;
    }
    
     @Override
    double calcularArea() {
        return (( (baseMajor + baseMenor) /2) * altura);
    }   

    @Override
    public String toString() {
        return "Trapezi{" + "baseMajor=" + baseMajor + ", baseMenor=" + baseMenor + ", altura=" + altura + ", diagonal=" + diagonal + ", nombreCostats=" + nombreCostats + '}';
    }

    
    
}
