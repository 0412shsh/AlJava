package JavaStudy;

class A {
    private int[] arr = new int[3]; // 3칸을 가질 수 있음
    A(){
        arr[0] = 0;
        arr[1] = 10;
        arr[2] = 20;
    }
    public void z(int first, int second){
        try {
            System.out.println(arr[first] / arr[second]); // arr[10] arr[1] ==> 존재하지 않은 인덱스의 값을 호출하는 중 ==> 자바에서 허용하지 않음
        } catch(ArithmeticException e){
            // System.out.println(e.getMessage());
            //e.printStackTrace();
            System.out.println("ArithmeticException");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch (Exception e) {
            System.out.println("Exception");
        } finally { // 언제나 실행 !
            System.out.println("finally");
        }
    }
}
public class ExceptionDemo1 {
    public static void main(String[] args) {
        A a = new A(); // A클래스를 인스턴스화하여 z 메서드 호출
        a.z(10,1); // ArrayIndexOutOfBoundsException
        a.z(1,0); // ArithmeticException
        a.z(2,1); // 정상

    }
}
