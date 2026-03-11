package edu.unisabana.dyas.patterns.utils;
import edu.unisabana.dyas.patterns.utils.AudioPlayer;

public class AdvancedAudioPlayerAdapter implements AudioPlayer {
    private AdvancedAudioPlayer advancedAudioPlayer;

    public AdvancedAudioPlayerAdapter(AdvancedAudioPlayer advancedAudioPlayer) {
        this.advancedAudioPlayer = advancedAudioPlayer;
    }

    @Override
    public void play(String format, String fileName) {
        if ("mp4".equals(format)) {
            advancedAudioPlayer.playMp4(fileName);
        } else if ("vlc".equals(format)) {
            advancedAudioPlayer.playVlc(fileName);
        }
    }

    @Override
    public void stop() {
        advancedAudioPlayer.stop();
    }
}
