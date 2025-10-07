package org.lofo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VerseGeneratorTest {

    SongConfiguration config = new SongConfiguration();
    BottleFormatter formatter = new BottleFormatter(config);
    VerseGenerator verseGenerator = new VerseGenerator(config, formatter);

    @Test
    void should_generate_verse_for_single_bottle() {
        String result = verseGenerator.generateVerse(1);

        String expected = """
                1 bottle of beer on the wall, 1 bottle of beer.
                Take one down and pass it around, no more bottles of beer on the wall.
                
                """;

        assertEquals(expected, result);
    }

    @Test
    void should_generate_verse_for_multiple_bottles() {
        String result = verseGenerator.generateVerse(99);

        String expected = """
                99 bottles of beer on the wall, 99 bottles of beer.
                Take one down and pass it around, 98 bottles of beer on the wall.
                
                """;

        assertEquals(expected, result);
    }

    @Test
    void should_generate_final_verse() {
        String result = verseGenerator.generateFinalVerse();

        String expected = """
                No more bottles of beer on the wall, no more bottles of beer.
                Go to the store and buy some more, 99 bottles of beer on the wall.""";

        assertEquals(expected, result);
    }
}