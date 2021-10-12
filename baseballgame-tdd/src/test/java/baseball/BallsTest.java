package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class BallsTest {
    @Test
    @DisplayName("3개의 숫자에 대한 2스트라이크 테스트")
    void 투스트라이크() {
        Balls comBalls = new Balls(Arrays.asList(1,2,3));
        PlayResult result = comBalls.play(Arrays.asList(1,2,4));

        assertThat(result.getBallCnt()).isEqualTo(0);
        assertThat(result.getStrikeCnt()).isEqualTo(2);
    }

    @Test
    @DisplayName("3개의 숫자에 대한 2볼 테스트")
    void 투볼() {
        Balls comBalls = new Balls(Arrays.asList(1,2,3));
        PlayResult result = comBalls.play(Arrays.asList(4,1,2));

        assertThat(result.getBallCnt()).isEqualTo(2);
        assertThat(result.getStrikeCnt()).isEqualTo(0);
    }

    @Test
    @DisplayName("3개의 숫자에 대한 낫싱 테스트")
    void nothing() {
        Balls comBalls = new Balls(Arrays.asList(1,2,3));
        PlayResult result = comBalls.play(Arrays.asList(4,5,6));
        assertThat(result.getBallCnt()).isEqualTo(0);
        assertThat(result.getStrikeCnt()).isEqualTo(0);
    }
}
