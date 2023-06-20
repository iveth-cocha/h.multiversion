public class numeros extends mate {
    int x;
    int y;

    public numeros(){
        super();
    }
    public numeros(String nombre, int curso, int x, int y) {
        super(nombre, curso);
        this.x=x;
        this.y=y;
    }
//para loa clase hija de suma y multiplicacion
    public numeros(String nombre, int curso) {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void mensaje(){
        System.out.println("Numeros ingresados");
    }
}
