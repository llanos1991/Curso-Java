package persona;

public class Persona {
    private String nombre ;
    private String apellido;

    public Persona(){
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
