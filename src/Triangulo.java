public class Triangulo extends Trigono implements Forma {
    private final double LADO1;
    private final double LADO2;
    private final double LADO3;
    public void dibujar_puntos(){
        System.out.println("Triangulo puntos");
    };
    public void rellenar_forma(){
        System.out.println("Triangulo relleno");
    };
    public double calcular_area() {
        final double SEMIPERIMETRO = calcular_perimetro()/2;
        return Math.sqrt(SEMIPERIMETRO*(SEMIPERIMETRO-this.LADO1)*(SEMIPERIMETRO-this.LADO2)*(SEMIPERIMETRO-this.LADO3));
    };
    public double calcular_perimetro() {
        return this.LADO1 + this.LADO2 + this.LADO3;
    };

    Triangulo(Punto p1, Punto p2, Punto p3) {
        setVertices(p1, p2, p3);
        this.LADO1 = Math.sqrt(Math.pow((p2.getPos_x() - p1.getPos_x()), 2) + Math.pow((p2.getPos_y() - p1.getPos_y()), 2));
        this.LADO2 = Math.sqrt(Math.pow((p3.getPos_x() - p1.getPos_x()), 2) + Math.pow((p3.getPos_y() - p1.getPos_y()), 2));
        this.LADO3 = Math.sqrt(Math.pow((p3.getPos_x() - p2.getPos_x()), 2) + Math.pow((p3.getPos_y() - p2.getPos_y()), 2));
    }
}
