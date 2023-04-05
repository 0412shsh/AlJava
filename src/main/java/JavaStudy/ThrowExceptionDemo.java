package JavaStudy;
class B {
    void run(){

    }
}
class C {
    void run(){
        B b = new B();
        b.run();
    }
}
public class ThrowExceptionDemo {
    public static void main(String[] args) {
        C c = new C(); // C클래스를 c로 인스턴스화
        c.run();
    }
}
