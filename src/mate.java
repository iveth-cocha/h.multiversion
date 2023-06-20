public class mate {
    String nombre;
    int curso;

    public mate() {
    }

    public mate(String nombre, int curso) {
        this.nombre = nombre;
        this.curso = curso;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public void clase(){
        System.out.println("esta es la clase princuipal con la informacion de: "+ this.nombre +" "+this.curso);

    }
}
