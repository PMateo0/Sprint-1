package S103.N2EX1;


import java.util.Objects;

public class Restaurant implements Comparable<Restaurant>{
    protected String name;
    protected int punctuation;

    public Restaurant(String name, int punctuation) {
        this.name = name;
        this.punctuation = punctuation;
    }

    public String getName() {
        return name;
    }

    public int getPunctuation() {
        return punctuation;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (o==null || getClass() == o.getClass()) return false;
        Restaurant restaurant = (Restaurant) o;
        return Objects.equals(name,restaurant.name) && getPunctuation() == restaurant.getPunctuation();
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }


    @Override
    public int compareTo(Restaurant restaurant) {
        int c = 0;
        c = this.getName().compareTo(restaurant.getName());

        if (c == 0) {
            c = restaurant.getPunctuation() - this.getPunctuation();
        }
        return c;

    }

}

