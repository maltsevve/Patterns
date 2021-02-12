package com.maltsevve.patterns.behavioral.command;

class Viewer {
    Command play;
    Command stop;
    Command rewind;
    Command fastForward;

    public Viewer(Command play, Command stop, Command rewind, Command fastForward) {
        this.play = play;
        this.stop = stop;
        this.rewind = rewind;
        this.fastForward = fastForward;
    }

    public void playVideo() {
        play.execute();
    }

    public void stopVideo() {
        stop.execute();
    }

    public void rewindVideo() {
        rewind.execute();
    }

    public void fastForwardVideo() {
        fastForward.execute();
    }
}
