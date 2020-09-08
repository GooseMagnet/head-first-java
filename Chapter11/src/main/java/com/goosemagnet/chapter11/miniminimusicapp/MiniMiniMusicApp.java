package com.goosemagnet.chapter11.miniminimusicapp;

import javax.sound.midi.*;

import static java.lang.Thread.sleep;

public class MiniMiniMusicApp {

    public static void main(String[] args) {
        MiniMiniMusicApp mini = new MiniMiniMusicApp();
        mini.play();
    }

    public void play() {
        try {
            Sequencer player = MidiSystem.getSequencer();
            player.open();

            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();

            ShortMessage a = new ShortMessage();
            a.setMessage(ShortMessage.NOTE_ON, 1, 44, 100);
            MidiEvent noteOn = new MidiEvent(a, 1);
            track.add(noteOn);

            ShortMessage b = new ShortMessage();
            b.setMessage(ShortMessage.NOTE_OFF, 1, 44, 100);
            MidiEvent noteOff = new MidiEvent(b, 5);
            track.add(noteOff);

            player.setSequence(seq);
            player.start();
        } catch (MidiUnavailableException | InvalidMidiDataException ex) {
            ex.printStackTrace();
        }
    }
}
