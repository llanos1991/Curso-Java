package polimorfismo;

/*
* EJEMPLO DE POLIMORFISMO
*
* */

// clase animal
public class Animal {
    protected void hacerSonido(){
        System.out.println("El animal hace un sonido");
    }
}

// sub-clase perro
class Perro extends Animal{
    @Override
    public void  hacerSonido(){
        System.out.println(" El perro hace WAUF");
    }

}

// sub-clase perro
class Gato extends Animal{
    @Override
    public void  hacerSonido(){
        System.out.println(" El gato hace MIAU");
    }

}


class PruebaAnimal{

    //METODO POLIMORFICO
    static void imprimirSonido(Animal animal){
        animal.hacerSonido();
    }
    /// //////////////////////
    ///
    public static void main(String[] args) {
        //objeto de la clase padre
//        var animal = new Animal();
//        imprimirSonido(animal);
//        var animal = new Perro();
//        imprimirSonido(animal);
        var animal = new Gato();
        imprimirSonido(animal);
    }
}
