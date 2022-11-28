import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SongTest
{
    // tests for NAME getter and setter
    // when song name is traditional (capitals, lowercase, and spaces)
    @Test
    void getNameLoveStoryPassed() {
        Song loveStory = new Song("Love Story");
        loveStory.setName("Love Story");
        assertTrue(loveStory.getName().matches("Love Story"));
    }

    // when song name has special characters - ":)"
    @Test
    void getNameGlitterPartyPassed() {
        Song smile = new Song(":)");
        smile.setName(":)");
        assertTrue(smile.getName().matches(":\\)"));
    }

    // when song name has capitals, lowercase, spaces, and commas
    @Test
    void getNameSACWPassed() {
        Song SACW = new Song("So Alright, Cool, Whatever");
        SACW.setName("So Alright, Cool, Whatever");
        assertTrue(SACW.getName().matches("So Alright, Cool, Whatever"));
    }

    // when song name is in kanji
    @Test
    void getNameSunsetRoadPassed() {
        Song sunsetRoad = new Song("サンセット・ロード");
        sunsetRoad.setName("サンセット・ロード");
        assertTrue(sunsetRoad.getName().matches("サンセット・ロード"));
    }



    // tests for LENGTH getter and setter
    // when length is normal (number:number number)
    @Test
    void getLengthSunsetRoadPassed() {
        Song sunsetRoad = new Song("サンセット・ロード", "4:18");
        sunsetRoad.setLength("4:18");
        assertTrue(sunsetRoad.getLength().matches("4:18"));
    }

    // when length is normal, but first num is two digits (two-digit number:number number)
    @Test
    void getLengthOldiePassed() {
        Song oldie = new Song("Oldie", "10:36");
        oldie.setLength("10:36");
        assertTrue(oldie.getLength().matches("10:36"));
    }

    // when length has too many digits
    @Test
    void getLengthDSSMFailed() {
        Song DSSM = new Song("Dream Sweet in Sea Major", "7:00684512");
        DSSM.setLength("7:00684512");
        assertTrue(DSSM.getLength().matches("A song can't be that long!"));
    }

    // when length is empty
    @Test
    void getLengthECGMFailed() {
        Song ECGM = new Song("Existential Crisis in G Major", "");
        ECGM.setLength("");
        assertTrue(ECGM.getLength().matches("A song can't be that long!"));
    }

    // when length is negative
    @Test
    void getLengthSITYWTDFailed() {
        Song SITYWTD = new Song("SWEET \\/ I THOUGHT YOU WANTED TO DANCE", "-9:48");
        SITYWTD.setLength("-9:48");
        assertTrue(SITYWTD.getLength().matches("A song can't be that long!"));
    }



    // tests for GENRE getter and setter
    // when genre is one word ("Genre")
    @Test
    void getGenreDawnPassed ()
    {
        Song dawn = new Song("Dawn (Go Away)");
        dawn.setGenre("Motown");
        assertTrue(dawn.getGenre().matches("Motown"));
    }

    // when genre is two words ("Genre Genre")
    @Test
    void getGenreCHPassed ()
    {
        Song clusterhug = new Song("Clusterhug");
        clusterhug.setGenre("Indie pop");
        assertTrue(clusterhug.getGenre().matches("Indie pop"));
    }

    // when genre is three words ("Genre Genre Genre")
    @Test
    void getGenreGLPassed ()
    {
        Song getLucky = new Song("Get Lucky");
        getLucky.setGenre("Electronic dance music");
        assertTrue(getLucky.getGenre().matches("Electronic dance music"));
    }

    // genre includes a special character
    @Test
    void getGenreTipsyPassed ()
    {
        Song dawn = new Song("Tipsy");
        dawn.setGenre("R&B");
        assertTrue(dawn.getGenre().matches("R&B"));
    }

    // genre is empty
    @Test
    void getGenreLYKFailed ()
    {
        Song lyk = new Song("Letting You Know");
        lyk.setGenre("");
        assertTrue(lyk.getGenre().matches("That's not a real genre!"));
    }



    // tests for RELEASE DATE getter and setter
    // release date is in correct format
    @Test
    void getReleaseDateBonIverPassed ()
    {
        Song boniver = new Song("Bon Iver");
        boniver.setReleaseDate("07/30/2020");
        assertTrue(boniver.getReleaseDate().matches("07/30/2020"));
    }

    // release date is in correct format, testing different month/day/year combination
    @Test
    void getReleaseDateLvrsRockPassed ()
    {
        Song lvrsrock = new Song("Lovers Rock");
        lvrsrock.setReleaseDate("09/05/2014");
        assertTrue(lvrsrock.getReleaseDate().matches("09/05/2014"));
    }

    // release date includes alpha
    @Test
    void getReleaseDateMrsMagicFailed ()
    {
        Song mrsmagic = new Song("Mrs Magic");
        mrsmagic.setReleaseDate("September 27, 2019");
        assertTrue(mrsmagic.getReleaseDate().matches("That's not a real release date!"));
    }

    // release date has too many numbers
    @Test
    void getReleaseDateRememberYouFailed ()
    {
        Song ry = new Song("Remember You");
        ry.setReleaseDate("09/001/20212121");
        assertTrue(ry.getReleaseDate().matches("That's not a real release date!"));
    }

    // release date does not have enough numbers
    @Test
    void getReleaseDatePhilophobiaFailed ()
    {
        Song philophobia = new Song("Philophobia");
        philophobia.setReleaseDate("2020");
        assertTrue(philophobia.getReleaseDate().matches("That's not a real release date!"));
    }

    // release date is empty
    @Test
    void getReleaseDateSGTFailed ()
    {
        Song sillygirl = new Song("Silly Girl");
        sillygirl.setReleaseDate("");
        assertTrue(sillygirl.getReleaseDate().matches("That's not a real release date!"));
    }

} // end tests