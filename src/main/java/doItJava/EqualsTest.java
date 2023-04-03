package doItJava;

import java.sql.Struct;

class Student {
    int studentId;
    String studentName;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "학번=" + studentId +
                ", 이름='" + studentName + '\'' +
                '}';
    }
    // equals는 원래 인스턴스의 주소값을 비교하지만 재정의를 하여 논리값(문자열값)이 같을 경우 true로 반환되게 할 있다.
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student) { // 매개변수로 전달된 객체의 타입이 Stduent형인지 확인
            Student std = (Student)obj;
            if(this.studentId == std.studentId) return true; // this의 학번과 매개변수 학번이 같을 경우 true를 반환
                else return false;
        }
        return false;

    }

    @Override
    public int hashCode() {
        return studentId;
    } // 해시 코드 값으로 학번을 반환하도록 메서드 재정의 !!
}

public class EqualsTest {
    public static void main(String[] args) {
        Student studentLee = new Student(100,"우연");
        Student studentLee2 = studentLee; // 주소복사
        Student studentWoo = new Student(100,"우연");

        // 동일한 주소의 두 인스턴스 비교
        if(studentLee == studentLee2) { // == 기호로 비교
            System.out.println("studnetLee와 studentLee2 의 주소는 같습니다.");
        } else System.out.println("studnetLee와 studentLee2 의 주소는 다릅니다.");

        if(studentLee.equals(studentLee2)) { //equeal로 비교
            System.out.println("studnetLee와 studentLee2는 동일합니다.");
        } else  System.out.println("studnetLee와 studentLee2는 동일하지 않습니다.");

        // 동일인이지만 인스턴스의 주소가 다른 경우 비교
        if(studentLee == studentWoo) { // == 기호로 비교
            System.out.println("studnetLee와 StudentWoo 의 주소는 같습니다.");
        } else System.out.println("studnetLee와 StudentWoo 의 주소는 다릅니다.");

        if(studentLee.equals(studentWoo)) { //equeal로 비교
            System.out.println("studnetLee와 StudentWoo 동일합니다.");
        } else  System.out.println("studnetLee와 StudentWoo 동일하지 않습니다.");

        System.out.println("studentLee의 hashCode : "+studentLee.hashCode());
        System.out.println("studentWoo hashCode : "+studentWoo.hashCode());

        System.out.println("studentLee의 실제 주소값 : "+System.identityHashCode(studentLee));
        System.out.println("studentWoo 실제 주소값 : "+System.identityHashCode(studentWoo)); // System에서 관리하는 고유값, 재정의 불가능 아이덴티티(수정불가)

    }
}
