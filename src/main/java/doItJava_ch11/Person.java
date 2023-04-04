package doItJava_ch11;

public class Person {
    private String name;
    private int age;

    public Person(){} // 디폴트 생성자

    public Person(String name) {
        this.name = name; // 이름만 받는 생성자
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    } // 이름, 나이를 입력 받는 생성자

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
