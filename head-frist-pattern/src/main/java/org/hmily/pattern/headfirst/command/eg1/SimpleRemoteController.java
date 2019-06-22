package org.hmily.pattern.headfirst.command.eg1;

/**
 * Created by zyzhmily on 2018/8/17.
 */
public class SimpleRemoteController {

    Command slot;

    public SimpleRemoteController() {
    }

    public void setCommand(Command command){
        slot=command;
    }

    public void buttonWasPressed(){
        slot.execute();
    }

}
