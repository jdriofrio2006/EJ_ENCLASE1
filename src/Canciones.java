
public class Canciones {
    //atributos
    String tipo;
    String Bailable;
    String Nombre;
    String Sonidos;

    public String getBailable() {
        return Bailable;
    }

    public void setBailable(String bailable) {
        this.Bailable = bailable;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public String getSonidos() {
        return Sonidos;
    }

    public void setSonidos(String sonidos) {
        this.Sonidos = sonidos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    //metodos
    public String detallecanciones() {

        System.out.println("El sonido es :  " + getSonidos());
        System.out.println("Es bailable?        = " + getBailable());
        System.out.println("Nombre de la cancion= " + getNombre());
        System.out.println("Tipo de Sonidos     =" + getTipo());

        return "";


    }
}