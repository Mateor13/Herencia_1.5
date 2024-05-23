public class FigurasGeometricas {
    String nombre;
    int nLados;
    //Constructor
    public FigurasGeometricas() {
    }
    public FigurasGeometricas(String nombre, int nLados) {
        this.nombre = nombre;
        this.nLados = nLados;
    }

    public int getnLados() {
        return nLados;
    }

    public void setnLados(int nLados) {
        this.nLados = nLados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
