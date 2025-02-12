package com.goosemagnet.chapter11.miniminimusicapp;

import javax.sound.midi.*;
import java.util.Scanner;

public class MiniMusicCmdLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MiniMusicCmdLine mini = new MiniMusicCmdLine();
        while (true) {
            System.out.print("Enter an instrument [0-127]: ");
            int instrument = scanner.nextInt();

            System.out.print("Enter a note [0-127]: ");
            int note = scanner.nextInt();
            mini.play(instrument, note);
        }
    }

    public void play(int instrument, int note) {
        try {
            Sequencer player = MidiSystem.getSequencer();
            player.open();
            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();

            MidiEvent event = null;

            ShortMessage first = new ShortMessage();
            first.setMessage(192, 1, instrument, 0);
            MidiEvent changeInstrument = new MidiEvent(first, 1);
            track.add(changeInstrument);

            ShortMessage a = new ShortMessage();
            a.setMessage(144, 1, note, 127);
            MidiEvent noteOn = new MidiEvent(a, 1);
            track.add(noteOn);

            ShortMessage b = new ShortMessage();
            b.setMessage(128,1,note,100);
            MidiEvent noteOff = new MidiEvent(b, 16);
            track.add(noteOff);

            player.setSequence(seq);
            player.start();
            System.out.println();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}