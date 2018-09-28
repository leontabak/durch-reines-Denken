
package travel;

import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;


@Named(value = "author")
@ApplicationScoped
public class Author implements Comparable<Author> {

    private final String firstName;
    private final String lastName;
    
    public Author( String firstName, String lastName ) {
        this.firstName = firstName;
        this.lastName = lastName;
    } // Author()
    
    public String getFirstName() {
        return this.firstName;
    } // getFirstName()
    
    public String getLastName() {
        return this.lastName;
    } // getLastName()

    @Override
    public int compareTo(Author otherAuthor ) {
     if( this.getLastName().equals( otherAuthor.getLastName() )) {
         return this.getFirstName().compareTo( otherAuthor.getFirstName() );
     } // if
     else {
         return this.getLastName().compareTo( otherAuthor.getLastName() );
     } // else
    } // compareTo( Author )
    
} // Author
