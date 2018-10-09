package travel;

import java.util.Calendar;
import java.util.Locale;
import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;

@Named(value = "author")
@ApplicationScoped
public class Author implements Comparable<Author> {

    private final String firstName;
    private final String lastName;
    private final Calendar dateOfBirth;
    private final Calendar dateOfDeath;

    public Author(String firstName, String lastName,
            Calendar dateOfBirth, Calendar dateOfDeath) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.dateOfDeath = dateOfDeath;
    } // Author()

    public String getFirstName() {
        return this.firstName;
    } // getFirstName()

    public String getLastName() {
        return this.lastName;
    } // getLastName()

    public String getDateOfBirth() {
        String result = this.dateOfBirth.get(Calendar.DAY_OF_MONTH)
                + "-"
                + this.dateOfBirth.getDisplayName(Calendar.MONTH,
                        Calendar.SHORT_FORMAT, Locale.US)
                + "-"
                + this.dateOfBirth.get(Calendar.YEAR);
        return result;
    } // getDateOfBirth()

    public String getDateOfDeath() {
        String result = this.dateOfDeath.get(Calendar.DAY_OF_MONTH)
                + "-"
                + this.dateOfDeath.getDisplayName(Calendar.MONTH,
                        Calendar.SHORT_FORMAT, Locale.US)
                + "-"
                + this.dateOfDeath.get(Calendar.YEAR);
        return result;
    } // getDateOfDeath()

    public String getDates() {
        String result = this.getDateOfBirth()
                + " to "
                + this.getDateOfDeath();
        return result;
    } // getDates()

    public String getName() {
        return this.getFirstName() + " " + this.getLastName();
    } // getName()

    @Override
    public int compareTo(Author otherAuthor) {
        if (this.getLastName().equals(otherAuthor.getLastName())) {
            return this.getFirstName().compareTo(otherAuthor.getFirstName());
        } // if
        else {
            return this.getLastName().compareTo(otherAuthor.getLastName());
        } // else
    } // compareTo( Author )

} // Author
