package org.hmily.pattern.bowling_match.test;

import junit.framework.TestCase;
import org.hmily.pattern.bowling_match.role.Frame;
import org.hmily.pattern.bowling_match.role.Game;
import org.junit.Test;


public class TestFrame extends TestCase {

    public TestFrame(String name) {
        super(name);
    }

    @Test
    public void testScoreNoThrows(){
        Frame frame=new Frame();
        frame.add(5);
        assertEquals(5,frame.getScore());
    }



}