package N1EX2;

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

    @Override
    public String toString() {
        return "TreballadorPresencial{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", priceHour=" + priceHour +
                '}';
    }
    @Deprecated
    public void printData(){
        System.out.println("TreballadorPresencial{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", priceHour=" + priceHour +
                '}');
    }
}
