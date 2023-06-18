package core;

import java.util.*;
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
        List<String> fullPathList = new ArrayList<>();
        Set<Integer> excludeIndexes = new HashSet<>();
        for (int i = 0; i < pairs.size(); i++) {
            if (i == 0) {
                fullPathList.add(pairs.get(i).getFrom());
                fullPathList.add(pairs.get(i).getTo());
                excludeIndexes.add(i);
                continue;
            }

            for (int j = 0; j < pairs.size(); j++) {
                if (excludeIndexes.contains(j)) {
                    continue;
                }

                Pair currentPair = pairs.get(j);
                String from = currentPair.getFrom();
                String to = currentPair.getTo();

                if (isStart(fullPathList, to)) {
                    fullPathList.add(0, from);
                    excludeIndexes.add(j);
                    continue;
                }

                if (isEnd(fullPathList, from)) {
                    fullPathList.add(to);
                    excludeIndexes.add(j);
                }
            }
        }

        return buildFullPath(fullPathList, pairs);

    }

    private boolean isStart(List<String> fullPathList, String to) {
        return fullPathList.get(0).equalsIgnoreCase(to);
    }

    private boolean isEnd(List<String> fullPathList, String from) {
        return fullPathList.get(fullPathList.size() - 1).equalsIgnoreCase(from);
    }

    private String buildFullPath(List<String> fullPathList, List<Pair> pairs) {
        if (fullPathList.size() == 0) {
            System.out.println("Маршрут не содержит ни одного города");
        }

        if (fullPathList.size() == 2) {
            Set<String> uniqueCities = new HashSet<>();

            for (Pair pair: pairs) {
                String cityFrom = toCapitalizeString(pair.getFrom());
                String cityTo = toCapitalizeString(pair.getTo());
                uniqueCities.add(cityFrom);
                uniqueCities.add(cityTo);
            }

            return "Маршрут имеет разрывы. Список введенных городов: " + uniqueCities.toString().replaceAll(",", "");
        }

        return fullPathList.toString().replaceAll(",", "");
    }

    private String toCapitalizeString(String rawString) {
        if (rawString == null || rawString.length() <= 1) return rawString;
        return rawString.substring(0, 1).toUpperCase() + rawString.substring(1);
    }
}