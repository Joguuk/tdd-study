package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BallTest {
    Ball com;

    @BeforeEach
    void setUp() {
        com = new Ball(1,4);
    }

    @Test
    @DisplayName("스트라이크 테스트")
    void strike() {
        BallStatus status = com.play(new Ball(1,4));
        assertThat(status).isEqualTo(BallStatus.STRIKE);
    }

    @Test
    @DisplayName("볼 테스트")
    void ball() {
        BallStatus status = com.play(new Ball(2,4));
        assertThat(status).isEqualTo(BallStatus.BALL);
    }

    @Test
    @DisplayName("낫싱 테스트")
    void nothing() {
        BallStatus status = com.play(new Ball(2,5));
        assertThat(status).isEqualTo(BallStatus.NOTHING);
    }
}
