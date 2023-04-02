package JavaStudy;

import java.sql.Array;
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        String [] arrayObj = new String[2]; // 두칸
        arrayObj[0] = "one";
        arrayObj[1] = "two";
      //arrayObj[2] = "three"; // 오류가 발생한다.
        for (int i = 0; i < arrayObj.length; i++) { // 배열 ==> 'length' 사용
            System.out.println(arrayObj[i]);
        } // 배열은 배열개수를 알때 사용하기 용이함

        ArrayList<String> al = new ArrayList<String>(); // 몇개의 값을 담을 것인가 지정할 필요 X
        al.add("one"); // add 속성 어떠한 데이터타입을 수용할 수 있음, 인자가 Object타입으로 저장되어 있음 ==> 현재 Object타입 !!
        al.add("two");
        al.add("three");
        for (int i = 0; i < al.size(); i++) { // arrayList ==> 'size'  사용
            //String value = al.get(i); ==> Object를 String타입의 value에 저장하려고 하기에 에러 발생 !!
            //String value = (String) al.get(i);// String 타입으로 형변환을 해줘야 value안에 담기 가능, 원래의 데이터타입으로 형변환!!
            String value = al.get(i);// String 타입으로 형변환을 해줘야 value안에 담기 가능, 원래의 데이터타입으로 형변환!!
            System.out.println(value); // arrayList참조변수.get(i)를 통해 값 가져온다.
        } // 타입의 안정성이 떨어짐 !!! ㅠㅡㅠ


        // al이라는 ArrayList에 추가(add) 되는 값이 String 타입이라는 것을 제네릭을 통해서 지정 !
        // 따라서 get을 통해 가져온 값을 (String) 형변환을 강제로 해주지 않아도 된다.
        // 내부적으로 get을 통해 가져온 값의 타입이 Object가 아닌 String이라고 명시



    }
}
