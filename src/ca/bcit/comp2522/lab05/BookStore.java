package ca.bcit.comp2522.lab05;

import java.util.*;

import java.awt.print.Book;

/**
 * Represents a BookStore that contains details of books.
 * The bookstore can store and manage a collection of books.
 *
 * @author Minsung Park
 * @author Faida Espiritu
 *
 * @version 1.0
 */
public class BookStore
{

    private final String bookstoreName;
    private final List<Novel> novelReferences;

    /**
     * Constructs a BookStore with the given name and
     * initializes the list of novels.
     *
     * @param bookstoreName the name of the bookstore
     */
    public BookStore(final String bookstoreName)
    {
        this.bookstoreName = bookstoreName;

        novelReferences = new ArrayList<>();

        populateNovels();
    }

    /**
     * Adds all predefined novels to the ArrayList.
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
                        {"The Catcher in the Rye", "J.D. Salinger", 1951},
                        {"A Clockwork Orange", "Anthony Burgess", 1963},
                        {"The Confessions of Nat Turner", "William Styron", 1967},
                        {"The Corrections", "Jonathan Franzen", 2001},
                        {"The Crying of Lot 49", "Thomas Pynchon", 1966},

                        {"A Dance to the Music of Time", "Anthony Powell", 1951},
                        {"The Day of the Locust", "Nathanael West", 1939},
                        {"Death Comes for the Archbishop", "Willa Cather", 1927},
                        {"A Death in the Family", "James Agee", 1958},
                        {"The Death of the Heart", "Elizabeth Bowen", 1958},
                        {"Deliverance", "James Dickey", 1970},
                        {"Dog Soldiers", "Robert Stone", 1974},
                        {"Falconer", "John Cheever", 1977},
                        {"The French Lieutenant's Woman", "John Fowles", 1969},
                        {"The Golden Notebook", "Doris Lessing", 1962},
                        {"Go Tell It on the Mountain", "James Baldwin", 1953},
                        {"Gone with the Wind", "Margaret Mitchell", 1936},
                        {"The Grapes of Wrath", "John Steinbeck", 1939},
                        {"Gravity's Rainbow", "Thomas Pynchon", 1973},
                        {"The Great Gatsby", "F. Scott Fitzgerald", 1925},
                        {"A Handful of Dust", "Evelyn Waugh", 1934},
                        {"The Heart Is a Lonely Hunter", "Carson McCullers", 1940},
                        {"The Heart of the Matter", "Graham Greene", 1948},
                        {"Herzog", "Saul Bellow", 1964},
                        {"Housekeeping", "Marilynne Robinson", 1981},
                        {"A House for Mr. Biswas", "V.S. Naipaul", 1962},
                        {"I, Claudius", "Robert Graves", 1934},
                        {"Infinite Jest", "David Foster Wallace", 1996},
                        {"Invisible Man", "Ralph Ellison", 1952},
                        {"Light in August", "William Faulkner", 1932},
                        {"The Lion, The Witch and the Wardrobe", "C.S. Lewis", 1950},
                        {"Lolita", "Vladimir Nabokov", 1955},
                        {"Lord of the Flies", "William Golding", 1954},
                        {"The Lord of the Rings", "J.R.R. Tolkien", 1954},
                        {"Loving", "Henry Green", 1945},

                        {"Lucky Jim", "Kingsley Amis", 1954},
                        {"The Man Who Loved Children", "Christina Stead", 1940},
                        {"Midnight's Children", "Salman Rushdie", 1981},
                        {"Money", "Martin Amis", 1984},
                        {"The Moviegoer", "Walker Percy", 1961},
                        {"Mrs. Dalloway", "Virginia Woolf", 1925},
                        {"Naked Lunch", "William Burroughs", 1959},
                        {"Native Son", "Richard Wright", 1940},
                        {"Neuromancer", "William Gibson", 1984},
                        {"Never Let Me Go", "Kazuo Ishiguro", 2005},
                        {"1984", "George Orwell", 1948},
                        {"On the Road", "Jack Kerouac", 1957},
                        {"One Flew Over the Cuckoo's Nest", "Ken Kesey", 1962},
                        {"The Painted Bird", "Jerzy Kosinski", 1965},
                        {"Pale Fire", "Vladimir Nabokov", 1962},
                        {"A Passage to India", "E.M. Forster", 1924},
                        {"Play It as It Lays", "Joan Didion", 1970},
                        {"Portnoy's Complaint", "Philip Roth", 1969},
                        {"Possession", "A.S. Byatt", 1990},
                        {"The Power and the Glory", "Graham Greene", 1939},
                        {"The Prime of Miss Jean Brodie", "Muriel Spark", 1961},
                        {"Rabbit, Run", "John Updike", 1960},
                        {"Ragtime", "E.L. Doctorow", 1975},
                        {"The Recognitions", "William Gaddis", 1955},
                        {"Red Harvest", "Dashiell Hammett", 1929},
                        {"Revolutionary Road", "Richard Yates", 1961},
                        {"The Sheltering Sky", "Paul Bowles", 1949},
                        {"Slaughterhouse-Five", "Kurt Vonnegut", 1969},
                        {"Snow Crash", "Neal Stephenson", 1992},
                        {"The Sot-Weed Factor", "John Barth", 1960},
                        {"The Sound and the Fury", "William Faulkner", 1929},

                        {"The Sportswriter", "Richard Ford", 1986},
                        {"The Spy Who Came in from the Cold", "John le Carré", 1964},
                        {"The Sun Also Rises", "Ernest Hemingway", 1926},
                        {"Their Eyes Were Watching God", "Zora Neale Hurston", 1937},
                        {"Things Fall Apart", "Chinua Achebe", 1959},
                        {"To Kill a Mockingbird", "Harper Lee", 1960},
                        {"To the Lighthouse", "Virginia Woolf", 1929},
                        {"Tropic of Cancer", "Henry Miller", 1934},
                        {"Ubik", "Philip K. Dick", 1969},
                        {"Under the Net", "Iris Murdoch", 1954},
                        {"Under the Volcano", "Malcolm Lowry", 1947},
                        {"Watchmen", "Alan Moore and Dave Gibbons", 1986},
                        {"White Noise", "Don DeLillo", 1985},
                        {"White Teeth", "Zadie Smith", 2000},
                        {"Wide Sargasso Sea", "Jean Rhys", 1966}

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
     * Prints all titles in uppercase.
     */
    public void printAllTitles()
    {
        // Iterate through each Novel object in novelReferences
        for (final Novel novel: novelReferences)
        {
            System.out.println(novel.getTitle().toUpperCase());
        }
    }

