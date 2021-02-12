package com.maltsevve.patterns.behavioral.command;

class FilmViewing {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Viewer viewer = new Viewer(
                new Play(remoteControl),
                new Stop(remoteControl),
                new Rewind(remoteControl),
                new FastForward(remoteControl)
        );

        viewer.playVideo();
        viewer.fastForwardVideo();
        viewer.rewindVideo();
        viewer.stopVideo();
    }
}
