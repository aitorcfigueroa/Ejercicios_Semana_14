public class Main {
    public static void main(String[] args) {
        Forma[] figuras = {
                new Cuadrado(new Punto(0,0), new Punto(0,1), new Punto(1,0), new Punto(1,1)),
                new Rectangulo(new Punto(0,0), new Punto(0, 1), new Punto(2,1), new Punto(2,0)),
                new Triangulo(new Punto(0,0), new Punto(1, 2), new Punto(2,0))
        };

        //Cuadrado
        figuras[0].dibujar_puntos();
        figuras[0].rellenar_forma();
        System.out.println(figuras[0].calcular_area());
        System.out.println(figuras[0].calcular_perimetro());

        //Rectangulo
        figuras[1].dibujar_puntos();
        figuras[1].rellenar_forma();
        System.out.println(figuras[1].calcular_area());
        System.out.println(figuras[1].calcular_perimetro());

        //Triangulo
        figuras[2].dibujar_puntos();
        figuras[2].rellenar_forma();
        System.out.println(figuras[2].calcular_area());
        System.out.println(figuras[2].calcular_perimetro());
    }
}
