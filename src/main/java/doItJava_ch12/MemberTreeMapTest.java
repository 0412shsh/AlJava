package doItJava_ch12;

public class MemberTreeMapTest {

    public static void main(String[] args) {
        MemberTreeMap memberTreeMap = new MemberTreeMap();

        Member memberPark = new Member(1003, "박박");
        Member memberLee = new Member(1001,"이리");
        Member memberHong = new Member(1004,"홍홍");
        Member memberSon = new Member(1002,"손숴");

        memberTreeMap.addMember(memberPark);
        memberTreeMap.addMember(memberLee);
        memberTreeMap.addMember(memberHong);
        memberTreeMap.addMember(memberSon);
        memberTreeMap.showAllMember();

        memberTreeMap.removeMember(1004);
        memberTreeMap.showAllMember();
    }
}
