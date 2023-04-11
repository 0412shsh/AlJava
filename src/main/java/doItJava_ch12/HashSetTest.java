package doItJava_ch12;

import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add(new String("임"));
        hashSet.add(new String("박"));
        hashSet.add(new String("홍"));
        hashSet.add(new String("강"));
        hashSet.add(new String("강"));

        System.out.println(hashSet);

    }
}
