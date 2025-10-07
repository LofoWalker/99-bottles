package org.lofo;

public record VerseGenerator(SongConfiguration config, BottleFormatter formatter) {

    public String generateVerse(int bottleCount) {
        return formatter.capitalize(formatter.bottlePhrase(bottleCount))
                + ", " + formatter.bottleQuantity(bottleCount) + ".\n"
                + "Take one down and pass it around, "
                + formatter.bottlePhrase(bottleCount - 1) + ".\n\n";
    }

    public String generateFinalVerse() {
        return formatter.capitalize(formatter.bottlePhrase(config.minBottles()))
                + ", " + formatter.bottleQuantity(config.minBottles()) + ".\n"
                + "Go to the store and buy some more, "
                + formatter.bottlePhrase(config.maxBottles()) + ".";
    }
}