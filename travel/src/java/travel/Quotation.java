package travel;

import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named(value = "quotation")
@ApplicationScoped
public class Quotation {
    private String germanText;
    private String englishText;
    private Author author;

    public Quotation( String germanText, String englishText, Author author ) {
        this.germanText = germanText;
        this.englishText = englishText;
        this.author = author;
    } // Quotation( String, String )

    public String getGermanText() {
        return this.germanText;
    } // getGermanText()

    public String getEnglishText() {
        return this.englishText;
    } // getEnglishText()

    public Author getAuthor() {
        return this.author;
    } // getAuthor()
    
} // Quotation
