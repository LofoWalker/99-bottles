package org.lofo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.lofo.fixture.SongFixture.EXPECTED_SONG;

public class WriteSongTest {

    @Test
    public void should_write_song() {
        WriteSong writeSong = new WriteSong();
        String actual = writeSong.writeSong();
        assertEquals(EXPECTED_SONG, actual);
    }
}