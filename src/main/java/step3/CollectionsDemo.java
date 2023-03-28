package step3;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Computer implements Comparable { // 컴퓨터 클래스
    int serial; // 시리얼 넘버
    String owner; // 소유자
    Computer (int serial, String owner){ // 시리얼 넘버, 소유자를 인자로 받음
        this.serial = serial; // 인스턴스 변수의 시리얼이 된다.
        this.owner = owner; // 인스턴스 변수의 오너가 된다.
    }
    public int compareTo(Object o){ // 양수 0 음수 0을 리턴하는 것은 Computer객체와 현재의 객체가 같다.
        // 현재의 객체와 인자로 받아지는 객체가 있을 때 현재의 객체가 크다면 양수 (현재-인자)
        // 현재의 객체와 인자로 받아지는 객체가 있을 때 현재의 객체가 작으면 음수 (현재-인자)
        return this.serial -((Computer)o).serial;
    }
    public String toString(){
        return serial + " " +owner;
    }
}

public class CollectionsDemo {
    public static void main(String[] args) {
        List<Computer> computers = new ArrayList<Computer>();
        computers.add(new Computer(500,"SH"));
        computers.add(new Computer(412,"SHSH"));
        computers.add(new Computer(1112,"SHSHSH"));
        Iterator i = computers.iterator();
        System.out.println(" ===== before ===== ");
        while(i.hasNext()) {
            System.out.println(i.next());
        } // while문을 이용해서 값 출력
        Collections.sort(computers); // 리스트타입의 데이터를 Collections에 인자로 넘겨 sort 정렬 ==> comepareTo가 타게 된다.
        System.out.println("\nafter");
        i = computers.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
