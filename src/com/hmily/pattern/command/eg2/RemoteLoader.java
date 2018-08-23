package com.hmily.pattern.command.eg2;

import com.hmily.pattern.command.eg1.Light;
import com.hmily.pattern.command.eg1.LightOnCommand;

/**
 * Created by zyzhmily on 2018/8/23.
 * 测试
 */
public class RemoteLoader {

    public static void main(String[] args){

        RemoteControl remoteControl=new RemoteControl();

        Light livingRoomLight=new Light();

        LightOnCommand lightOnCommand=new LightOnCommand(livingRoomLight);

        remoteControl.onButtonWasPushed(0);

    }


}
