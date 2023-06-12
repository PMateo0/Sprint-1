package N1EX1;

public class TreballadorOnline extends Treballador{
    private final int tarifaInternet = 56;
    public TreballadorOnline(String name, String surname, double priceHour) {
        super(name, surname, priceHour);

    }
    @Override
    public double calculateSalary(int horasT){
        return (horasT*priceHour)+tarifaInternet;
    }



}
