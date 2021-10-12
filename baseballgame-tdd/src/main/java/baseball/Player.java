package baseball;

public class Player {
    public void launchBaseballGame() {
        boolean isReplay = true;
        while(isReplay) {
            isReplay = gameStart();
        }
    }

    private boolean gameStart() {
        return false;
    }
}
