public class FormateoCadenas {
    public static void main(String[] args) {
        System.out.println("*** Formateo de Cadenas ***");
        
        var nombre = "matias";
        var edad = 25;
        var salario = 21000.20;
        
        // String.format
        
        var mensaje = String.format("Nombre: %s, Edad: %d , Salario: $%.2f", nombre, edad, salario);
        System.out.println("mensaje = " + mensaje);

        // Metodo printf
        System.out.printf("Nombre: %s, Edad: %d , Salario: $%.2f%n",nombre, edad, salario );

        // Formateo con text block
        mensaje = """
                %n Detalle Persona:\s 
                --------------------------
                \tNombre: %s
                \tEdad: %d años
                \tSalaria: $%.2f
                """.formatted(nombre,edad,salario);

        System.out.println("mensaje = " + mensaje);

        //formateo con text block y printf directamente

        System.out.printf("""
                %n Detalle Persona:\\s\s
                                --------------------------
                                \\tNombre: %s
                                \\tEdad: %d años
                                \\tSalaria: $%.2f
                                """,nombre,edad,salario);
    }
}
