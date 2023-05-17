package org.academiadecodigo.bootcamp.oportunity;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class GameSounds {
    public static void GameSounds11(String filename) {
        try (InputStream in = GameSounds.class.getResourceAsStream(filename)) {
            if (in == null) {
                throw new IOException("Arquivo não encontrado: " + filename);
            }
            InputStream bufferedIn = new BufferedInputStream(in);
            try (AudioInputStream audioIn = AudioSystem.getAudioInputStream(bufferedIn)) {
                Clip clip = AudioSystem.getClip();
                clip.open(audioIn);
                clip.loop(10);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}