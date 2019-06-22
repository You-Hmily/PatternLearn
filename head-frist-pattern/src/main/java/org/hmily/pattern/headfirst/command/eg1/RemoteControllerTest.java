package org.hmily.pattern.headfirst.command.eg1;

/**
 * Created by zyzhmily on 2018/8/17.
 */
public class RemoteControllerTest {

    public static void  main(String[] args){

        SimpleRemoteController remote=new SimpleRemoteController();
        Light light=new Light();
        LightOnCommand lightOnCommand=new LightOnCommand(light);
        remote.setCommand(lightOnCommand);
        remote.buttonWasPressed();

    }



}
