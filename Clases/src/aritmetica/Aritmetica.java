package aritmetica; // nombre del paquete

public class Aritmetica {

    //atributos
    private int operando1;
    private int operando2;

    //metodo constructor vacio
    public Aritmetica(){}

    //metodo constructor con argumentos
    public Aritmetica(int operando1, int operando2) {
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    //metodos

    public void sumar(){
        var resultado = operando1 + operando2;
        System.out.println("Resultado de suma = " + resultado);
    }

    public void restar(){
        var resultado = operando1 - operando2;
        System.out.println("Resultado de resta = " + resultado);
    }

    //metodos getter y setter
    public int getOperando1() {
        return operando1;
    }

    public void setOperando1(int operando1) {
        this.operando1 = operando1;
    }

    public int getOperando2() {
        return operando2;
    }

    public void setOperando2(int operando2) {
        this.operando2 = operando2;
    }
}


