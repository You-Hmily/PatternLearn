package org.hmily.pattern.graphic.state;

public class Context {

    private State state;

    public Context(State state) {
        this.state = state;
    }

    public void request(){
        state.handle();
    }
}
