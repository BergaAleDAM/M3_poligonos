package practicafigura.model;

public class Rombe extends PoligonNoRegular {

    double  diagonal, diagonalPeque;
    
    public Rombe(String nombre, double diagonal,double diagonalpeque) {
        super(nombre);
        this.diagonal = diagonal;
        this.diagonalPeque = diagonalPeque;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public double getDiagonalPeque() {
        return diagonalPeque;
    }

    public void setDiagonalPeque(double diagonalpeque) {
        this.diagonalPeque = diagonalpeque;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }


    @Override
    public double calcularPerimetre() {
       return Math.sqrt((diagonal*diagonal)+(diagonalPeque*diagonalPeque))*4;
    }
    
    @Override
    public double calcularArea(){

        return (diagonal * diagonalPeque) / 2;
    }

        @Override
    public String toString() {
        return "Nom: " + this.nombre + ", mida Diagonal Gran= " + diagonal + ", mida Diagonal petita= "+ diagonalPeque+ "area= " + calcularArea();
    }
    
    
    
    
}
