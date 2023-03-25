package step3;

import java.util.Scanner;

public class P2018_연속된자연수의합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 1;
        int start_index = 1;
        int end_index = 1;
        int sum = 1;
         while(end_index != N) { // end_index는 입력한 N까지 가면 안됨
             if(sum == N) {
                 count++;
                 end_index++;
                 sum = sum+end_index;
             } else if(sum > N) {
                 sum = sum - start_index; // 기존에 있던 애를 빼주고
                 start_index++; // 확장
             } else { // sum < N
                 end_index++;
                 sum = sum+end_index;
             }
         }
        System.out.println("count ==>"+count);
    }
}
