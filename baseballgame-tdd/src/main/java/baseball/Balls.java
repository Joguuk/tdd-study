package baseball;

import java.util.ArrayList;
import java.util.List;

public class Balls {
    private final List<Ball> balls;

    public Balls(List<Integer> ballNumbers) {
        balls = mapBalls(ballNumbers);
    }

    private List<Ball> mapBalls(List<Integer> ballNumbers) {
        List<Ball> balls = new ArrayList<>();
        for (int i = 0; i < ballNumbers.size(); i++) {
            balls.add(new Ball(i+1, ballNumbers.get(i)));
        }
        return balls;
    }

    public PlayResult play(List<Integer> balls) {
        Balls userBalls = new Balls(balls);     // 4,1,2
        PlayResult playResult = new PlayResult();

        for (Ball ball : this.balls) {  // 1,2,3,
            BallStatus status = userBalls.play(ball);
            playResult.report(status);
        }

        return playResult;
    }

    private BallStatus play(Ball ball) {
        return balls.stream()
                    .map(answer -> answer.play(ball))
                    .filter(ballStatus -> ballStatus.isBall() || ballStatus.isStrike())
                    .findFirst()
                    .orElse(BallStatus.NOTHING);
    }
}
