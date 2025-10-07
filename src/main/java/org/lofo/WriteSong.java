package org.lofo;

public class WriteSong {
    private final SongConfiguration config;
    private final VerseGenerator verseGenerator;

    public WriteSong() {
        this.config = new SongConfiguration();
        BottleFormatter formatter = new BottleFormatter(config);
        this.verseGenerator = new VerseGenerator(config, formatter);
    }

    public String writeSong() {
        StringBuilder song = new StringBuilder();

        for (int i = config.maxBottles(); i > config.minBottles(); i--) {
            song.append(verseGenerator.generateVerse(i));
        }

        song.append(verseGenerator.generateFinalVerse());

        return song.toString();
    }
}