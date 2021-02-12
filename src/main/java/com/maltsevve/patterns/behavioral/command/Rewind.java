package com.maltsevve.patterns.behavioral.command;

class Rewind implements Command {
    RemoteControl remoteControl;

    public Rewind(RemoteControl remoteControl) {
        this.remoteControl = remoteControl;
    }

    @Override
    public void execute() {
        remoteControl.rewind();
    }
}
