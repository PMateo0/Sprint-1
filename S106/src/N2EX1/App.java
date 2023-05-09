package N2EX1;

public class App {
    public static void main(String[] args) {
    Persona persona = new Persona("Pablo","Mateo",22);
    String curso = "Java Presencial";
    int semana = 3;

    GenericMethods.print(persona,curso,semana);
    // ERROR GenericMethods.print(curso,semana,semana);


    }
}
