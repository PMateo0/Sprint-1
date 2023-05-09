package N1EX2;

public class App {
    public static void main(String[] args) {
        TreballadorOnline treballadorOnline = new TreballadorOnline("Nahuel", "Shim", 2.76);
        TreballadorPresencial treballadorPresencial = new TreballadorPresencial("Jose", "Antonio", 1.98);
        treballadorOnline.getName();
        treballadorPresencial.printData();




    }
}
