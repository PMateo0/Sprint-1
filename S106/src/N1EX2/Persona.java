package N1EX2;

public class Persona {
    protected String name;
    protected String surname;
    protected int age;

    public Persona(String name,String surname,int age){
        this.name=name;
        this.surname=surname;
        this.age=age;
    }

    @Override
    public String toString() {
        return  name + " " + surname + " " + age;
    }
}
