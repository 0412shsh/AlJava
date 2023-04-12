package doItJava_ch12;

public class MemberTreeSetTest {
    public static void main(String[] args) {
        MemberTreeSet memberTreeSet = new MemberTreeSet();


        Member memberPark = new Member(1003,"박박");
        Member memberLee = new Member(1001, "이리");
        Member memberSon = new Member(1002,"손숴");

        memberTreeSet.addMember(memberPark);
        memberTreeSet.addMember(memberLee);
        memberTreeSet.addMember(memberSon);
        memberTreeSet.showAllMember();

        Member memberHong = new Member(1003,"홍홍"); // 아이디 중복 회원 추가
        memberTreeSet.addMember(memberHong);
        memberTreeSet.showAllMember();

    }
}
