
package travel;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named(value = "mathematicians")
@ApplicationScoped
public class Mathematicians {

    private final String [] MATHEMATICIANS = {
        "Gauss",
        "Riemann",
        "Klein",
        "Cantor",
        "Hilbert"
    };
    
    private final Map<String, Object> people = new LinkedHashMap<>();
    
    public Mathematicians() {
        for( String s : MATHEMATICIANS ) {
            this.people.put( s, s );
        } // for
    } // Mathematicians()
    
    public Map<String, Object> getPeople() {
        return this.people;
    } // getPeople()
} // Mathematicians
