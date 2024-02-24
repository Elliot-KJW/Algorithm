package test;

import static org.assertj.core.api.Assertions.assertThat;

import org.code.Search;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SearchTest {
    @DisplayName("순차검색 테스트")
    @Test
    void testSequentialSearch() {
        assertThat(Search.sequentialSearch(new int[]{10, 7, 11, 5, 13, 8}, 7)).isEqualTo(1);
        System.out.println("테스트 완료");
    }

    @DisplayName("이분검색 테스트")
    @Test
    void testBinarySearch() {
        assertThat(Search.binarySearch(new int[]{10, 7, 11, 5, 13, 8}, 7)).isEqualTo(1);
        System.out.println("테스트 완료");
    }
}
