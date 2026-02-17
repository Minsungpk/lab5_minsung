package ca.bcit.comp2522.lab05;

import java.util.*;

import java.awt.print.Book;

/**
 * A BookStore class contains details of books.
 *
 * @author Minsung Park
 * @author Faida
 *
 * @version 1.0
 */
public class BookStore {

    private final String bookstoreName;
    private final List<Novel> novelReferences;

    /**
     * Set value for instance variables.
     *
     * @param bookstoreName name of the bookstore.
     */
    BookStore(final String bookstoreName)
    {
        this.bookstoreName = bookstoreName;
        novelReferences = new ArrayList<>();
        populateNovels();
    }

    /*
     * Add list of books in arrayList.
     */
    private void populateNovels()
    {
        final Object[][] data =
                {
                        {"The Adventures of Augie March", "Saul Bellow", 1953},
                        {"All the King’s Men", "Robert Penn Warren", 1946},
                        {"American Pastoral", "Philip Roth", 1997},
                        {"An American Tragedy", "Theodore Dreiser", 1925},
                        {"Animal Farm", "George Orwell", 1946},
                        {"Appointment in Samarra", "John O'Hara", 1934},
                        {"Are You There God? It's Me, Margaret.", "Judy Blume", 1970},
                        {"The Assistant", "Bernard Malamud", 1957},
                        {"At Swim-Two-Birds", "Flann O'Brien", 1938},
                        {"Atonement", "Ian McEwan", 2002},
                        {"Beloved", "Toni Morrison", 1987},
                        {"The Berlin Stories", "Christopher Isherwood", 1946},
                        {"The Big Sleep", "Raymond Chandler", 1939},
                        {"The Blind Assassin", "Margaret Atwood", 2000},
                        {"Blood Meridian", "Cormac McCarthy", 1986},
                        {"Brideshead Revisited", "Evelyn Waugh", 1946},
                        {"The Bridge of San Luis Rey", "Thornton Wilder", 1927},
                        {"Call It Sleep", "Henry Roth", 1935},
                        {"Catch-22", "Joseph Heller", 1961},
                        {"The Catcher in the Rye", "J.D. Salinger", 1951}

                        // You can paste the rest here the same way
                };

        for(final Object[] row : data)
        {
            novelReferences.add(
                    new Novel(
                            (String) row[0],
                            (String) row[1],
                            (Integer) row[2]
                    )
            );
        }
    }

    /**
     * Prints all titles in UpperCase.
     */
    void printAllTitles(){
        System.out.println("");
    }

    /**
     * Prints all titles that contain the specified parameter.
     *
     * @param title the specific title.
     */
    void printBookTitle(final String title)
    {
        System.out.println("");
    }

    /**
     * Prints all titles in alphabetical order, A-Z.
     */
    void printTitlesInAlphaOrder()
    {

    }

    /**
     * Prints all books for the inputted decade IE 2000s.
     * Print all books titles from 2000 - 2009.
     *
     * @param decade the specified time period.
     */
    void printGroupByDecade(final int decade)
    {

    }

    /**
     * Find the longest title in the bookstore.
     */
    void getLongest()
    {

    }

    /**
     * Return true or false.
     *
     * @param year the year book was written.
     * @return true if the book was written in that year,
     *         false if the book was not written in that year.
     */
    boolean isThereABookWrittenIn(final int year)
    {
        return
    }

    /**
     * Returns the amount of books that contain
     * this word in their title.
     *
     * @param word the specific word to count.
     * @return
     */
    int howManyBooksContain(final String word)
    {
        return
    }

    /**
     * Percentage of the books were written
     * between specified two years(inclusive).
     *
     * @param first the starting year.
     * @param last the ending year.
     * @return
     */
    double whichPercentWrittenBetween(final int first,
                                      final int last )
    {
        return
    }

    /**
     * Returns the oldest book.
     *
     * @return
     */
    String getOldestBook()
    {
        return
    }

    /**
     * Returns a List of all books whose title
     * is this length.
     *
     * @titleLength, the specified length of the title.
     * @return
     */
    String getBooksThisLength(final int titleLength)
    {
        return
    }


    /**
     * main method to call all of the BookStore methods
     * listed above.
     *
     * @param args unused.
     */
    public static void main(final String args[])
    {
        // Contains bookstore object.
        final BookStore bookstore = new BookStore("Classic Novels");
        System.out.println(bookstore.novelReferences.size());
    }

}
