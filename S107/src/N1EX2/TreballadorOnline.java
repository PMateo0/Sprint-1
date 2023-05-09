package N1EX2;

public class TreballadorOnline extends Treballador{
    protected final int tarifaInternet = 56;
    public TreballadorOnline(String name, String surname, double priceHour) {
        super(name, surname, priceHour);

    }
    @Override
    public double calculateSalary(int horasT){
        return (horasT*priceHour)+tarifaInternet;
    }

    @Deprecated
    public void getName(){
        System.out.println(name);
    }

}
