public interface Traductor {
    // public y abstract
    void traducir();
    // metodos con implementacion
    default void  iniciarTraductor(){
        System.out.println("Iniciando traductor ...");
    }
}

class Ingles implements Traductor{
    public void traducir(){
        System.out.println("Traduzco a Ingles");
    }
}

class Frances implements Traductor{
    public void traducir(){
        System.out.println("Traduzco a Frances");
    }
}

class PruebaTraductor{
    public static void main(String[] args) {
        Traductor ingles = new Ingles();

        ingles.iniciarTraductor();
        ingles.traducir();

        Traductor frances = new Frances();
        frances.traducir();
        frances.iniciarTraductor();
    }
}
