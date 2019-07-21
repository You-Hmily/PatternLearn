package org.hmily.pattern.bowling_match.test;

import junit.framework.TestCase;
import org.hmily.pattern.bowling_match.role.Game;
import org.junit.Test;


public class TestGame extends TestCase {

    public TestGame(String name) {
        super(name);
    }

    private Game g;

    public void setUp(){
        g=new Game();
    }

    @Test
    public void testTwoThrowsNoMark(){
        g.add(5);
        g.add(4);
        assertEquals(9,g.score());
    }

    @Test
    public void testFourThrowsNoMark(){
        g.add(5);
        g.add(4);
        g.add(7);
        g.add(2);
        assertEquals(18,g.score());
        assertEquals(9,g.scoreForFrame(1));
        assertEquals(18,g.scoreForFrame(2));
    }


    @Test
    public void testSimpleSpare(){
        g.add(3);
        g.add(7);
        g.add(3);
        assertEquals(13,g.scoreForFrame(1));
    }


    @Test
    public void testSimpleAfterSpare(){
        g.add(3);
        g.add(7);
        g.add(3);
        g.add(2);
        assertEquals(13,g.scoreForFrame(1));
    }

    @Test
    public void testSimpleFrameAfterSpare(){
        g.add(3);
        g.add(7);
        g.add(3);
        g.add(2);
        assertEquals(13,g.scoreForFrame(1));
        assertEquals(18,g.scoreForFrame(2));
        assertEquals(18,g.score());
    }


    public void testPerfectGame(){
        for(int i=0;i<12;i++){
            g.add(10);
        }
        assertEquals(300,g.score());
    }




}
