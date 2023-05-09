package N1EX2;

public class App {
    public static void main(String[] args) {
    Persona persona = new Persona("Pablo","Mateo",22);
    String curso = "Java Presencial";
    int semana = 3;

    GenericMethods.print(persona.toString(),curso,semana);
    }
}
