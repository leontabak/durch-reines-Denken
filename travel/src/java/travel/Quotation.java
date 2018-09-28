package travel;

import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named(value = "quotation")
@ApplicationScoped
public class Quotation {
//    private static int count = 0;
//
//    private static final int TEXT_LENGTH = 40;
//    private static final int AUTHOR_LENGTH = 40;

    private String text;
    private String author;

    public Quotation( String text, String author ) {
        this.text = text;
        this.author = author;
    } // Quotation( String, String )

    public String getText() {
        return this.text;
    } // getText()

    public String getAuthor() {
        return this.author;
    } // getAuthor()

//    public static List<Quotation> getQuotations(int n) {
//        List<Quotation> result = new ArrayList<>();
//
//        for( int i = 0; i < n; i++ ) {
//            char lowercase = (char) ('a' + (count % 26));
//            char uppercase = (char) ('A' + (count % 26));
//
//            count++;
//
//            StringBuilder quotationText = new StringBuilder();
//            for( int j = 0; j < TEXT_LENGTH; j++ ) {
//                quotationText.append( uppercase );
//            } // for
//
//            StringBuilder quotationAuthor = new StringBuilder();
//            for( int j = 0; j < AUTHOR_LENGTH; j++ ) {
//                quotationAuthor.append( lowercase );
//            } // for
//
//            result.add( new Quotation( quotationText.toString(), 
//                    quotationAuthor.toString() ));
//        } // for
//
//        return result;
//    } // getQuotations( int )
} // Quotation
