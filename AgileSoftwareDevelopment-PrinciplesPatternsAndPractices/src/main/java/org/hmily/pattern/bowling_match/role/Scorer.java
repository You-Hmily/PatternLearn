package org.hmily.pattern.bowling_match.role;

public class Scorer {

    private int ball;
    private int[] itsThrows=new int[21];
    private int itsCurrentThrow=0;

    public void addThrow(int pins){
        itsThrows[itsCurrentThrow++]=pins;
    }

    public int scoreForFrame(int theFrame) {
        int score=0;
        ball=0;
        for(int currentFrame=0;currentFrame<theFrame;currentFrame++){
            if (strike()){
                score+=10+nextTwoBallsForStrike();
                ball++;
            }else if (spare()){
                score += 10+nextBallForSpare();
                ball+=2;
            }else {
                score+= twoBallsInFraame();
                ball+=2;
            }
        }
        return score;
    }

    private int nextBallForSpare() {
        return itsThrows[ball+2];
    }

    private int nextTwoBallsForStrike() {
        return itsThrows[ball+1]+itsThrows[ball+2];
    }

    private boolean strike(){
        return itsThrows[ball]==10;
    }

    private int twoBallsInFraame() {
        return itsThrows[ball]+itsThrows[ball+1];
    }

    private int nextBall() {
        return itsThrows[ball];
    }

    private boolean spare() {
        return itsThrows[ball]+itsThrows[ball+1]==10;
    }

}
