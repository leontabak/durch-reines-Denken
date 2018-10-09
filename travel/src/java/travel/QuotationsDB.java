package travel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Random;
import java.util.TreeMap;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named(value = "quotationdb")
@ApplicationScoped
public class QuotationsDB {

    private final List<Quotation> quotations;
    private final TreeMap<String, Author> authors;
    private final Random rng;
    private int index;

    public QuotationsDB() {
        this.rng = new Random();
        this.index = 0;
        this.quotations = new ArrayList<>();
        this.authors = new TreeMap<>();

        // A.00
        Calendar dob = new GregorianCalendar(1844, 1, 20);
        Calendar dod = new GregorianCalendar(1906, 8, 5);
        // DOB 20 feb 1844
        // DOD 05 sep 1906
        String fn = "Ludwig";
        String ln = "Boltzmann";
        Author author = new Author(fn, ln, dob, dod);
        this.authors.put(this.makeKey(fn, ln), author);

        // A.01
        dob = new GregorianCalendar(1882, 11, 11);
        dod = new GregorianCalendar(1970, 0, 5);
        // DOB 11 dec 1882
        // DOD 05 jan 1970
        fn = "Max";
        ln = "Born";
        author = new Author(fn, ln, dob, dod);
        this.authors.put(this.makeKey(fn, ln), author);

        // A.02
        dob = new GregorianCalendar(1874, 7, 27);
        dod = new GregorianCalendar(1940, 3, 26);
        // DOB 27 aug 1874
        // DOD 26 apr 1940
        fn = "Carl";
        ln = "Bosch";
        author = new Author(fn, ln, dob, dod);
        this.authors.put(this.makeKey(fn, ln), author);

        // A.03
        dob = new GregorianCalendar(1912, 2, 23);
        dod = new GregorianCalendar(1977, 5, 16);
        // DOB 23 mar 1912
        // DOD 16 jun 1977
        fn = "Werner von";
        ln = "Braun";
        author = new Author(fn, ln, dob, dod);
        this.authors.put(this.makeKey(fn, ln), author);

        // A.04
        dob = new GregorianCalendar(1845, 2, 3);
        dod = new GregorianCalendar(1918, 0, 6);
        // DOB 03 mar 1845
        // DOD 06 jan 1918
        fn = "Georg";
        ln = "Cantor";
        author = new Author(fn, ln, dob, dod);
        this.authors.put(this.makeKey(fn, ln), author);

        // A.05
        dob = new GregorianCalendar(1831, 9, 6);
        dod = new GregorianCalendar(1916, 2, 12);
        // DOB 06 oct 1831
        // DOD 12 feb 1916
        fn = "Richard";
        ln = "Dedekind";
        author = new Author(fn, ln, dob, dod);
        this.authors.put(this.makeKey(fn, ln), author);

        // A.06
        dob = new GregorianCalendar(1858, 2, 18);
        dod = new GregorianCalendar(1913, 8, 29);
        // DOB 18 mar 1858
        // DOD 29 sep 1913
        fn = "Rudolf";
        ln = "Diesel";
        author = new Author(fn, ln, dob, dod);
        this.authors.put(this.makeKey(fn, ln), author);

        // A.07
        dob = new GregorianCalendar(1777, 3, 30);
        dod = new GregorianCalendar(1855, 1, 23);
        // DOB 30 apr 1777
        // DOD 23 feb 1855
        fn = "Carl Friedrich";
        ln = "Gauß";
        author = new Author(fn, ln, dob, dod);
        this.authors.put(this.makeKey(fn, ln), author);

        // A.08
        dob = new GregorianCalendar(1879, 2, 14);
        dod = new GregorianCalendar(1955, 3, 18);
        // DOB 14 mar 1879
        // DOD 18 apr 1955
        fn = "Albert";
        ln = "Einstein";
        author = new Author(fn, ln, dob, dod);
        this.authors.put(this.makeKey(fn, ln), author);

        // A.09
        dob = new GregorianCalendar(1906, 3, 28);
        dod = new GregorianCalendar(1978, 0, 14);
        // DOB 28 apr 1906
        // DOD 14 jan 1978
        fn = "Kurt";
        ln = "Gödel";
        author = new Author(fn, ln, dob, dod);
        this.authors.put(this.makeKey(fn, ln), author);

        // A.10
        dob = new GregorianCalendar(1749, 7, 28);
        dod = new GregorianCalendar(1832, 2, 22);
        // DOB 28 aug 1749
        // DOD 22 mar 1832
        fn = "Johann Wolfgang von";
        ln = "Goethe";
        author = new Author(fn, ln, dob, dod);
        this.authors.put(this.makeKey(fn, ln), author);

        // A.11
        dob = new GregorianCalendar(1901, 11, 5);
        dod = new GregorianCalendar(1976, 1, 1);
        // DOB 05 dec 1901
        // DOD 01 feb 1976
        fn = "Werner";
        ln = "Heisenberg";
        author = new Author(fn, ln, dob, dod);
        this.authors.put(this.makeKey(fn, ln), author);

        // A.12
        dob = new GregorianCalendar(1862, 0, 23);
        dod = new GregorianCalendar(1943, 1, 14);
        // DOB 23 jan 1862
        // DOD 14 feb 1943
        fn = "David";
        ln = "Hilbert";
        author = new Author(fn, ln, dob, dod);
        this.authors.put(this.makeKey(fn, ln), author);

        // A.13
        dob = new GregorianCalendar(1769, 8, 14);
        dod = new GregorianCalendar(1859, 4, 6);
        // DOB 14 sep 1769
        // DOD 06 may 1859
        fn = "Alexander von";
        ln = "Humboldt";
        author = new Author(fn, ln, dob, dod);
        this.authors.put(this.makeKey(fn, ln), author);

        // A.14
        dob = new GregorianCalendar(1849, 3, 25);
        dod = new GregorianCalendar(1925, 5, 22);
        // DOB 25 apr 1849
        // DOD 22 jun 1925
        fn = "Felix";
        ln = "Klein";
        author = new Author(fn, ln, dob, dod);
        this.authors.put(this.makeKey(fn, ln), author);

        // A.15
        dob = new GregorianCalendar(1843, 11, 11);
        dod = new GregorianCalendar(1910, 4, 27);
        // DOB 11 dec 1843
        // DOD 27 may 1910
        fn = "Robert";
        ln = "Koch";
        author = new Author(fn, ln, dob, dod);
        this.authors.put(this.makeKey(fn, ln), author);

        // A.16
        dob = new GregorianCalendar(1823, 11, 7);
        dod = new GregorianCalendar(1891, 11, 29);
        // DOB 07 dec 1823
        // DOD 29 dec 1891
        fn = "Leopold";
        ln = "Kronecker";
        author = new Author(fn, ln, dob, dod);
        this.authors.put(this.makeKey(fn, ln), author);

        // A.17
        dob = new GregorianCalendar(1868, 11, 24);
        dod = new GregorianCalendar(1941, 0, 11);
        // DOB 24 dec 1868
        // DOD 11 jan 1941
        fn = "Emanuel";
        ln = "Lasker";
        author = new Author(fn, ln, dob, dod);
        this.authors.put(this.makeKey(fn, ln), author);

        // A.18
        dob = new GregorianCalendar(1878, 10, 7);
        dod = new GregorianCalendar(1968, 9, 27);
        // DOB 07 nov 1878
        // DOD 27 oct 1968
        fn = "Lise";
        ln = "Meitner";
        author = new Author(fn, ln, dob, dod);
        this.authors.put(this.makeKey(fn, ln), author);

        // A.19
        dob = new GregorianCalendar(1864, 5, 22);
        dod = new GregorianCalendar(1909, 0, 12);
        // DOB 22 jun 1864
        // DOD 12 jan 1909
        fn = "Hermann";
        ln = "Minkowski";
        author = new Author(fn, ln, dob, dod);
        this.authors.put(this.makeKey(fn, ln), author);

        // A.20
        dob = new GregorianCalendar(1853, 8, 2);
        dod = new GregorianCalendar(1932, 3, 4);
        // DOB 02 sep 1853
        // DOD 04 apr 1932
        fn = "Wilhelm";
        ln = "Ostwald";
        author = new Author(fn, ln, dob, dod);
        this.authors.put(this.makeKey(fn, ln), author);

        // A.21
        dob = new GregorianCalendar(1858, 3, 23);
        dod = new GregorianCalendar(1947, 9, 4);
        // DOB 23 apr 1858
        // DOD 04 oct 1947
        fn = "Max";
        ln = "Planck";
        author = new Author(fn, ln, dob, dod);
        this.authors.put(this.makeKey(fn, ln), author);

        // A.22
        dob = new GregorianCalendar(1887, 7, 12);
        dod = new GregorianCalendar(1961, 0, 4);
        // DOB 12 aug 1887
        // DOD 04 jan 1961
        fn = "Erwin";
        ln = "Schrödinger";
        author = new Author(fn, ln, dob, dod);
        this.authors.put(this.makeKey(fn, ln), author);

        // A.23
        dob = new GregorianCalendar(1816, 11, 13);
        dod = new GregorianCalendar(1892, 11, 6);
        // DOB 13 dec 1816
        // DOD 06 dec 1892
        fn = "Werner von";
        ln = "Siemens";
        author = new Author(fn, ln, dob, dod);
        this.authors.put(this.makeKey(fn, ln), author);

        // A.24
        dob = new GregorianCalendar(1868, 10, 5);
        dod = new GregorianCalendar(1951, 3, 26);
        // DOB 05 dec 1868
        // DOD 26 apr 1951
        fn = "Arnold";
        ln = "Sommerfeld";
        author = new Author(fn, ln, dob, dod);
        this.authors.put(this.makeKey(fn, ln), author);

        // A.25
        dob = new GregorianCalendar(1861, 1, 27);
        dod = new GregorianCalendar(1925, 2, 30);
        // DOB 27 feb 1861 (or 25 feb)
        // DOD 30 mar 1925
        fn = "Rudolf";
        ln = "Steiner";
        author = new Author(fn, ln, dob, dod);
        this.authors.put(this.makeKey(fn, ln), author);

        // A.26
        dob = new GregorianCalendar(1815, 9, 31);
        dod = new GregorianCalendar(1897, 1, 19);
        // DOB 31 oct 1815
        // DOD 19 feb 1897
        fn = "Karl";
        ln = "Weierstraß";
        author = new Author(fn, ln, dob, dod);
        this.authors.put(this.makeKey(fn, ln), author);

        // A.27
        dob = new GregorianCalendar(1912, 5, 28);
        dod = new GregorianCalendar(2007, 3, 28);
        // DOB 28 jun 1912
        // DOD 28 apr 2007
        fn = "Carl Friedrich von";
        ln = "Weizsäcker";
        author = new Author(fn, ln, dob, dod);
        this.authors.put(this.makeKey(fn, ln), author);

        // A.28
        dob = new GregorianCalendar(1885, 10, 9);
        dod = new GregorianCalendar(1955, 11, 8);
        // DOB 09 nov 1885
        // DOD 08 dec 1955
        fn = "Hermann";
        ln = "Weyl";
        author = new Author(fn, ln, dob, dod);
        this.authors.put(this.makeKey(fn, ln), author);

        /*
        author = new Author("Ludwig", "Boltzmann");
        author = new Author("Max", "Born");
        author = new Author("Carl", "Bosch");
        author = new Author("Werner von", "Braun");
        author = new Author("Georg", "Cantor");
        author = new Author("Richard", "Dedekind");
        author = new Author("Rudolf", "Diesel");
        author = new Author("Albert", "Einstein");
        author = new Author("Carl Friedrich", "Gauß");
        author = new Author("Kurt", "Gödel");
        author = new Author("Johann Wolfgang von", "Goethe");
        author = new Author("Werner", "Heisenberg");
        author = new Author("David", "Hilbert");
        author = new Author("Alexander von", "Humboldt");
        author = new Author("Felix", "Klein");
        author = new Author("Robert", "Koch");
        author = new Author("Leopold", "Kronecker");
        author = new Author("Emanual", "Lasker");
        author = new Author("Lise", "Meitner");
        author = new Author("Hermann", "Minkowski");
        author = new Author("Wilhelm", "Ostwald");
        author = new Author("Max", "Planck");
        author = new Author("Erwin", "Schrödinger");
        author = new Author("Werner von", "Siemens");
        author = new Author("Arnold", "Sommerfeld");
        author = new Author("Rudolf", "Steiner");
        author = new Author("Karl", "Weierstraß");
        author = new Author("Carl Friedrich von", "Weizsäcker");
        author = new Author("Hermann", "Weyl");
         */
        // Q.00
        String germanText = "Die Möglichkeit einer mechanischen "
                + "Erklärung der ganzen Natur ist "
                + "nicht bewiesen, ja, dass wir dieses Ziel "
                + "vollkommen erreichen werden,"
                + "kaum denkbar.";

        String englishText
                = "The possibility that a mechanical explanation "
                + "of all of nature is not provable, that we will "
                + "not achieve that goal fully, is hardly thinkable.";

        String firstName = "Ludwig";
        String lastName = "Boltzmann";
        String key = this.makeKey(firstName, lastName);
        quotations.add(new Quotation(germanText, englishText, this.authors.get(key)));

        // Q.01
        germanText = "Für den gläubigen Menschen steht Gott am Anfang, "
                + "für den Wissenschaftler am Ende aller "
                + "seiner Überlegungen.";

        englishText
                = "For believing people, God is at the beginning. "
                + "For scientists, God is at the end of all of their "
                + "reflections.";

        firstName = "Max";
        lastName = "Planck";
        key = this.makeKey(firstName, lastName);
        quotations.add(new Quotation(germanText, englishText, this.authors.get(key)));

        // Q.02
        germanText = "Die Wahrheit triumphiert nie, ihre Gegner "
                + "sterben nur aus.";

        englishText
                = "Truth never triumphs. Its opponents die out.";

        firstName = "Max";
        lastName = "Planck";
        key = this.makeKey(firstName, lastName);
        quotations.add(new Quotation(germanText, englishText, this.authors.get(key)));

        // Q.03
        germanText = "Die Naturwissenschaft braucht "
                + "der Mensch zum Erkennen, "
                + "den Glauben zum Handeln.";

        englishText
                = "Science needs people to know. "
                + "Faith needs people to act.";

        firstName = "Max";
        lastName = "Planck";
        key = this.makeKey(firstName, lastName);
        quotations.add(new Quotation(germanText, englishText, this.authors.get(key)));

        // Q.04
        germanText = "Auch eine Enttäuschung, wenn sie "
                + "nur gründlich und endgültig ist, "
                + "bedeutet einen Schritt vorwärts.";

        englishText
                = "A disappointment is also a step forward, "
                + "when it thorough and final.";

        firstName = "Max";
        lastName = "Planck";
        key = this.makeKey(firstName, lastName);
        quotations.add(new Quotation(germanText, englishText, this.authors.get(key)));

        // Q.05
        germanText = "Es hat Zeiten gegeben, in denen sich "
                + "Philosophie und Naturwissenschaft fremd "
                + "und unfreundlich gegenüberstanden. Diese "
                + "Zeiten sind längst vorüber.";

        englishText
                = "There was a time in which philosophy and science "
                + "were unfriendly strangers to one another. "
                + "Those times are long gone.";

        firstName = "Max";
        lastName = "Planck";
        key = this.makeKey(firstName, lastName);
        quotations.add(new Quotation(germanText, englishText, this.authors.get(key)));

        // Q.06
        germanText = "Religion und Naturwissenschaf---sie "
                + "schließen sich nicht aus, "
                + "wie manche heutzutage glauben oder fürchten, "
                + "sondern sie ergänzen und bedingen einander.";

        englishText
                = "Religion and science---they do not exclude one another, "
                + "as some people today believe or fear, but rather they "
                + "complement and require one another.";

        firstName = "Max";
        lastName = "Planck";
        key = this.makeKey(firstName, lastName);
        quotations.add(new Quotation(germanText, englishText, this.authors.get(key)));

        // Q.07
        germanText = "Ein rein verstandesmäßiges Weltbild ganz "
                + "ohne Mystik ist ein Unding.";

        englishText
                = "A purely intellectual world view that is wholly "
                + "without mysticism is an absurdity.";

        firstName = "Erwin";
        lastName = "Schrödinger";
        key = this.makeKey(firstName, lastName);
        quotations.add(new Quotation(germanText, englishText, this.authors.get(key)));

        // Q.08
        germanText = "Ich gehöre zu der Generation, "
                + "die noch zwischen Verstand "
                + "und Vernunft unterscheidet. "
                + "Von diesem Standpunkt ist die Raumfahrt "
                + "ein Triumph des Verstandes, aber ein "
                + "tragisches Versagen der Vernunft!";

        englishText
                = "I belong to the generation that still "
                + "distinguished between reason and common sense. "
                + "From this perspective, space is a triumph of the "
                + "intellect and a tragic denial of common sense!";

        firstName = "Max";
        lastName = "Born";
        key = this.makeKey(firstName, lastName);
        quotations.add(new Quotation(germanText, englishText, this.authors.get(key)));

        // Q.09
        germanText = "Ideen, wie absolute Gewißheit, absolute Genauigkeit, "
                + "endgültige Wahrheit und so fort, sind Erfindungen "
                + "der Einbildungskraft "
                + "und haben in der Wissenschaft nichts zu suchen.";

        englishText
                = "Ideas such as absolute certainty, absolute precision, "
                + "final truth, and so on, are inventions of the imagination, "
                + "and not things to seek in science.";

        firstName = "Max";
        lastName = "Born";
        key = this.makeKey(firstName, lastName);
        quotations.add(new Quotation(germanText, englishText, this.authors.get(key)));

        // Q.10
        germanText = "Das Wesen der Mathematik liegt in ihrer Freiheit.";

        englishText
                = "The essential quality of mathematics lies in its freedom.";

        firstName = "Georg";
        lastName = "Cantor";
        key = this.makeKey(firstName, lastName);
        quotations.add(new Quotation(germanText, englishText, this.authors.get(key)));

        // Q.11
        germanText = "In der Mathematik ist die Kunst, eine Frage zu stellen, "
                + "höher zu bewerten als die Kunst, sie zu lösen.";

        englishText
                = "In mathematics the art of posing a question is to be valued "
                + "more highly than the art of solving questions.";

        firstName = "Georg";
        lastName = "Cantor";
        key = this.makeKey(firstName, lastName);
        quotations.add(new Quotation(germanText, englishText, this.authors.get(key)));

        // Q.12
        germanText = "In der Mathematik gibt es kein Ignorabimus.";

        englishText
                = "Nothing is unknowable in mathematics.";

        firstName = "David";
        lastName = "Hilbert";
        key = this.makeKey(firstName, lastName);
        quotations.add(new Quotation(germanText, englishText, this.authors.get(key)));

        // Q.13
        germanText = "Manche Menschen haben einen Gesichtskreis vom Radius Null "
                + "und nennen ihn ihren Standpunkt.";

        englishText
                = "Some people have a horizon with a zero radius and "
                + "call it their point of view.";

        firstName = "David";
        lastName = "Hilbert";
        key = this.makeKey(firstName, lastName);
        quotations.add(new Quotation(germanText, englishText, this.authors.get(key)));

        // Q.14
        germanText = "Mathematik ist die Grundlage alles exakten "
                + "naturwissenschaftlichen Erkennens.";

        englishText
                = "Mathematics is the basis of all exact, scientific knowledge.";

        firstName = "David";
        lastName = "Hilbert";
        key = this.makeKey(firstName, lastName);
        quotations.add(new Quotation(germanText, englishText, this.authors.get(key)));

        // Q.15
        germanText = "Für einen Mathematiker haben Sie zu wenig Phantasie, "
                + "sie sollten Dichter werden.";

        englishText
                = "For a mathematician, you have too little imagination. "
                + "You should become a poet.";

        firstName = "David";
        lastName = "Hilbert";
        key = this.makeKey(firstName, lastName);
        quotations.add(new Quotation(germanText, englishText, this.authors.get(key)));

        // Q.16
        germanText = "Im großen Garten der Geometrie kann sich jeder "
                + "nach seinem Geschmack einen Strauß pflücken.";

        englishText
                = "In the large garden of geometry, each one of us can "
                + "pick a bouquet according to our own taste.";

        firstName = "David";
        lastName = "Hilbert";
        key = this.makeKey(firstName, lastName);
        quotations.add(new Quotation(germanText, englishText, this.authors.get(key)));

        // Q.17
        germanText = "Wenn ich nach einem tausendjährigen "
                + "Schlaf aufwachen würde, "
                + "wäre meine erste Frage: `Wurde die "
                + "Riemann-Hypothese bewiesen?' ";

        englishText
                = "If I were to awake after a thousand years of sleep, "
                + "my first question would be: `Was the Riemann Hypothesis proved?'";

        firstName = "David";
        lastName = "Hilbert";
        key = this.makeKey(firstName, lastName);
        quotations.add(new Quotation(germanText, englishText, this.authors.get(key)));

        // Q.18
        germanText = "Im Einzelnen möchte ich der Individualität "
                + "des Lehrers eine "
                + "weitgehende Freiheit lassen; "
                + "ich glaube mehr an die Wirksamkeit "
                + "der Persönlichkeiten als an diejenige "
                + "der Methoden und "
                + "ausgeklügelten Lehrpläne.";

        englishText
                = "Specifically, I would like the teacher who allows wide-ranging "
                + "freedom. "
                + "I believe more in the effectiveness "
                + "of the teacher's personal qualities than "
                + "in the methods and ingenuity of the lesson plans.";

        firstName = "Felix";
        lastName = "Klein";
        key = this.makeKey(firstName, lastName);
        quotations.add(new Quotation(germanText, englishText, this.authors.get(key)));

        // Q.19
        germanText = "Die Logik ist die Hygiene, deren sich "
                + "der Mathematiker bedient, "
                + "um seine Gedanken gesund und kräftig zu erhalten.";

        englishText
                = "Logic is the hygiene that mathematicians employ "
                + "to keep their thoughts healthy and strong.";

        firstName = "Hermann";
        lastName = "Weyl";
        key = this.makeKey(firstName, lastName);
        quotations.add(new Quotation(germanText, englishText, this.authors.get(key)));

        germanText = "Die Symmetrie ist diejenige Idee, mit deren Hilfe "
                + "der Mensch im Laufe "
                + "der Jahrhunderte versuchte, Ordnung, Schönheit "
                + "und Vollkommenheit "
                + "zu begreifen und zu schaffen.";

        englishText
                = "Symmetry is the idea with whose help people over "
                + "the course of centuries tried to comprehend and create "
                + "order, beauty, and perfection.";

        firstName = "Hermann";
        lastName = "Weyl";
        key = this.makeKey(firstName, lastName);
        quotations.add(new Quotation(germanText, englishText, this.authors.get(key)));

        // Q.20
        germanText = "Die Ideen sind nicht verantwortlich für das, "
                + "was die Menschen aus ihnen machen.";

        englishText
                = "Ideas are not responsible for what "
                + "people make of them.";

        firstName = "Werner";
        lastName = "Heisenberg";
        key = this.makeKey(firstName, lastName);
        quotations.add(new Quotation(germanText, englishText, this.authors.get(key)));

        // Q.21
        germanText = "Auch das lauteste Getöse großer "
                + "Ideale darf uns nicht "
                + "verwirren und nicht hindern, "
                + "den einen leisen Ton zu hören, "
                + "auf den alles ankommt.";

        englishText
                = "Also, the loudest noise of great ideals "
                + "may not confuse us and prevent us from "
                + "hearing a soft sound that matters.";

        firstName = "Werner";
        lastName = "Heisenberg";
        key = this.makeKey(firstName, lastName);
        quotations.add(new Quotation(germanText, englishText, this.authors.get(key)));

        // Q.22
        germanText = "Die Naturwissenschaft beschreibt "
                + "und erklärt die Natur "
                + "nicht einfach, so wie sie `an sich' ist. "
                + "Sie ist vielmehr "
                + "ein Teil des Wechselspiels zwischen "
                + "der Natur und uns selbst.";

        englishText
                = "Science does not describe and explain nature "
                + "simply as it is by itself. "
                + "Science is much more part of the back and forth "
                + "exchange between ourselves and nature.";

        firstName = "Werner";
        lastName = "Heisenberg";
        key = this.makeKey(firstName, lastName);
        quotations.add(new Quotation(germanText, englishText, this.authors.get(key)));

        // Q.23
        germanText = "Das Leben muss nicht leicht sein, "
                + "wenn es nur inhaltsreich ist.";

        englishText
                = "Life need not be easy if it is rich with content.";

        firstName = "Lise";
        lastName = "Meitner";
        key = this.makeKey(firstName, lastName);
        quotations.add(new Quotation(germanText, englishText, this.authors.get(key)));

        // Q.24
        germanText = "Solange nur wir, die Verfolgten, "
                + "die schlaflosen Nächte "
                + "haben und nicht Ihr, "
                + "solange wird es in Deutschland "
                + "nicht besser werden.";

        englishText
                = "So long as we the persecuted have sleepless "
                + "nights and not you, so long will things not "
                + "become better in Germany.";

        firstName = "Lise";
        lastName = "Meitner";
        key = this.makeKey(firstName, lastName);
        quotations.add(new Quotation(germanText, englishText, this.authors.get(key)));

        // Q.25
        germanText = "In der Welt der Mathematik "
                + "ist alles im Gleichgewicht "
                + "und perfekt geordnet. "
                + "Sollte man nicht dasselbe "
                + "für die Welt der Realität annehmen, "
                + "entgegen allem Anschein?";

        englishText
                = "In the world of mathematics everything "
                + "is in balance and perfectly ordered. "
                + "Should one not accept the same for the real "
                + "world, despite all of the appearances?";

        firstName = "Kurt";
        lastName = "Gödel";
        key = this.makeKey(firstName, lastName);
        quotations.add(new Quotation(germanText, englishText, this.authors.get(key)));

        // Q.26
        germanText = "Die Welt ist vernünftig.";

        englishText
                = "The world is reasonable. ";

        firstName = "Kurt";
        lastName = "Gödel";
        key = this.makeKey(firstName, lastName);
        quotations.add(new Quotation(germanText, englishText, this.authors.get(key)));

        // Q.27
        germanText = "Phantasie ist wichtiger als Wissen, "
                + "denn Wissen ist begrenzt.";

        englishText
                = "Imagination is more important than knowledge, "
                + "because knowledge is bounded.";

        firstName = "Albert";
        lastName = "Einstein";
        key = this.makeKey(firstName, lastName);
        quotations.add(new Quotation(germanText, englishText, this.authors.get(key)));

        // Q.28
        germanText = "Das Schönste, was wir erleben können, "
                + "ist das Geheimnisvolle.";

        englishText
                = "The most beautiful things that we can experience "
                + "are the mysterious.";

        firstName = "Albert";
        lastName = "Einstein";
        key = this.makeKey(firstName, lastName);
        quotations.add(new Quotation(germanText, englishText, this.authors.get(key)));

        // Q.29
        germanText = "Die Naturwissenschaft ohne Religion ist lahm, "
                + "die Religion ohne Naturwissenschaft ist blind.";

        englishText
                = "Science without nature is lame, religion without "
                + "science is blind.";

        firstName = "Albert";
        lastName = "Einstein";
        key = this.makeKey(firstName, lastName);
        quotations.add(new Quotation(germanText, englishText, this.authors.get(key)));

        // Q.30
        germanText = "Gott würfelt nicht.";

        englishText = "God does not throw dice.";

        firstName = "Albert";
        lastName = "Einstein";
        key = this.makeKey(firstName, lastName);
        quotations.add(new Quotation(germanText, englishText, this.authors.get(key)));

        // Q.31
        germanText = "Raffiniert ist der Herrgot, "
                + "aber boshaft ist er nicht.";

        englishText = "The Lord is clever but not malicious.";

        firstName = "Albert";
        lastName = "Einstein";
        key = this.makeKey(firstName, lastName);
        quotations.add(new Quotation(germanText, englishText, this.authors.get(key)));

        // Q.32
        germanText = "Thermodynamik ist ein komisches Fach. "
                + "Das erste Mal, wenn man sich"
                + "damit befasst, versteht man nichts davon. "
                + "Beim zweiten Durcharbeiten"
                + "denkt man, man hätte nun alles verstanden, "
                + "mit Ausnahme von ein oder"
                + "zwei kleinen Details. Das dritte Mal, "
                + "wenn man den Stoff"
                + "durcharbeitet, bemerkt man, dass man fast "
                + "gar nichts davon versteht,"
                + "aber man hat sich inzwischen so daran gewöhnt, "
                + "dass es einen nicht"
                + "mehr stört.";

        englishText
                = "Thermodynamics is a funny subject. "
                + "The first time that you try to grasp the subject, "
                + "you understand nothing. "
                + "On your second attempt to work through it, "
                + "you think that you would have understood everything "
                + "except for one or two small details. "
                + "Then on the third time, if you work through the material, "
                + "you observe that you understand almost nothing, "
                + "but by then you have become so used to it, that "
                + "it no longer disturbs you.";

        firstName = "Arnold";
        lastName = "Sommerfeld";
        key = this.makeKey(firstName, lastName);
        quotations.add(new Quotation(germanText, englishText, this.authors.get(key)));

        // Q.33
        germanText = "Was wir heutzutage aus der Sprache der Spektren "
                + "heraus hören, ist eine"
                + "wirkliche Sphärenmusik des Atoms, "
                + "ein Zusammenklingen ganzzahliger"
                + "Verhältnisse, eine bei aller Mannigfaltigkeit "
                + "zunehmende Ordnung und"
                + "Harmonie.";

        englishText
                = "What we hear in the language of spectra, "
                + "is really the atoms' music of the spheres, "
                + "a sounding together of whole numbers, "
                + "all variety in growing order and harmony.";

        firstName = "Arnold";
        lastName = "Sommerfeld";
        key = this.makeKey(firstName, lastName);
        quotations.add(new Quotation(germanText, englishText, this.authors.get(key)));

        // Q.34
        germanText = "Es handelt sich, so kurz wie möglich "
                + "ausgedrückt darum, "
                + "daß die Welt in Raum und Zeit "
                + "in gewissem Sinne eine "
                + "vierdimensionale nichteuklidische "
                + "Mannigfaltigkeit ist.";

        englishText
                = "Said as concisely as possible, the world "
                + "is in space and time a four dimensional "
                + "non-Euclidean manifold (shape).";

        firstName = "Hermann";
        lastName = "Minkowski";
        key = this.makeKey(firstName, lastName);
        quotations.add(new Quotation(germanText, englishText, this.authors.get(key)));

        // Q.35
        germanText = "Ohne Fehler kann es keine Brillanz geben.";

        englishText = "Without mistakes, there can be no brilliance.";

        firstName = "Emanuel";
        lastName = "Lasker";
        key = this.makeKey(firstName, lastName);
        quotations.add(new Quotation(germanText, englishText, this.authors.get(key)));

        // Q.36
        germanText = "Ich möchte Schüler heranbilden, "
                + "die das Vermögen haben, "
                + "selbst zu denken und Kritik zuüben.";

        englishText
                = "I would like to train students "
                + "who have the capability to think for themselves "
                + "and to practice criticism.";

        firstName = "Emanuel";
        lastName = "Lasker";
        key = this.makeKey(firstName, lastName);
        quotations.add(new Quotation(germanText, englishText, this.authors.get(key)));

        // Q.37
        germanText = "Wenn Sie zu wählen haben zwischen einem Genie "
                + "und einem Charakter, "
                + "vergessen Sie das Genie.";

        englishText
                = "If you must choose between a genius and a person "
                + "with good character, forget the genius.";

        firstName = "Carl";
        lastName = "Bosch";
        key = this.makeKey(firstName, lastName);
        quotations.add(new Quotation(germanText, englishText, this.authors.get(key)));

        // Q.38
        germanText = "Das Denken ist auch eine Wirklichkeit, "
                + "sogar eine der wichtigsten im Menschenleben.";

        englishText
                = "Thoughts are also a reality, even a more important "
                + "reality in human life.";

        firstName = "Wilhelm";
        lastName = "Ostwald";
        key = this.makeKey(firstName, lastName);
        quotations.add(new Quotation(germanText, englishText, this.authors.get(key)));

        // Q.39
        germanText = "Für augenblicklichen Gewinn verkaufe "
                + "ich die Zukunft nicht.";

        englishText = "For a momentary gain I do not sell the future.";

        firstName = "Werner von";
        lastName = "Siemens";
        key = this.makeKey(firstName, lastName);
        quotations.add(new Quotation(germanText, englishText, this.authors.get(key)));

        // Q.40
        germanText = "Messen ist Wissen.";

        englishText = "Measurement is knowledge.";

        firstName = "Werner von";
        lastName = "Siemens";
        key = this.makeKey(firstName, lastName);
        quotations.add(new Quotation(germanText, englishText, this.authors.get(key)));

        // Q.41
        germanText = "Ohne Mathematik tappt man doch immer im Dunkeln.";

        englishText = "Without mathematics a person always stumbles in the dark.";

        firstName = "Werner von";
        lastName = "Siemens";
        key = this.makeKey(firstName, lastName);
        quotations.add(new Quotation(germanText, englishText, this.authors.get(key)));

        // Q.42
        germanText = "Es kommt nicht darauf an, mit dem Kopf "
                + "durch die Wand zu rennen, "
                + "sondern mit den Augen die Tür zu finden.";

        englishText
                = "Rather than break through the wall by running "
                + "your head into it, find a door with your eyes.";

        firstName = "Werner von";
        lastName = "Siemens";
        key = this.makeKey(firstName, lastName);
        quotations.add(new Quotation(germanText, englishText, this.authors.get(key)));

        // Q.43
        germanText = "Von 100 Genies gehen 99 unentdeckt zugrunde.";

        englishText = "Of 100 geniuses, 99 go undiscovered.";

        firstName = "Rudolf";
        lastName = "Diesel";
        key = this.makeKey(firstName, lastName);
        quotations.add(new Quotation(germanText, englishText, this.authors.get(key)));

        // Q.44
        germanText = "Jedes Naturgesetz, das sich dem Beobachter offenbart, "
                + "lässt auf ein höheres, noch unerkanntes schließen.";

        englishText
                = "Every law of nature that is unveiled to the observer "
                + "suggests a higher but still unknown principle.";

        firstName = "Alexander von";
        lastName = "Humboldt";
        key = this.makeKey(firstName, lastName);
        quotations.add(new Quotation(germanText, englishText, this.authors.get(key)));

        // Q.45
        germanText = "Bei der Eroberung des Weltraums "
                + "sind zwei Probleme zu lösen: "
                + "die Schwerkraft und der Papierkrieg. "
                + "Mit der Schwerkraft wären wir fertig geworden.";

        englishText
                = "In the conquest of space there are two problems "
                + "to solve: gravity and the paperwork. "
                + "With gravity, we would all be done.";

        firstName = "Werner von";
        lastName = "Braun";
        key = this.makeKey(firstName, lastName);
        quotations.add(new Quotation(germanText, englishText, this.authors.get(key)));

        // Q.46
        germanText = "Wo viel Licht ist, ist starker Schatten.";

        englishText = "Where this much light, there are deep shadows.";

        firstName = "Johann Wolfgang von";
        lastName = "Goethe";
        key = this.makeKey(firstName, lastName);
        quotations.add(new Quotation(germanText, englishText, this.authors.get(key)));

        // Q.47
        germanText = "Auch für den Physiker ist "
                + "die Möglichkeit einer Beschreibung "
                + "in der gewöhnlichen Sprache ein Kriterium "
                + "für den Grad des Verständnisses, "
                + "das in dem betreffenden Gebiet erreicht worden ist.";

        englishText
                = "Also, for the physicist, the ability "
                + "to describe in ordinary language is a measure "
                + "of the degree of understanding that has been "
                + "achieved.";

        firstName = "Werner";
        lastName = "Heisenberg";
        key = this.makeKey(firstName, lastName);
        quotations.add(new Quotation(germanText, englishText, this.authors.get(key)));

        // Q.48
        germanText = "Die Quantentheorie läßt keine völlig "
                + "objektive Beschreibung der Natur mehr zu.";

        englishText
                = "The quantum theory does not allow any more "
                + "fully objective description of nature.";

        firstName = "Werner";
        lastName = "Heisenberg";
        key = this.makeKey(firstName, lastName);
        quotations.add(new Quotation(germanText, englishText, this.authors.get(key)));

        // Q.49
        germanText = "Die Quantentheorie ist so ein wunderbares Beispiel dafür, "
                + "daß man einen Sachverhalt in völliger Klarheit verstanden "
                + "haben kann und gleichzeitig doch weiß, "
                + "daß man nur in Bildern "
                + "und Gleichnissen von ihm reden kann.";

        englishText
                = "Quantum theory is such a wonderful example of "
                + "one's ability to understand something fully and clearly, "
                + "and yet simultaneously know that one can only speak "
                + "about it with pictures and parables.";

        firstName = "Werner";
        lastName = "Heisenberg";
        key = this.makeKey(firstName, lastName);
        quotations.add(new Quotation(germanText, englishText, this.authors.get(key)));

        // Q.50
        germanText = "Der Physiker erklärt die Geheimnisse der Natur nicht, "
                + "er führt sie auf tieferliegende Geheimnisse zurück.";

        englishText
                = "The physicist does not explain nature's secrets, "
                + "but leads us to deeper secrets.";

        firstName = "Carl Friedrich von";
        lastName = "Weizsäcker";
        key = this.makeKey(firstName, lastName);
        quotations.add(new Quotation(germanText, englishText, this.authors.get(key)));

        // Q.51
        germanText = "Ein Mathematiker, der nicht irgendwie ein Dichter ist, "
                + "wird nie ein vollkommener Mathematiker sein.";

        englishText
                = "A mathematician who is not a bit of a poet will "
                + "never be a complete mathematician.";

        firstName = "Karl";
        lastName = "Weierstraß";
        key = this.makeKey(firstName, lastName);
        quotations.add(new Quotation(germanText, englishText, this.authors.get(key)));

        // Q.52
        germanText = "Wie die Musiker schon nach den ersten Akkorden Mozart, "
                + "Beethoven, Schubert erkennen, "
                + "so könnten die Mathematiker ihren Cauchy, "
                + "Gauß, Jacobi oder Helmholtz nach "
                + "wenigen Seiten erkennen.";

        englishText
                = "Just as the musician recognizes Mozart, Beethoven, "
                + "and Shubert after the first chords, so does the mathematician "
                + "recognize Cauchy, Gauss, and Jacobi or Helmholtz after "
                + "a few pages.";

        firstName = "Ludwig";
        lastName = "Boltzmann";
        key = this.makeKey(firstName, lastName);
        quotations.add(new Quotation(germanText, englishText, this.authors.get(key)));

        // Q.53
        germanText = "Was beweisbar ist, soll in der Wissenschaft "
                + "nicht ohne Beweis geglaubt werden.";

        englishText
                = "What is provable in science should not "
                + "be believed in the absence of proof.";

        firstName = "Richard";
        lastName = "Dedekind";
        key = this.makeKey(firstName, lastName);
        quotations.add(new Quotation(germanText, englishText, this.authors.get(key)));

        // Q.54
        germanText = "Es ist nicht das Wissen, sondern das Lernen, "
                + "nicht das Besitzen, "
                + "sondern das Erwerben, nicht das Dasein, "
                + "sondern das Hinkommen, "
                + "was den größten Genußgewährt.";

        englishText
                = "It is not the knowledge, but the learning, "
                + "not the possessing, but the acquiring, "
                + "not being there, but getting there, that "
                + "gives the greatest enjoyment.";

        firstName = "Carl Friedrich";
        lastName = "Gauß";
        key = this.makeKey(firstName, lastName);
        quotations.add(new Quotation(germanText, englishText, this.authors.get(key)));

        // Q.55
        germanText = "Nichts ist getan, wenn noch "
                + "etwas zu tun übrig ist.";

        englishText
                = "Nothing is done if there is still "
                + "something remaining to be done.";

        firstName = "Carl Friedrich";
        lastName = "Gauß";
        key = this.makeKey(firstName, lastName);
        quotations.add(new Quotation(germanText, englishText, this.authors.get(key)));

        // Q.56
        germanText = "Da ist das Problem, suche die Lösung. "
                + "Du kannst sie durch reines Denken finden; "
                + "denn in der Mathematik gibt es kein Ignorabimus.";

        englishText
                = "There is the problem, seek its solution. "
                + "You can find it through pure thought because "
                + "nothing is unknowable in mathematics.";

        firstName = "Carl Friedrich";
        lastName = "Gauß";
        key = this.makeKey(firstName, lastName);
        quotations.add(new Quotation(germanText, englishText, this.authors.get(key)));

        // Q.57
        germanText = "Die ganzen Zahlen hat der liebe Gott gemacht, "
                + "alles andere ist Menschenwerk.";

        englishText
                = "God made the whole numbers. Human beings made "
                + "everything else.";

        firstName = "Leopold";
        lastName = "Kronecker";
        key = this.makeKey(firstName, lastName);
        quotations.add(new Quotation(germanText, englishText, this.authors.get(key)));

        // Q.58
        germanText = "Die Mathematik ist das Instrument, "
                + "welches die Vermittlung bewirkt zwischen "
                + "Theorie und Praxis, zwischen Denken und "
                + "Beobachten: Sie baut die verbindende "
                + "Brücke und gestaltet sie immer tragfähiger. "
                + "Daher kommt es, daß unsere ganze gegenwärtige "
                + "Kultur, soweit sie auf der "
                + "geistigen Durchdringung und Dienstbarmachung "
                + "der Natur beruht, "
                + "ihre Grundlage in der Mathematik findet.";

        englishText
                = "Mathematics is the instrument which mediates "
                + "between theory and practice, between thinking "
                + "and observation. She builds and sustains the connecting "
                + "bridge. "
                + "In this way our whole present day culture, "
                + "so far as it is based on intellectual penetration "
                + "and service of nature, "
                + "has found its foundation in mathematics.";

        firstName = "David";
        lastName = "Hilbert";
        key = this.makeKey(firstName, lastName);
        quotations.add(new Quotation(germanText, englishText, this.authors.get(key)));

        // Q.59
        germanText = "Man darf nicht das, was uns unwahrscheinlich "
                + "und unnatürlich erscheint, "
                + "mit dem verwechseln, was absolut unmöglich ist.";

        englishText
                = "One may not confuse what appears improbable and "
                + "unnatural with what is absolutely impossible.";

        firstName = "Carl Friedrich";
        lastName = "Gauß";
        key = this.makeKey(firstName, lastName);
        quotations.add(new Quotation(germanText, englishText, this.authors.get(key)));

        // Q.60
        germanText = "Die Frage ist zu gut, um sie mit "
                + "einer Antwort zu verderben.";

        englishText
                = "The question is too good to spoil "
                + "with an answer.";

        firstName = "Robert";
        lastName = "Koch";
        key = this.makeKey(firstName, lastName);
        quotations.add(new Quotation(germanText, englishText, this.authors.get(key)));

        // Q.61
        germanText = "Ich weiß, dass ich an der Geometrie "
                + "das Glück zuerst kennengelernt habe.";

        englishText
                = "I know that in geometry I first became "
                + "acquainted with happiness.";

        firstName = "Rudolf";
        lastName = "Steiner";
        key = this.makeKey(firstName, lastName);
        quotations.add(new Quotation(germanText, englishText, this.authors.get(key)));

        Collections.shuffle(quotations);
    } // QuotationsDB()

    private String makeKey(String firstName, String lastName) {
        return lastName + firstName;
    } // makeKey( firstName, lastName )

    public Quotation getQuotation() {
        return this.quotations.get(this.index);
    } // getQuotation()

    public void cycle() {
        this.index = (this.index + 1) % this.quotations.size();
        if( this.index == 0 ) {
            Collections.shuffle( this.quotations );
        } // if
    } // cycle()
} // QuotationsDB

