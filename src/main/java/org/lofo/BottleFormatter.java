package org.lofo;

public record BottleFormatter(SongConfiguration config) {
    private static final String ON_THE_WALL = " on the wall";

    public String bottlePhrase(int count) {
        return bottleQuantity(count) + ON_THE_WALL;
    }

    public String bottleQuantity(int count) {
        if (count == config.minBottles()) {
            return "no more bottles of " + config.beverage();
        }
        return count + " " + pluralize(count) + " of " + config.beverage();
    }

    public String capitalize(String text) {
        if (text == null || text.isEmpty()) {
            return text;
        }
        return Character.toUpperCase(text.charAt(0)) + text.substring(1);
    }

    private String pluralize(int count) {
        return count == 1 ? "bottle" : "bottles";
    }
}