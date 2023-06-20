
public class Main {
    public static void main(String[] args) {
        //clase4
        suma ob=new suma("pedro",7,8,3,0);
        //clase5 hija de la clase4
        multiplicacion ob1=new multiplicacion("marco",6,6,4,0,0);
        //clase3
        operadores ob2=new operadores("ana",3,"suma","resta","Multiplicacion","division");

        System.out.println(ob.proceso());
        System.out.println(ob1.proceso_m());
        System.out.println("------");
        System.out.println(ob2.operador());



    }


}