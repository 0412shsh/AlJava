package doItJava_ch11;

class Point { // 원점을 의미하는 Point 클래스
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

class Circle implements Cloneable { // clone( ) 메서드 사용 준비 완료 ~! , 상수&abstract메서드가 없음 = markable 메서드
    Point point;
    int radius;

    public Circle(int x, int y, int radius) {
        this.radius = radius;
        point = new Point(x,y);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "point=" + point +
                ", radius=" + radius +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    } // Object의 재정의,, clone()메서드를 사용할 때 발생할 수 있는 오류를 예외처리함!
}

public class ObjectCloneTest {
    public static void main(String[] args) throws CloneNotSupportedException{
        Circle circle = new Circle(10,20,30);
        Circle copyCircle = (Circle)circle.clone(); // clone()메서드를 사용해 circle 인스턴스를 copyCircle에 복제함

        System.out.println(circle);
        System.out.println(copyCircle);
        System.out.println(System.identityHashCode(circle));
        System.out.println(System.identityHashCode(copyCircle));

    }
}
