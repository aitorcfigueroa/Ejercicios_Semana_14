public class Rectangulo extends Cuadrilatero implements Forma {
    private final double BASE;
    private final double ALTURA;
    public void dibujar_puntos(){};
    public void rellenar_forma(){};
    public double calcular_area() {
        return this.BASE * this.ALTURA;
    };
    public double calcular_perimetro() {
        return this.BASE * 2 + this.ALTURA * 2;
    };

    Rectangulo(Punto p1, Punto p2, Punto p3, Punto p4) {
        setVertices(p1, p2, p3, p4);
        this.BASE = Math.sqrt(Math.pow((p2.getPos_x() - p1.getPos_x()), 2) + Math.pow((p2.getPos_y() - p1.getPos_y()), 2));
        this.ALTURA = Math.sqrt(Math.pow((p4.getPos_x() - p1.getPos_x()), 2) + Math.pow((p4.getPos_y() - p1.getPos_y()), 2));
    }
}
