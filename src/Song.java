public class Song
{
    // instance vars
    private String name;
    private String length;
    private String genre;
    private String releaseDate;

    public Song (String name)
    {
        setName(name);
    } // end Song constructor for name only

    public Song (String name, String length)
    {
        setName(name);
        setLength(length);
    } // end Song constructor for name and length

    public Song (String name, String length, String genre, String releaseDate)
    {
        setName(name);
        setLength(length);
        setGenre(genre);
        setReleaseDate(releaseDate);
    } // end Song constructor for name, genre, and release date

    public void setName (String name)
    {
        if (!name.matches(".*"))
        {
            this.name = "Wrong format!";
        }
        else
        {
            this.name = name;
        }
    } // end setName

    public void setLength(String length)
    {
        if (!length.matches("[0-9]+[:punct:][0-9][0-9]"))
        {
            this.length = "A song can't be that long!";
        }
        else
        {
            this.length = length;
        }
    } // end setLength

    public void setGenre(String genre)
    {
        if (!genre.matches("[:upper:]*"))
        {
            this.genre = genre;
        }
        else
        {
            this.genre = "That's not a real genre!";
        }
    } // end setGenre

    public void setReleaseDate(String releaseDate)
    {
        if (releaseDate.matches("^(0[1-9]|1[012])[/](0[1-9]|[12][0-9]|3[01])[/](19|20)\\d\\d$"))
        {
            this.releaseDate = releaseDate;
        }
        else
        {
            this.releaseDate = "That's not a real release date!";
        }
    } // end setReleaseDate

    public String getName ()
    {
        return name;
    } // end getName

    public String getLength()
    {
        return length;
    } // end getLength

    public String getGenre()
    {
        return genre;
    } // end getGenre

    public String getReleaseDate()
    {
        return releaseDate;
    } // end getReleaseDate

} // end Song class
