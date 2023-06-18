package core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
        String fullPath = "";
        for (Pair pair : pairs){
            fullPath = fullPath +" "+ pair.getFrom() +" "+ pair.getTo();
        }
        String modifiedText = Arrays.stream(fullPath.split(" "))
                .distinct()
                .collect(Collectors.joining(" "));
        return modifiedText;
    }
}