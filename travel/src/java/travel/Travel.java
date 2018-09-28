package travel;

import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.event.ActionEvent;

@Named(value = "travel")
@ApplicationScoped
public class Travel {

    private static final String BERLIN = "Berlin";
    private static final String MUNICH = "Munich";
    private static final String VIENNA = "Vienna";

    private static final String[] CITIES = {BERLIN, MUNICH, VIENNA};

    private int index;

    public Travel() {
        this.index = 0;
    } // Travel()

    public String getCity() {
        String result = CITIES[this.index];

        return result;
    } // getCity()

    public void cycle() {
        this.index = (this.index + 1) % CITIES.length;
    } // cycle()
} // Travel
