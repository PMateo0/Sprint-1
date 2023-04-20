package S101.N2EX1;

public class SmartPhone extends Telefono implements Cam,Clock {

    public SmartPhone(String marca, String modelo){
        super(marca,modelo);
    }

    public void alarma(){

        System.out.println("Esta sonando una alarma");
    }

    public void fotografiar() {
        System.out.println("Se esta haciendo una fotografía");
    }
}
