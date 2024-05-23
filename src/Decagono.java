public class Decagono extends FigurasGeometricas{
    Double lado, apotema;
    public Decagono(){
        super("", 10);
    }

    public Decagono(String nombre, int nLados, Double apotema, Double lado) {
        super(nombre, nLados);
        this.lado = lado;
        this.apotema = apotema;
    }

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
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