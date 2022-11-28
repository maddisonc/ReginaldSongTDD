public class Main
{
    public static void main(String[] args)
    {
        Song bonIver = new Song("Bon Iver", "3:16", "Alternative/Indie", "07/30/2020");
        Song loversRock = new Song("Lovers Rock", "3:34", "Alternative Pop", "09/05/2014");
        Song helloWorld = new Song("Hello, World", "1:55", "Electronic", "03/31/2018");
        Song oldie = new Song("Oldie", "10:36", "Rap", "03/20/2012");

        Song[] testPlaylist = new Song[4];
        testPlaylist[0] = bonIver;
        testPlaylist[1] = loversRock;
        testPlaylist[2] = helloWorld;
        testPlaylist[3] = oldie;

        for (Song i: testPlaylist)
        {
            System.out.println(i.getName()+" (" + i.getLength()+")" + " is longer than " + getLongerThan(i) + ".");
        } // prints out test songs and what they are longer than

    } // end main method

    public static String getLongerThan(Song song)
    {
        String[] songLengths = {"\"The Shortest Song in the World\" by Duncan Reid and the Big Heads (0:02)", "\"All Too Well\" by Taylor Swift (10:13)"};
        if (!song.getLength().matches("[0-9]{2}+[:punct:][0-9][0-9]"))
        {
            return songLengths[0];
        }
        return songLengths[1];
    } // end getLongerThan method

} // end main class