public class Cuadrado extends Cuadrilatero implements Forma {
    private final double LADO;
    public void dibujar_puntos(){};
    public void rellenar_forma(){};
    public double calcular_area() {
        return this.LADO * this.LADO;
    };
    public double calcular_perimetro() {
        return this.LADO * 4;
    };

    Cuadrado(Punto p1, Punto p2, Punto p3, Punto p4) {
        setVertices(p1, p2, p3, p4);
        this.LADO = Math.sqrt(Math.pow((p2.getPos_x() - p1.getPos_x()), 2) + Math.pow((p2.getPos_y() - p1.getPos_y()), 2));
    }

}
