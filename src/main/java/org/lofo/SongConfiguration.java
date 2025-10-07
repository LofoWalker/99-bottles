package org.lofo;

public record SongConfiguration(int maxBottles, int minBottles, String beverage) {
    public SongConfiguration() {
        this(99, 0, "beer");
    }
}