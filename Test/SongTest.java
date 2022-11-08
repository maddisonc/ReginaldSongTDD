import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SongTest
{
    // tests for NAME getters and setters
    // when song name is traditional (capitals, lowercase, and spaces)
    @Test
    void getNameTSLoveStoryPassed() {
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


    // tests for LENGTH getters and setters
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


} // end tests