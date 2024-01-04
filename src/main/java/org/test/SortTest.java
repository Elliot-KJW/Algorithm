package org.test;

import static org.assertj.core.api.Assertions.assertThat;

import org.code.Sort;
import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;

public class SortTest {

    @DisplayName("비내림차순으로 정렬된 배열을 리턴한다.")
    @Test
    void testExchangeNonDecreasing() {
        Sort sort = new Sort();
        assertThat(sort.exchangeNonDecreasing(6, new int[]{10, 7, 11, 5, 13, 8})).isEqualTo(new int[]{5, 7, 8, 10, 11, 13});
    }
}
