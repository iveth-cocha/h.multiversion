public class multiplicacion extends suma{
    int multiplicacion;

    public multiplicacion (String nombre, int curso, int x, int y,int suma, int multiplicacion) {
        super(nombre, curso,x,y,suma);
        this.multiplicacion=multiplicacion;
    }

    public int getMultiplicacion() {
        return multiplicacion;
    }

    public void setMultiplicacion(int multiplicacion) {
        this.multiplicacion = multiplicacion;
    }

    public int proceso_m(){

        multiplicacion=suma*2;
        return multiplicacion;
    }
}
