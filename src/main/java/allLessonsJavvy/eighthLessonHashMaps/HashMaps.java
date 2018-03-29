package allLessonsJavvy.eighthLessonHashMaps;

import java.util.HashMap;

public class HashMaps {
    public static void main(String[]args) {
        //block0
        HashMap<Integer, String> map = new HashMap<>();
        map.put(23, "Michael");
        map.put(10, "Don");

        System.out.print("block 0 - ");
        System.out.println(map.size());

        //block1
        HashMap<Integer, String> maps = new HashMap<>();
        map.put(1, "Jon");
        map.put(22, "Anna");

        String value = map.get(22);
        System.out.print("block 1 - ");
        System.out.println(value);

        //block2
        HashMap<Integer, String> myHash = new HashMap<>();
        boolean empty = myHash.isEmpty();
        if (empty){
            String s = "HashMap is empty!";
            System.out.print("block 2 - ");
            System.out.println(s);
        }

        //block3
        HashMap<Integer, String> myMap = new HashMap<>();
        myMap.put(10, "Gabriel");
        myMap.put(11, "Graysi");
        myMap.put(20, "jjjjjjjjjjj");

        myMap.remove(20);
        System.out.print("block 3 - ");
        System.out.println(myMap);

        //block4
        HashMap<Integer, String> myHashMap = new HashMap<>();
        myHashMap.put(100, "Samanta");
        myHashMap.put(101, "xxxxxxx");

        myHashMap.put(101, "Derick");
        System.out.print("block 4 - ");
        System.out.println(myHashMap);

        //block5
        HashMap<String, String> members = new HashMap<>();
        members.put("Yoda", "Kuharenko");
        members.put("mk", "Kushnir");
        members.put("xl", "Hui");

        String member = members.get("xl");
        System.out.print("block 5 - ");
        System.out.println(member);
    }
}
