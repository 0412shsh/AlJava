package step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11659_구간합구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = // 한줄로 데이터 받아오기
                new StringTokenizer(bufferedReader.readLine()); // 예제 첫번째 줄을 읽었다.
        int suNo = Integer.parseInt(stringTokenizer.nextToken());
        int quiqNo = Integer.parseInt(stringTokenizer.nextToken());
        // 합배열 선언
        long [] S = new long[suNo+1]; // long으로 선언하는 이유 : 간혹 답이 잘못나올수 있기 때문에 안전하게 long형 ㄱㄱ
        // 합배열 저장
    stringTokenizer =
                new StringTokenizer(bufferedReader.readLine());
        for (int i = 1; i <= suNo; i++) {
            S[i] = S[i-1]+Integer.parseInt(stringTokenizer.nextToken());
        }
        for (int q = 0; q < quiqNo; q++) {
            stringTokenizer =
                    new StringTokenizer(bufferedReader.readLine());
            int i =Integer.parseInt(stringTokenizer.nextToken());
            int j =Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(S[j]-S[i-1]);
        }

    }
}
