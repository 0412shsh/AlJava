package doItJava_ch12;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList(); // 다이아몬드 연산자 생략

        myList.add("A");
        myList.add("B");
        myList.add("C");

        System.out.println(myList); // 리스트 전체 출력

        myList.add(1,"D"); // 링크드 리스트의 첫 번째 위치에 D추가
        System.out.println(myList);

        myList.addFirst("0"); // 링크드 리스트의 맨 앞에 0 추가
        System.out.println(myList);

        System.out.println(myList.removeLast());
        System.out.println(myList);
    }
}
