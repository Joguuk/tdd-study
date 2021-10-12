package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class ValidationUtilsTest {

    @DisplayName("숫자_1_9_검증")
    @ParameterizedTest
    @ValueSource(ints = {0,1,2,3,4,5,6,7,8,9})
    void 숫자_1_9_검증(int ballNo) {
        boolean result = ValidationUtils.validNo(ballNo);
        assertThat(result).isTrue();
    }
}
