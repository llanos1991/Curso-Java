package animales;

/*
* EJEMPLO DE HERENCIA DE CLASE - SUBCLASE
*
* */

// clase animal
public class Animal {
    protected void comer(){
        System.out.println("Como muchas veces al dia");
    }

    protected void dormir(){
        System.out.println("Duermo muchas horas");
    }
}

// sub-clase perro
class Perro extends Animal{
    public void  hacerSonido(){
        System.out.println("Puedo ladrar ...");
    }

    //sobre escritura de metodo
    @Override
    protected void dormir(){
        System.out.println("Duermo 15 horas al dia");
        System.out.println("Metodo de la calse padre : ");
        super.dormir(); //acceso al metodo de la clase padre
    }

}


class PruebaAnimal{
    public static void main(String[] args) {
        System.out.println(" *** Ejemplo de Herencia *** ");
        System.out.println("Clase padre soy un animal");
        var animal1 = new Animal();
        animal1.comer();
        animal1.dormir();

        System.out.println("\nClase hija soy un perro");
        var perro1 = new Perro();
        perro1.dormir();
        perro1.comer();
        perro1.hacerSonido();
    }
}
