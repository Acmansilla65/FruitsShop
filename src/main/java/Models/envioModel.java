package Models;

public class envioModel {
    private int idEnvio;
    private String nombre;
    private double precioEnvio;

    public envioModel(int idEnvio, String nombre, double precioEnvio) {
        this.idEnvio = idEnvio;
        this.nombre = nombre;
        this.precioEnvio = precioEnvio;
    }

    public int getIdEnvio() {
        return idEnvio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioEnvio() {
        return precioEnvio;
    }
}
