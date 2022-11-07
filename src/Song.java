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
    }

    public void setName (String name)
    {
        if (!name.matches("[A-Za-z]"))
        {
            // System.out.println("NOPE!");
            this.name = "Wrong format";
        }
        else
        {
            this.name = name;
        }
    }

    public String getName ()
    {
        return name;
    }

}
