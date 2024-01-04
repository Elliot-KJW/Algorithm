package org.code;

public class Sort {

    public int[] exchangeNonDecreasing(int n, int[] s) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (s[i] < s[j]) {
                    int temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
            }
        }
        return s;
    }
}

