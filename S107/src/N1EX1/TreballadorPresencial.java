package N1EX1;

public class TreballadorPresencial extends Treballador{
    protected static int gasoline;
    public TreballadorPresencial(String name, String surname, double priceHour) {
        super(name, surname, priceHour);
        gasoline = 250;
    }
    @Override
    public double calculateSalary(int horasT){
        return (horasT*priceHour)+gasoline;
    }

}
