package doItJava_ch12;

public class Member {
    private int memberId; // 회원 아이디
    private String memberName; // 회원 이름

    public Member(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public String toString() {
        return "Member{" +
                "회원님의 아이디는 " + memberId +
                ", 회원님의 이름은'" + memberName + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return memberId; // hashCode() 메서드가 회원 아이디를 반환하도록 재정의
    }

    @Override
    public boolean equals(Object obj) {
         if(obj instanceof Member) {
             Member member = (Member) obj;
             if(this.memberId == member.getMemberId()) return true; // 매개변수로 받은 회원 아이디가 자신의 회원 아이디와 같다면 true 반환
              else return false;
         }
         return false;
    }
}
