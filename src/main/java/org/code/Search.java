package org.code;

public class Search {
    public static int sequentialSearch(int[] numbers, int x) {
        int answer = 0;
        // 배열의 모든 원소를 순차적으로 검색한 후
        for(int i = 0; i < numbers.length; i++) {
            // 해당 원소가 있는 위치를 answer에 저장한다.
            if(numbers[i] == x) answer = i;
        }
        return answer;
    }
}
