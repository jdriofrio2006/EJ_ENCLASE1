public class main {
    public static void main(String[] args) {
        Canciones bachata = new Canciones();

        bachata.setBailable("Si");
        bachata.setSonidos("Agudo");
        bachata.setTipo("romantico");
        bachata.setNombre("Me sobran las palabras");


        System.out.println(bachata.detallecanciones());



        /*Canciones Caracteristicas = new Canciones();
        Caracteristicas.tipo = "romantico";
        Caracteristicas.Bailable = "Si";
        Caracteristicas.Nombre = "Me sobran las palabras";
        Caracteristicas.Sonidos = "Agudos";
        System.out.println(Caracteristicas.detallecanciones());
        */


    }
}