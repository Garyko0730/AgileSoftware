package cn.edu.jnu.x2021153018;
public class BowlingGame {
    int pins[]=new int[21];
    int currentPinIndex=0;
    public void roll(int pin) {
        pins[currentPinIndex++]=pin;
    }

    public int score() {
        int totalScore=0;
        int currentFrameScoreIndex=0;
        for(int currentFrame=0;currentFrame<10;currentFrame++)
        {
            totalScore+=pins[currentFrameScoreIndex];
            totalScore+=pins[currentFrameScoreIndex+1];

            if(isaStrike(currentFrameScoreIndex))
            {
                totalScore+=pins[currentFrameScoreIndex+2];
            }
            else if(isaSpare(currentFrameScoreIndex))
            {
                totalScore+=pins[currentFrameScoreIndex+2];
                currentFrameScoreIndex++;
            }
            else {
                currentFrameScoreIndex++;
            }
            currentFrameScoreIndex++;
        }
        return totalScore;
    }

    private boolean isaSpare(int scoreIndex) {
        return 10 == pins[scoreIndex] + pins[scoreIndex + 1];
    }
    private boolean isaStrike(int scoreIndex) {
        return 10 == pins[scoreIndex];
    }
}
