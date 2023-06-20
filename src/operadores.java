public class operadores extends mate {
    String tipo1;
    String tipo2;
    String tipo3;
    String tipo4;

    public operadores(){
        super();
    }
    public operadores(String nombre, int curso, String tipo1,String tipo2,String tipo3,String tipo4 ) {
        super(nombre, curso);
        this.tipo1=tipo1;
        this.tipo1=tipo2;
        this.tipo1=tipo3;
        this.tipo1=tipo4;
    }

    public String getTipo1() {
        return tipo1;
    }

    public void setTipo1(String tipo1) {
        this.tipo1 = tipo1;
    }

    public String getTipo2() {
        return tipo2;
    }

    public void setTipo2(String tipo2) {
        this.tipo2 = tipo2;
    }

    public String getTipo3() {
        return tipo3;
    }

    public void setTipo3(String tipo3) {
        this.tipo3 = tipo3;
    }

    public String getTipo4() {
        return tipo4;
    }

    public void setTipo4(String tipo4) {
        this.tipo4 = tipo4;
    }


    public boolean operador() {
        System.out.println("Los operadores basicos son: "+this.tipo1+" "+this.tipo2+" "+this.tipo3+" "+this.tipo4);;
        return false;
    }
}


