package collection_map_tasks;

import java.util.*;

public class Map_SortByValues {

    /*
        Write a method that can sort the map by values
     */

    public static Map<String, Integer> sortByValue(Map<String, Integer> map) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());

        map = new LinkedHashMap<>();

        for (Map.Entry<String, Integer> each : list) {
            map.put(each.getKey(), each.getValue());
        }

        return map;

    }

    public static void main(String[] args) {

        Map<String, Integer> obj = new HashMap<>();
        Map<String, Integer> maps = new HashMap<>();
        obj.put("abc", 4);
        obj.put("dcd", 3);
        obj.put("qaz", 2);
        obj.put("tyt", 7);
        obj.put("qwe", 9);
        maps = Map_SortByValues.sortByValue(obj);
        System.out.println(maps);
    }

}
