public class Elipse
{
    double semi_eje_mayor;
    double semi_eje_menor;

    public Elipse()
    {
        super();
    }

    public Elipse(String nombre, int numero_lados, boolean regularidad, double semi_eje_mayor, double semi_eje_menor)
    {
        this.semi_eje_mayor = semi_eje_mayor;
        this.semi_eje_menor = semi_eje_menor;
    }

    public double getSemi_eje_mayor()
    {
        return semi_eje_mayor;
    }

    public void setSemi_eje_mayor(double semi_eje_mayor)
    {
        this.semi_eje_mayor = semi_eje_mayor;
    }

    public double getSemi_eje_menor()
    {
        return semi_eje_menor;
    }

    public void setSemi_eje_menor(double semi_eje_menor)
    {
        this.semi_eje_menor = semi_eje_menor;
    }

    // Metodos personaizados

    public double calcularPermitero()
    {
        return (double) Math.round(Math.PI*(getSemi_eje_mayor()+getSemi_eje_menor()));
    }

    public double calcularArea()
    {
        return (double) Math.round(Math.PI*getSemi_eje_mayor()*getSemi_eje_menor());
    }
}
