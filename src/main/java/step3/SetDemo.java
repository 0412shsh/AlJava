package step3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {
    public static void main(String[] args) {
//        HashSet<Integer> A = new HashSet<Integer>(); // add할 정수에 대한 데이터타입 지정을 위해 <Integer> 사용
//        A.add(1);
//        A.add(2); // 추가
//        A.add(2); // 추가
//        A.add(2); // 추가 ==> 여러번 추가해도 한번만 출력됨
//        A.add(2);
//        A.add(3);
//
//        Iterator hi = (Iterator)A.iterator(); // A 컨테이너에 있는 요소들을 꺼내 Iterator에 저장하여 출력
//        while(hi.hasNext()){
//            System.out.println(hi.next());
//        }


//        ArrayList<Integer> A = new ArrayList<Integer>(); // add할 정수에 대한 데이터타입 지정을 위해 <Integer> 사용
//        A.add(1);
//        A.add(2); // 추가
//        A.add(2); // 추가
//        A.add(2); // 추가 ==> 여러번 추가해도 한번만 출력됨
//        A.add(2);
//        A.add(3);
//
//        Iterator hi = (Iterator)A.iterator(); // A 컨테이너에 있는 요소들을 꺼내 Iterator에 저장하여 출력
//        while(hi.hasNext()){
//            System.out.println(hi.next());
//        }

        // 집합 = Set
        HashSet<Integer> A = new HashSet<Integer>(); // A : 1,2,3,
        A.add(1);
        A.add(2);
        A.add(3);

        HashSet<Integer> B = new HashSet<Integer>(); // B : 3,4,5,
        B.add(3);
        B.add(4);
        B.add(5);

        HashSet<Integer> C = new HashSet<Integer>(); // C: 1,2
        C.add(1);
        C.add(2);

        System.out.println(A.containsAll(B)); // false
        System.out.println(A.containsAll(C)); // true - A는 C에 대해 부분집합
        
        // A.addAll(B);  (합집합) A와 B를 합쳐 A로 만든다. = A에 B를 더한다 1,2,3,4,5
        // A.retainAll(B);  (교집합) 간직하다. 집합 A에도 있고 집합 B에도 있는 값들만 A에다 담겠다.==> 3
        A.removeAll(B); // (차집합) A집합에 있는 값들을 B에 있는 값들을 뺀다. ==> 3

        Iterator hi = (Iterator)A.iterator(); // A 컨테이너에 있는 요소들을 꺼내 Iterator에 저장하여 출력
        while(hi.hasNext()){
            System.out.println(hi.next());
        }
    }
}
