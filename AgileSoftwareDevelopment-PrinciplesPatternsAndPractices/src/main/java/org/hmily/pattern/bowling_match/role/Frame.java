package org.hmily.pattern.bowling_match.role;

public class Frame {

    private int itsScore;

    public int getScore() {
        return itsScore;
    }

    public void add(int pins) {
        itsScore += pins;
    }


}
