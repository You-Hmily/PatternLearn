package org.hmily.pattern.command_and_active_object.active_object;

import org.hmily.pattern.command_and_active_object.command.Command;

import java.util.LinkedList;

public class ActiveOjectEngine {

    LinkedList itsCommands=new LinkedList();


    public void addCommand(Command command){
        itsCommands.add(command);
    }


    public void run(){
        while (!itsCommands.isEmpty()){
            Command command= (Command) itsCommands.getFirst();
            itsCommands.removeFirst();
            command.excuted();
        }
    }



}
