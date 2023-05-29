package S103.N1EX1;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Month> monthList = new ArrayList<Month>();
        Month January = new Month("January"); monthList.add(0,January);
        Month February= new Month("February"); monthList.add(1,February);
        Month March = new Month("March"); monthList.add(2,March);
        Month April = new Month("April"); monthList.add(3,April);
        Month May = new Month("May"); monthList.add(4,May);
        Month June = new Month("June"); monthList.add(5,June);
        Month July = new Month("July"); monthList.add(6,July);
        Month September = new Month("September"); monthList.add(7,September);
        Month October = new Month("October"); monthList.add(8,October);
        Month November = new Month("November"); monthList.add(9,November);
        Month December = new Month("December"); monthList.add(10,December);
        Month August = new Month("August"); monthList.add(7,August);


        for(int contador = 0; contador < monthList.size(); contador++) {
            System.out.println(monthList.get(contador).getName());
        }

        HashSet<Month> monthsetlist = new HashSet<Month>();
        monthsetlist.addAll(monthList);


        Iterator<Month>printList = monthsetlist.iterator();
       while(printList.hasNext()) {
           System.out.println("\n" + printList.next().getName());
       }
    }
}
