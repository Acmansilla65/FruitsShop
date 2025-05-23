package Models;

public class frutasModel {
    private int idFruta;
    private String nombre;
    private double precioUnidad;

    public frutasModel(int idFruta, String nombre, double precioUnidad) {
        this.idFruta = idFruta;
        this.nombre = nombre;
        this.precioUnidad = precioUnidad;
    }

    public int getIdFruta() {
        return idFruta;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioUnidad() {
        return precioUnidad;
    }
}
