import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SongTest
{
    @Test
    void getNameTSLoveStoryPassed() {
        Song loveStory = new Song("Love Story");
        loveStory.setName("Love Story");
        assertTrue(loveStory.getName().matches("Love Story"));
    }
} // end tests