package com.maltsevve.patterns.behavioral.command;

class Stop implements Command{
    RemoteControl remoteControl;

    public Stop(RemoteControl remoteControl) {
        this.remoteControl = remoteControl;
    }

    @Override
    public void execute() {
        remoteControl.stop();
    }
}
