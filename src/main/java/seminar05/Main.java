package seminar05;

import com.sun.source.tree.Tree;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        HashMap<Integer, String> hashMap = new HashMap<>();
//
//        for (int i = 0; i < 10; i++) {
//            hashMap.put(i, String.valueOf(i));
////            не позволяет перезаписывать
//            hashMap.putIfAbsent(i, String.valueOf(i) + "!");
//        }
//
////        System.out.println(hashMap);
////        hashMap.forEach((k, v) -> System.out.print(k + "=" + v));
//
//        Set<Integer> keys = hashMap.keySet();
////        for (Integer k : keys) {
//            System.out.print(hashMap.get(k) + ", ");
//        }
//        System.out.println();
//
//        Iterator<Integer> iterator = hashMap.keySet().iterator();
//        while (iterator.hasNext()) {
//            String v = hashMap.get(iterator.next());
//            System.out.print(v + ", ");
//            iterator.remove();
//        }
//        System.out.println();

//        hashMap.remove(21);

//        for (int i = 0; i < keys.size(); i++) {
//            if (i < keys.size() - 1)
//                System.out.print(hashMap.get(keys.toArray()[i]) + ", ");
//            else System.out.print(hashMap.get(keys.toArray()[i]) + ".");
//        }
//        System.out.println();

//        System.out.println(hashMap);
//        Collection<String> v = hashMap.values();
//        Set<Map.Entry<Integer, String>> e = hashMap.entrySet();
//        System.out.println(e);

//        System.out.println(hashMap.getOrDefault(20, "Key is not find"));
//        System.out.println(hashMap.getOrDefault(20, hashMap.put(20, "20")));
//        System.out.println(hashMap.containsKey(20));
//        hashMap.replace(1, "2");
//        System.out.println(hashMap);
//        hashMap.compute(3, (k, v) -> v += "!");
//        hashMap.compute(3, (k, v) -> (v += "!"));
////        только если есть
//        hashMap.computeIfPresent(21, (k, v) -> (v += "!"));
////        только если нету
//        hashMap.computeIfAbsent(22, v -> "22");
//        hashMap.replaceAll((k, v) -> v += "!");
//
//        System.out.println(hashMap);

//        HashMap<String, String[]> map = new HashMap<>();
//        map.put("1", new String[]{"Каждый", "охотник"});
//        map.put("2", new String[]{"желает", "знать"});
//        map.put("1", new String[]{map.get("1")[0], map.get("1")[1] + "!"});
//
//        Set<String> keys = map.keySet();
//        for (String k : keys) {
//            for (String i : map.get(k)) {
//                System.out.println(i);
//            }
//        }
//        System.out.println();
//
//        HashMap<String, Text> map1 = new HashMap<>();
//        map1.put("1", new Text("Каждый", "охотник"));
//        map1.put("2", new Text("желает", "знать"));
//        map1.compute("1", (k, v) -> new Text(v.p1 += "!", v.p2));
//
//        for (Text v : map1.values()) {
//            System.out.println(v.p1);
//            System.out.println(v.p2);
//        }
//
//        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();

//        TreeMap сортирует ключи
//        TreeMap<String, String> treeMap = new TreeMap<>();
//        treeMap.put("Б", "1");
//        treeMap.put("Г", "1");
//        treeMap.put("В", "1");
//        treeMap.put("Д", "1");
//        treeMap.put("А", "1");
//        System.out.println(treeMap);
//
//        TreeMap<String, String> treeMap1 = new TreeMap<>();
//        treeMap1.put("5", "1");
//        treeMap1.put("2", "1");
//        treeMap1.put("4", "1");
//        treeMap1.put("3", "1");
//        treeMap1.put("1", "1");
//        System.out.println(treeMap1);
//        System.out.println(treeMap1.headMap("2", true));
//        System.out.println(treeMap1.tailMap("2", true));

        ArrayList<String> age = new ArrayList<>();
        age.add("4");
        age.add("2");
        age.add("1");
        age.add("3");

        ArrayList<String> gender = new ArrayList<>();
        gender.add("А");
        gender.add("Б");
        gender.add("В");
        gender.add("Г");

        LinkedList<Integer> indexes = new LinkedList<>();

        TreeMap<String, Integer> treeMap2 = new TreeMap<>();
        Integer[] cnt = new Integer[]{0};
        age.forEach(n -> treeMap2.put(n, cnt[0]++));
        System.out.println(treeMap2);
        System.out.println(indexes);
        treeMap2.forEach((k, v) -> indexes.add(v));
        System.out.println(indexes);
//        System.out.println(treeMap2);
//        treeMap2.clear();
//        indexes.forEach(n -> treeMap2.put(gender.get(n), n));
//        System.out.println(treeMap2);
//        indexes.clear();
//        treeMap2.forEach((k, v) -> indexes.add(v));
//        treeMap2.clear();
//        System.out.println(indexes);

    }

    static class Text {
        String p1, p2;

        public Text(String p1, String p2) {
            this.p2 = p2;
            this.p1 = p1;
        }
    }
}
