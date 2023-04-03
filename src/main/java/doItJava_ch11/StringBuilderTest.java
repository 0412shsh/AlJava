package doItJava_ch11;

public class StringBuilderTest {
    public static void main(String[] args) {
        String javaStr = new String("Java");
        System.out.println("javaStr 문자열 주소 : "+System.identityHashCode(javaStr)); // 인스턴스가 처음 생성됐을 때 메모리 주소

        StringBuilder buffer = new StringBuilder(javaStr); // String으로부터 StringBuilder생성
        System.out.println("연산 전 buffer 메모리 주소 : "+System.identityHashCode(buffer));

        buffer.append(" and"); // 문자열 추가
        buffer.append(" android");
        buffer.append(" programming is fun!!! ");
        System.out.println("연산 후 buffer 메모리 주소 : "+System.identityHashCode(buffer));

        javaStr = buffer.toString(); // String 클래스로 반환
        System.out.println(javaStr);
        System.out.println("연결된 javaStr 문자열 주소 :"+System.identityHashCode(javaStr));
    }
}
