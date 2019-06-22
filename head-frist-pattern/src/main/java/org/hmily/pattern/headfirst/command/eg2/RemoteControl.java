package org.hmily.pattern.headfirst.command.eg2;

import com.hmily.pattern.command.eg1.Command;

/**
 * Created by zyzhmily on 2018/8/23.
 * 遥控器实现
 */
public class RemoteControl {

    Command[] onCommands;
    Command[] offCommads;

    public RemoteControl(){
        onCommands=new Command[7];
        offCommads=new Command[7];

        Command noCommand=new NoCommand();
        for (int i=0;i<7;i++){
            onCommands[i]=noCommand;
            offCommads[i]=noCommand;
        }

    }

    public void setCommand(int slot,Command onCommand,Command offCommand){
        onCommands[slot]=onCommand;
        offCommads[slot]=offCommand;
    }

    public void onButtonWasPushed(int slot){
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot){
        offCommads[slot].execute();
    }









}
