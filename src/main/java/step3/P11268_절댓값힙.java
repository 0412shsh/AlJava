package step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class P11268_절댓값힙 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        // 우선순위 큐 선언
        PriorityQueue<Integer> myQueue = new PriorityQueue<>((o1,o2)-> {
            // 우선순위 큐 - 정렬 기준 세우기
            int first_abs = Math.abs(o1); // 절대값 변환
            int second_abs = Math.abs(o2); // 절대값 변환
            if(first_abs == second_abs) { // 절대값이 같은 경우 음수 우선
                return o1 > o2 ? 1 : -1;
            }
            return first_abs - second_abs; // 절대값 작은 데이터 우선
        });

        for(int i = 0; i<N; i++) {
            int request = Integer.parseInt(br.readLine());
            if(request == 0) {
                if (myQueue.isEmpty()) {
                    System.out.println("0");
                } else {
                    System.out.println(myQueue.poll());
                }
            }else {
                    myQueue.add(request);
                }
            }
        }

    }

