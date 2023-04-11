package doItJava_ch12;

public class MemberHashSetTest {
    public static void main(String[] args) {
        MemberHashSet ms = new MemberHashSet();

        // Member 생성 ~!
        Member memberLee = new Member(1001,"이지");
        Member memberSon = new Member(1002,"손숴");
        Member memberPark = new Member(1003,"박박");

        ms.addMember(memberLee);
        ms.addMember(memberSon);
        ms.addMember(memberPark);
        ms.showAllMember(); // 모든 멤버 출력

        Member memberHong = new Member(1003,"홍"); // 아이디 중복 회원 추가
        ms.addMember(memberHong);
        ms.showAllMember();



    }
}
