package ca.bcit.comp2522.lab05;

/**
 * Represents a Novel with a title, author name, and year published.
 * This class is immutable because all instance variables are final
 * and can only be set through the constructor.
 *
 * @author Minsung Park
 * @author Faida Espiritu
 *
 * @version 1.0
 */
public class Novel
{

    private final String title;
    private final String authorName;
    private final int yearPublished;

    /**
     * Constructs a Novel object with the specified title,
     * author name, and year published.
     *
     * @param title         the title of the novel
     * @param authorName    the name of the author
     * @param yearPublished the year the novel was published
     */
    public Novel(final String title,
                 final String authorName,
                 final int yearPublished)
    {
        this.title = title;
        this.authorName = authorName;
        this.yearPublished = yearPublished;
    }

    /**
     * Returns the title of this novel.
     *
     * @return the novel's title
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * Returns the author name of this novel.
     *
     * @return the author's name
     */
    public String getAuthorName()
    {
        return authorName;
    }

    /**
     * Returns the year this novel was published.
     *
     * @return the year published
     */
    public int getYearPublished()
    {
        return yearPublished;
    }
}
