package com.proyect_app.view;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.net.MalformedURLException;

public class Video {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Video Player");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 600);
            frame.setLayout(null); // Usar layout absoluto para posicionar manualmente

            JPanel videoPanel = new JPanel();
            videoPanel.setLayout(new BorderLayout());
            videoPanel.setBounds(50, 50, 640, 480); // Ajusta estos valores según tus necesidades
            frame.add(videoPanel);

            JFXPanel fxPanel = new JFXPanel();
            fxPanel.setBounds(0, 0, 640, 480); // Tamaño del video dentro del JPanel
            videoPanel.add(fxPanel, BorderLayout.CENTER);

            frame.setVisible(true);

            Platform.runLater(() -> initFX(fxPanel));
        });
    }

    private static void initFX(JFXPanel fxPanel) {
        String videoPath = null;
        try {
            videoPath = new File("resources/Cubo Flotando.mp4").toURI().toURL().toString();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        if (videoPath == null) {
            System.err.println("Video not found.");
            return;
        }

        Media media = new Media(videoPath);
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        MediaView mediaView = new MediaView(mediaPlayer);

        // Ajusta el tamaño del MediaView al tamaño del fxPanel
        mediaView.setFitWidth(640);
        mediaView.setFitHeight(480);

        Scene scene = new Scene(new javafx.scene.Group(mediaView));
        fxPanel.setScene(scene);
        mediaPlayer.play();
    }
}
