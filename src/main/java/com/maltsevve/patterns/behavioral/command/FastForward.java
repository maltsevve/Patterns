package com.maltsevve.patterns.behavioral.command;

class FastForward implements Command{
    RemoteControl remoteControl;

    public FastForward(RemoteControl remoteControl) {
        this.remoteControl = remoteControl;
    }

    @Override
    public void execute() {
        remoteControl.fastForward();
    }
}
