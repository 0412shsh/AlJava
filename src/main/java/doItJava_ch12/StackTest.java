package doItJava_ch12;

import java.util.ArrayList;

class MyStack {
    private ArrayList<String> arrayStack = new ArrayList<>();

    public void push(String data){
        arrayStack.add(data); //스택의 맨 뒤에 요소 추가
    }

    public String pop(){  // 스택의 맨 뒤에서 요소 꺼냄
        int len = arrayStack.size(); // 제일 나중에 있는 걸 꺼내기 위함
        if(len == 0) {
            System.out.println("스택이 비었습니다.");
            return null;
        }
        return(arrayStack.remove(len-1)); // 맨 뒤에 있는 자료 반환하고 배열에서 제거
    }
}


public class StackTest {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
            stack.push("A");
            stack.push("B");
            stack.push("C");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
