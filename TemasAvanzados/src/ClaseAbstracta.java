/*
* En Java, una clase abstracta es una clase que no puede ser instanciada directamente,
* y está diseñada para ser extendida por otras clases. Puede contener métodos abstractos
* (sin implementación) y también métodos con implementación.
*
* */


public class ClaseAbstracta {
    public static void main(String[] args) {

        //FiguraGeometrica figuraGeometrica = new FiguraGeometrica(); ERROR
        FiguraGeometrica figuraGeometrica = new Rectangulo();
        figuraGeometrica.dibujar();
        figuraGeometrica = new Circulo();
        figuraGeometrica.dibujar();
    }
}

// Clase Abstracta

abstract class FiguraGeometrica{
    public abstract void dibujar(); //metodo abstracto
}

class Rectangulo extends FiguraGeometrica{
    public void dibujar(){
        System.out.println("Se dibuja un rectangulo");
    }
}


class Circulo extends FiguraGeometrica{
    public void dibujar(){
        System.out.println("Se dibuja un circulo");
    }
}