public class Dodecagono extends FigurasGeometricas{
    Double lado, apotema;
    public Dodecagono(){
        super("", 12);
    }

    public Dodecagono(String nombre, int nLados, Double apotema, Double lado) {
        super(nombre, nLados);
        this.lado = lado;
        this.apotema = apotema;
    }
    public Dodecagono(String nombre, int nLados){

    }

    public Double getLado() {
        return lado;
    }

    public void setLado1(Double lado) {
        this.lado = lado;
    }

    public Double getApotema() {
        return apotema;
    }

    public void setApotema(Double apotema) {
        this.apotema = apotema;
    }
    public double calcularArea(){
        return (nLados*lado*apotema)/2;
    }
    public double calcularPerimetro(){
        return nLados*apotema;
    }
}
