package org.code;
import java.util.Arrays;

public class Search {
    // 순차검색 알고리즘
    public static int sequentialSearch(int[] numbers, int x) {
        int answer = 0;
        // 배열의 모든 원소를 순차적으로 검색한 후
        for(int i = 0; i < numbers.length; i++) {
            // 해당 원소가 있는 위치를 answer에 저장한다.
            if(numbers[i] == x) answer = i;
        }
        return answer;
    }

    // 이분검색 알고리즘
    public static int binarySearch(int[] numbers, int x) {
        int answer = 0;
        int begin = 0, end = numbers.length - 1;

        // 정렬이 되어 있지 않으면 사용할 수 없다.
        Arrays.sort(numbers);

        while(begin <= end) {
            int mid = (begin+end) / 2;

            if(numbers[mid] == x) {
                answer = mid;
                break;
            }else if(numbers[mid] > x) {
                end = mid - 1;
            } else {
                begin = mid + 1;
            }
        }

        return answer;
    }
}
