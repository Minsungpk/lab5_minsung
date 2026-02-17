package ca.bcit.comp2522.lab05;

/**
 * A Novel class, containing Novel information.
 *
 * @author Minsung Park
 * @author Faida
 *
 * @version 1.0
 */
public class Novel {

    private final String title;
    private final String authorName;
    private final int yearPublished;

    /**
     * A constructor initializes instance variables.
     *
     * @param title title of the book.
     * @param authorName name of the author.
     * @param yearPublished year the novel was published.
     */
    Novel(final String title,
          final String authorName,
          final int yearPublished)
    {
        this.title = title;
        this.authorName = authorName;
        this.yearPublished = yearPublished;
    }

    /**
     * Gets title.
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * Gets authorName.
     */
    public String getAuthorName()
    {
        return authorName;
    }

    /**
     * Gets yearPublished.
     */
    public int getYearPublished()
    {
        return yearPublished;
    }
}
