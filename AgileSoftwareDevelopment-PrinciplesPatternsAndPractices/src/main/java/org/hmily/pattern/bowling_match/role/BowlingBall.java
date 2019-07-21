package org.hmily.pattern.bowling_match.role;

public class BowlingBall {


    private int score;

    public  int throwBall(int score){
         this.score+=score;
         return this.score;
    }

    public int getScore() {
        return score;
    }
}
