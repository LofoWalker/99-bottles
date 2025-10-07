package org.lofo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BottleFormatterTest {

    BottleFormatter formatter = new BottleFormatter(new SongConfiguration());

    @Test
    void should_capitalize_string() {
        assertEquals("One", formatter.capitalize("one"));
    }

    @Test
    public void should_return_string_as_it_if_empty() {
        assertEquals("", formatter.capitalize(""));
    }

    @Test
    public void should_return_string_as_it_if_null() {
        assertNull(formatter.capitalize(null));
    }

    @Test
    public void should_return_no_more_bottle_phrase_if_count_is_zero() {
        assertEquals("no more bottles of beer", formatter.bottleQuantity(0));
    }

    @Test
    public void should_return_bottle_phrase_if_count_is_not_zero() {
        assertEquals("99 bottles of beer", formatter.bottleQuantity(99));
    }

    @Test
    public void should_return_bottle_phrase_with_on_the_wall_if_count_is_not_zero() {
        assertEquals("99 bottles of beer on the wall", formatter.bottlePhrase(99));
    }

    @Test
    public void should_return_single_bottle_phrase_with_on_the_wall_if_count_is_one() {
        assertEquals("1 bottle of beer on the wall", formatter.bottlePhrase(1));
    }
}