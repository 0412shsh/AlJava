package doItJava_ch12;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {
    private ArrayList<Member> arrayList; // 멤버변수 ArrayList 선언 ==> 사용하기 위해 초기화 필요

    public MemberArrayList() {
        arrayList = new ArrayList<Member>();
    } // 생성자를 이용하여 초기화 수행 --> arrayList 멤버변수를 초기화 : arrayList 멤버변수는 Member객체를 저장하는 ArrayList로 초기화
    // 이렇게함으로써 해당 클래스를 사용하는 다른 코드에서 arrayList 멤버변수를 사용하기 전에 반드시 초기화를 수행해야하는 번거로움을 없앴다.
    // 초기화 과정을 생성자에서 처리함으로써, 해당 클래스를 사용할 때 객체 생성 후에 바로 사용할 수 있게 합니다.

    public void addMember(Member member){
        arrayList.add(member);
    } // ArrayList에 회원을 추가하는 메서드

    public boolean removeMember(int memberId){
//        for (int i = 0; i < arrayList.size(); i++) {
//            Member member = arrayList.get(i); // get() 메서드로 회원을 순차적으로 가져옴
//            int tempId = member.getMemberId();
//            if(tempId == memberId){ // 회원 아이디가 매개변수와 일치하면
//                arrayList.remove(i); // 해당 회원을 삭제
//                return true;
//            }
//        }
//        System.out.println(memberId+"가 존재하지 않습니다. "); // 반복문이 끝날때까지 해당 아이디를 찾지 못하는 경우
//        return false;


        Iterator<Member> ir = arrayList.iterator(); // Iterator 반환
        while (ir.hasNext()) { // 요소가 있는 동안
            Member member = ir.next(); // 다음 회원을 반환 받음
            int tempId = member.getMemberId();
            if(tempId == memberId) { // 매개변수와 회원 아이디가 일치하다면
                arrayList.remove(member); // 해당 회원 삭제
                return true;
            }

        }
        System.out.println(memberId+"가 존재하지 않습니다. ");
        return false;
    }
    public void showAllMember(){ // 전체 회원을 출력하는 메서드
        for (Member member : arrayList
             ) {
            System.out.println(member);

        }
        System.out.println();
    }
}
