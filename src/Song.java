public class Song
{
    private String name;
    private String length;
    private String tempo;
    private String genre;
    private String releaseDate;

    public Song (String name)
    {
        setName(name);
        setLength(length);
    } // end Song constructor for name only

    public Song (String name, String length)
    {
        setName(name);
        setLength(length);
    } // end Song constructor for name and length

    public void setName (String name)
    {
        if (!name.matches(".*"))
        {
            // System.out.println("NOPE!");
            this.name = "Wrong format!";
        }
        else
        {
            this.name = name;
        }
    } // end setName

    public void setLength(String length)
    {
        this.length = length;
    } // end setLength

    public String getName ()
    {
        return name;
    } // end getName

    public String getLength()
    {
        return length;
    } // end getLength

} // end Song class
