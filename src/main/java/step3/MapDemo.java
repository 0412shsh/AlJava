package step3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<String,Integer> a = new HashMap<String,Integer>(); // 제네릭이 두개 ~! 저장될 정보가 2개임 key-value
        a.put("one",1); // put(key,value) : map에서만 사용할 수 있는 메서드
        a.put("two",2);
        a.put("three",3);
        a.put("four",4);
        System.out.println(a.get("one")); // get(key) ==> key값을 통해 값을 가져온다.
        System.out.println(a.get("two"));
        System.out.println(a.get("three"));

        // 맵에 저장된 데이터들을 열거해서 반복처리 작업할거!
        iteratorUsingForEach(a);
        iteratorUsingIterator(a);

    }


    // Set에 Map.entry로 만들고 Iterator를 통해서 원하는 값들을 꺼낸다.

    private static void iteratorUsingForEach(HashMap map) {
        Set<Map.Entry<String,Integer>> entries = map.entrySet(); // Map을 Set에 담아줌
        for (Map.Entry<String,Integer> entry : entries) {
            System.out.println(entry.getKey() + " "+ entry.getValue());
        }
    }

    // Map은 Iterator 기능을 갖고 있지 않기 때문에, Map을 Set으로 만들고(==> Map 하나하나가 Map.entry 됨)
    private static void iteratorUsingIterator(HashMap map) {
        Set<Map.Entry<String,Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String,Integer>> i = entries.iterator();
        while(i.hasNext()) {
            Map.Entry<String,Integer> entry = i.next();
            System.out.println(entry.getKey() + " "+ entry.getValue());
        }
    }
}
