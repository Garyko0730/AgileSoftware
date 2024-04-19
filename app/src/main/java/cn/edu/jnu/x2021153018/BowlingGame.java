package cn.edu.jnu.x2021153018;
public class BowlingGame {
    int pins[]=new int[21];
    int currentPinIndex=0;
    public void roll(int pin) {
        pins[currentPinIndex++]=pin;
    }

    public int score() {
        int totalScore=0;
        for(int scoreIndex=0;scoreIndex<pins.length;scoreIndex++)
        {
            totalScore+=pins[scoreIndex];
            //如果是一个补中，就把下下个球的分数也计入当前轮
            if(scoreIndex<19){
                 if(10==pins[scoreIndex]+pins[scoreIndex+1])
                {
                    totalScore+=pins[scoreIndex+2];//把下下个球加上去
                }
            }
        }
        return totalScore;
    }
}
