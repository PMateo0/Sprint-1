package N1EX2;

public class Treballador {
    protected final String name;
    protected final String surname;
    protected double priceHour;

    public Treballador(String name, String surname, double priceHour){
        this.name=name;
        this.surname=surname;
        this.priceHour=priceHour;
    }
    public double calculateSalary(int horasT){
        return horasT*priceHour;
    }
}
