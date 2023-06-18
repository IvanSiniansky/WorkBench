package core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PathManager {

    private final List<Pair> pairs = new ArrayList<>();

    public void addPair(Pair pair) {
        this.pairs.add(pair);
    }

    public void reset() {
        this.pairs.clear();
    }

    public String buildFullPath() {
        //todo Здесь будет реализован алгоритм для получения итогового маршрута

        return "";
    }
}