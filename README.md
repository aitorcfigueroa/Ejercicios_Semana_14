# Ejercicios Semana 14

Vamos a crear un motor de formas geométricas y las “dibujaremos”. Para
ello vamos a crear la clase “Punto”, que contiene dos atributos públicos,
“pos_x” y “pos_y”, de tipo entero ambos. Será un objeto que utilizaremos
para hacer los cálculos.

## Ejercicio 1
Crea la interfaz “Forma”. Tendrá las funciones:
- “dibujar_puntos”: no recibe ni devuelve nada.
- “rellenar_forma”: no recibe ni devuelve nada.
- “calcular_area”: no recibe nada, devuelve un valor “double”.
- “calcular_perimetro”: no recibe nada, devuelve un valor “double”.

## Ejercicio 2
  Crea la clase abstracta “Cuadrilatero”. Tendrá los atributos:
- private Punto [] vertices = new Punto[4]

Y las funciones:
- public int[] getVertices (){ return this.vertices}
- public void setPuntos(Punto [] vertices){ this.vertices = vertices}
- public void setVertices(Punto p1, Punto p2, Punto p3, Punto p4){
  //asigna cada punto a un índice del array}

## Ejercicio 3
Crea la clase “Cuadrado”. Debe heredar de “Cuadrilatero” e implementar
“Forma”. Crea los métodos y atributos necesarios para que no haya errores
de implementación. Añade el cuerpo necesario a cada uno. Por ejemplo,
en “calculo_area”, muestra por consola el área del cuadrado (lado x lado)
> Pista: Puedes crear un atributo “lado” que se calcule en el constructor una
vez pasados los puntos (la distancia entre un punto y otro es el lado y se
calcula tal que 𝐷𝑖𝑠𝑡𝑎𝑛𝑐𝑖𝑎(𝑝1, 𝑝2) = \sqrt{(𝑥2 − 𝑥1)^2 + (𝑦2 − 𝑦1)^2}

## Ejercicio 4
Crea la clase “Rectángulo”. Al igual que la anterior, heredará de
“Cuadrilatero” e implementará “Forma”. Añade lo necesario para que
funcione correctamente las 4 funciones de la interfaz “Forma”, al igual que
con el “Cuadrado”

## Ejercicio 5
Crea la clase abstracta “Trigono”. Sigue la estructura de la clase
“Cuadrilatero”, pero con los atributos y funciones adecuadas (3 puntos en
vez de 4, por ejemplo)

## Ejercicio 6
Al igual que con el “Cuadrado” o el “Rectangulo”, crea una clase
“Triangulo” que herede de “Trigono” e implemente forma.

## Ejercicio 7
Comprueba, en la clase main, método main, que puedes hacer un array con
todas las formas creadas (Cuadrado, Rectangulo y Triangulo) y llamar a los
métodos comunes de la interfaz.

## Ejercicio 8
Este ejercicio no es para entregar, solo para darle unas vueltas a un
problema real:
- Teniendo en cuenta que los círculos o circunferencias son formas
  geométricas singulares, pues su “lado” se compone de infinitos puntos
  sobre el plano (o espacio en caso de una esfera). ¿Cómo se podría
  traducir en programación? ¿Se os ocurre alguna manera de discretizar
  (transformar los valores a un conjunto finito de valores) la cantidad de
  puntos necesarios para una circunferencia y que se pueda dibujar en
  un ordenador?