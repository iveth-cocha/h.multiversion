public class suma extends numeros{
    int suma;

    public suma (String nombre, int curso, int x, int y, int suma) {
        super(nombre, curso,x,y);
        this.suma=suma;
    }
//constructor para la calse multiplicacion
    public suma(String nombre, int curso, int x, int y) {
    }

    public int getSuma() {
        return suma;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }

    public int proceso() {
        suma=x+y;
      return suma;
    }
}
