package persona;

public class Persona {

    static int contadorPersonas = 0; //contexto estatico

    private int idPersona;
    private String nombre ;
    private String apellido;

    public Persona(){
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        // Incrementar el atributo estatico
        //Persona.contadorPersonas++;
        // le asignamos el Id unico con la variable estatica
        this.idPersona =++Persona.contadorPersonas;
    }

    @Override
    public String toString(){
        return "Id: " + this.idPersona + " ,Nombre: " + this.nombre + " ,Apellido: " + this.apellido;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    void mostrarPersona(){
        System.out.println("Nombre :" + this.nombre);
        System.out.println("Apellido :" + this.apellido);
    }


}
