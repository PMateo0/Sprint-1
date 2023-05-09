package N1EX1;

public class App {
    public static void main(String[] args) {
        TreballadorOnline treballadorOnline = new TreballadorOnline("Nahuel", "Shim", 2.76);
        TreballadorPresencial treballadorPresencial = new TreballadorPresencial("Jose", "Antonio", 1.98);

        System.out.println(treballadorOnline.calculateSalary(60) + "\n" +
        treballadorPresencial.calculateSalary(80));

    }
}
