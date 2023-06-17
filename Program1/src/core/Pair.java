package core;

public class Pair {

    private final String from;
    private final String to;

    public Pair(String rawPair) {

        String[] massiv = rawPair.split(" ");

        this.from = massiv[0];
        this.to = massiv[1];
    }
    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }
}