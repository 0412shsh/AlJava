package doItJava_ch12;

public class GenericPrinter<T extends Material> {
    private T material; // T자료형으로 선언한 변수

    public T getMaterial() {
        return material;
    } // T 자료형 변수 material을 반환하는 제네릭 메서드

    public void setMaterial(T material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return material.toString();
    }

    public void printing(){
        material.doPrinting(); // 상위 클래스 Material의 메서드 호출
    }
}
