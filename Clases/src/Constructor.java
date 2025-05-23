public class Constructor {

    //atributos
    int operando1;
    int operando2;

    // Al tener un cosntructor vacio y otro con argumentos se llama sobrecarga de constructores.

    //metodo cosntructor vacio
    public Constructor(){}

    // metodo constructor con argumentos

    public Constructor(int operando1, int operando2){
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    //metodos

    void sumar(){
        var resultado = this.operando1 + this.operando2;
        System.out.println("Resultado de suma = " + resultado);
    }

    void restar(){
        var resultado = this.operando1 - this.operando2;
        System.out.println("Resultado de resta = " + resultado);
    }

    public static void main(String[] args) {

        System.out.println(" *** Ejemplo aritmetica *** ");
        var aritmetica1 = new Constructor(8,10);
        aritmetica1.sumar();
        aritmetica1.restar();

        var aritmetica2 = new Constructor();
        aritmetica2.sumar();
        aritmetica2.restar();

    }
}


