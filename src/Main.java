//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FigurasGeometricas miFigura = new FigurasGeometricas();
        Endecagono miEndecagono = new Endecagono();
        /*Circulos miFigura2 = new Circulos();
        Triangulos miFigura3 = new Triangulos();
        Cuadrilateros miFigura4 = new Cuadrilateros();

        Circulos miFigura5 = new Circulos(3.00);
        Triangulos miFigura6 = new Triangulos(6.00, 8.00);
        Cuadrilateros miFigura7 = new Cuadrilateros(5.00, 5.00);
        Cuadrilateros miFigura8 = new Cuadrilateros(5.00, 10.00);

        miFigura2.setNombre("Pileta del CEC");
        System.out.println(miFigura2.getNombre());
        miFigura2.setRadio(4.00);
        System.out.print("La nueva pileta tendrá un radio de: "+miFigura2.getRadio());
        System.out.println("Y su área será: "+ miFigura2.calcularArea());

        miFigura3.setNombre("Arbol de navidad");
        System.out.println(miFigura3.getNombre());
        miFigura3.setAltura(10.5);
        System.out.print("El árbol tendra una altura de: "+miFigura3.getAltura() + "\n");
        miFigura3.setBase(5.00);
        System.out.print("El árbol tendra una base de: "+miFigura3.getBase()+ "\n");
        System.out.println("Y su área será: "+ miFigura3.calcularArea());

        miFigura4.setNombre("Laboratorio ESFOT");
        System.out.println(miFigura4.getNombre());
        miFigura4.setAncho(13.0);
        System.out.print("El laboratorio tendrá un lado de: "+miFigura4.getAncho()+ " m\n");
        miFigura4.setLargo(5.00);
        System.out.print("El laboratorio tendrá un lado de: "+miFigura4.getLargo()+" m\n");
        System.out.println("Y su área será: "+ miFigura4.calcularArea());

        miFigura5.setNombre("Aro de basket");
        System.out.println(miFigura5.getNombre());
        System.out.println("El aro tendrá un radio de: "+ miFigura5.getRadio());
        System.out.println("Y su área será: "+ miFigura5.calcularArea());

        miFigura6.setNombre("Cono de helado");
        System.out.println(miFigura6.getNombre());
        System.out.println("El cono tendrá una altura de: "+ miFigura6.getAltura());
        System.out.println("El cono tendrá una base de: "+ miFigura6.getBase());
        System.out.println("Y su área será: "+ miFigura6.calcularArea());

        miFigura7.setNombre("Cancha de volley");
        System.out.println(miFigura7.getNombre());
        System.out.print("El laboratorio tendrá un lado de: "+miFigura8.getAncho()+ " m\n");
        System.out.print("El laboratorio tendrá un lado de: "+miFigura8.getLargo()+" m\n");
        System.out.println("Y su área será: "+ miFigura8.calcularArea());

        miFigura8.setNombre("Cancha de futbol");
        System.out.println(miFigura8.getNombre());
        System.out.print("El laboratorio tendrá un lado de: "+miFigura8.getAncho()+ " m\n");
        System.out.print("El laboratorio tendrá un lado de: "+miFigura8.getLargo()+" m\n");
        System.out.println("Y su área será: "+ miFigura8.calcularArea());*/

        System.out.println(miEndecagono.getNombre());
        miEndecagono.setApotema(11.0);
        System.out.println(miEndecagono.getApotema());
        miEndecagono.setLado(15.0);
        System.out.println(miEndecagono.getLado());
        miEndecagono.calcularArea();
        miEndecagono.calcularPerimetro();
        System.out.println("Commit");
    }
}