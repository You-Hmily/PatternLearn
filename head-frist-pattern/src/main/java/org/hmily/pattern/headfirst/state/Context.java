package org.hmily.pattern.headfirst.state;

/**
 * Created by zyzhmily on 2018/8/27.
 */
public class Context {

    private State state;

    public Context(State state) {
        this.state = state;
    }

    public void stateHandle(){
        this.state.handle();
    }
}