    /**
     * Prints all titles that contain the specified parameter.
     *
     * @param title the specific title
     */
    public void printBookTitle(final String title)
    {
        // Ignores case of the argument
        for (final Novel novel : novelReferences)
        {
            if (novel.getTitle().toLowerCase().contains(title.toLowerCase()))
            {
                System.out.println(novel.getTitle());
            }
        }
    }

    /**
     * Prints all titles in alphabetical order, A-Z.
     */
    public void printTitlesInAlphaOrder()
    {

    }

    /**
     * Prints all books for the inputted decade IE 2000s.
     * Print all books titles from 2000 to 2009.
     *
     * @param decade the specified time period
     */
    public void printGroupByDecade(final int decade)
    {

    }

    /**
     * Finds the longest title in the bookstore.
     *
     * @return longest book title
     */
    public String getLongest()
    {
        return
    }

    /**
     * Checks if a book was written in the given year.
     *
     * @param year the year book was written
     * @return true if the book was written in that year,
     *         false if the book was not written in that year
     */
    public boolean isThereABookWrittenIn(final int year)
    {
        return
    }

    /**
     * Returns the amount of books that contain
     * this word in their title.
     *
     * @param word the specific word to count
     * @return the number of matching titles
     */
    public int howManyBooksContain(final String word)
    {
        return
    }

    /**
     * Percentage of the books were written
     * between specified two years(inclusive).
     *
     * @param first the starting year
     * @param last the ending year
     * @return the percentage of books between the years
     */
    public int whichPercentWrittenBetween(final int first,
                                          final int last )
    {
        return
    }

    /**
     * Returns the oldest published book.
     *
     * @return the oldest book
     */
    public Novel getOldestBook()
    {
        return
    }

    /**
     * Returns a List of all books whose title
     * is this length.
     *
     * @param titleLength the required title length
     * @return a list of matching novels
     */
    public List<Novel> getBooksThisLength(final int titleLength)
    {
        return
    }


    /**
     * The main method to call all of the BookStore methods
     * listed above.
     *
     * @param args unused
     */
    public static void main(final String[] args)
    {

        final BookStore bookstore;
        final Novel oldest;
        final List<Novel> fifteenCharTitles;

        bookstore = new BookStore("Classic Novels Collection");
        System.out.println("All Titles in UPPERCASE:");
        bookstore.printAllTitles();

        System.out.println("\nBook Titles Containing 'the':");
        bookstore.printBookTitle("the");

        System.out.println("\nAll Titles in Alphabetical Order:");
        bookstore.printTitlesInAlphaOrder();

        System.out.println("\nBooks from the 2000s:");
        bookstore.printGroupByDecade(2000);

        System.out.println("\nLongest Book Title:");
        bookstore.getLongest();

        System.out.println("\nIs there a book written in 1950?");
        System.out.println(bookstore.isThereABookWrittenIn(1950));

        System.out.println("\nHow many books contain 'heart'?");
        System.out.println(bookstore.howManyBooksContain("heart"));

        System.out.println("\nPercentage of books written between 1940 and 1950:");
        System.out.println(bookstore.whichPercentWrittenBetween(1940, 1950) + "%");

        System.out.println("\nOldest book:");
        oldest = bookstore.getOldestBook();
        System.out.println(oldest.getTitle() + " by " + oldest.getAuthorName() + ", " +
                oldest.getYearPublished());

        System.out.println("\nBooks with titles 15 characters long:");
        fifteenCharTitles = bookstore.getBooksThisLength(15);
        fifteenCharTitles.forEach(novel -> System.out.println(novel.getTitle()));
    }

}
