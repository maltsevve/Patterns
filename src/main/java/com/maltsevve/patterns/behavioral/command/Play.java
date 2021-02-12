package com.maltsevve.patterns.behavioral.command;

class Play implements Command{
    RemoteControl remoteControl;

    public Play(RemoteControl remoteControl) {
        this.remoteControl = remoteControl;
    }

    @Override
    public void execute() {
        remoteControl.play();
    }
}
