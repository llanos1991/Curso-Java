public class GeneradorDeEmail {
    public static void main(String[] args) {
        System.out.println("*** Generador de Email ***");
        /* Nombre de usuario */
        var nombreUsuario = "Ubaldo Acosta Soto";
        System.out.println("nombreUsuario = " + nombreUsuario);

        var nombreNormalizado = nombreUsuario.replace(" ",".").toLowerCase();
        
        System.out.println("nombre usuario normalizado = " + nombreNormalizado);

        /*
        var nombre = nombreUsuario.substring(0,6);
        var apellido1 = nombreUsuario.substring(7,13);
        var apellido2 = nombreUsuario.substring(14);

        var nombreNormalizado = new StringBuilder();
        nombreNormalizado.append(nombre);
        nombreNormalizado.append(".");
        nombreNormalizado.append(apellido1);
        nombreNormalizado.append(".");
        nombreNormalizado.append(apellido2);

        System.out.println("Nombre usuario normalizado = " + nombreNormalizado.toString().toLowerCase());
        */

        /* nombre de empresa */
        var nombreEmpresa = "Global Mentoring";
        System.out.println("nombreUsuario = " + nombreEmpresa);
        
        
        /*
        var global = nombreEmpresa.substring(0,6);
        var mentoring = nombreEmpresa.substring(7);
        */
        
        /* extension del dominio */
        var dominio = ".com.mx";
        System.out.println("dominio = " + dominio);

        var dominioEmailNormalizado = nombreEmpresa.replace(" ",".").toLowerCase() + dominio;
        System.out.println("dominio de Email Normalizado = " + dominioEmailNormalizado);
        /*
        var dominioEmailNormalizado = new StringBuilder();
        dominioEmailNormalizado.append("@");
        dominioEmailNormalizado.append(global);
        dominioEmailNormalizado.append(mentoring);
        dominioEmailNormalizado.append(dominio);
        */
        
        //System.out.println("Dominio email normalizado = " + dominioEmailNormalizado.toString().toLowerCase());

        //System.out.println("email final generado : " + "\t" + nombreNormalizado.toString().toLowerCase() + dominioEmailNormalizado.toString().toLowerCase() );
        System.out.println("email final generado: \t" + nombreNormalizado + "@"+ dominioEmailNormalizado);
    }
}
