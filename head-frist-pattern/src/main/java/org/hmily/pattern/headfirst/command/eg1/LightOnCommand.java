package org.hmily.pattern.headfirst.command.eg1;

/**
 * Created by zyzhmily on 2018/8/17.
 */
public class LightOnCommand implements Command{

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
         light.on();
    }

    @Override
    public void undo() {

    }
}
