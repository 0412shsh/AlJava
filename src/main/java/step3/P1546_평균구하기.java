package step3;

import java.util.Scanner;

public class P1546_평균구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        long sum = 0;
        long max = 0;
        for (int i = 0; i < N; i++) {
            if(A[i]>max) max = A[i];
            sum += A[i];

            // 배열 사용하지 않고 바로 사용하기
            /*int temp = sc.nextInt();
            if(temp>max) max=temp;
            sum += temp;*/
        }

        System.out.println(sum*100.0/max/N); // .0은 더블형으로 자동 변경
    }
}
