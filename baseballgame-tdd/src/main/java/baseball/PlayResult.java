package baseball;

public class PlayResult {
    private int strikeCnt;
    private int ballCnt ;

    public PlayResult() {
        this.strikeCnt = 0;
        this.ballCnt = 0;
    }

    public int getStrikeCnt() {
        return strikeCnt;
    }

    public int getBallCnt() {
        return ballCnt;
    }

    public void report(BallStatus status) {
        if (status.isStrike()) {
            strikeCnt++;
        }

        if (status.isBall()) {
            ballCnt++;
        }
    }
}
