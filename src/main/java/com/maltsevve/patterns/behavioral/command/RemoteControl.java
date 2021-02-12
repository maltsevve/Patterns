package com.maltsevve.patterns.behavioral.command;

class RemoteControl {
    public void play() {
        System.out.println("Start video.");
    }

    public void stop() {
        System.out.println("Stop video.");
    }

    public void rewind() {
        System.out.println("Rewind video.");
    }

    public void fastForward() {
        System.out.println("Fast forward video.");
    }
}
