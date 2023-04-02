package doItJava;

public class StringEquals {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1 == str2); // 두 인스턴스의 주소값이 같은지 비교  false
        System.out.println(str1.equals(str2)); // String클래스의 equals를 사용. 두 인스턴스의 문자열 값이 같은지 비교 true

        Integer i1 = new Integer(100);
        Integer i2 = new Integer(100);

        System.out.println(i1==i2); // false
        System.out.println(i1.equals(i2));  // true
    }
}
