package com.proyect_app.view;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import java.io.File;
import java.net.MalformedURLException;

public class AnimationPanel extends JFXPanel {

    private MediaPlayer mediaPlayer;
    private MediaView mediaView;

    public AnimationPanel(String videoPath) {
        // Inicializar JavaFX en el contexto Swing
        Platform.runLater(() -> initFX(videoPath));
    }

    private void initFX(String videoPath) {
        configMediaPlayer(videoPath);
        mediaView = new MediaView(mediaPlayer);

        // Ajustar el tamaño del MediaView al tamaño del JFXPanel
        mediaView.setFitWidth(this.getWidth());
        mediaView.setFitHeight(this.getHeight());

        // Crear y configurar la escena de JavaFX
        Scene scene = new Scene(new javafx.scene.Group(mediaView));
        this.setScene(scene);
    }

    public void playVideo() {
        Platform.runLater(() -> {
            if (mediaPlayer != null) {
                mediaPlayer.play();
            }
        });
    }

    public void changeVideo(String newVideoPath) {
        Platform.runLater(() -> {
            if (mediaPlayer != null) {
                mediaPlayer.stop();
                mediaPlayer.dispose();
            }
            configMediaPlayer(newVideoPath);
            mediaPlayer.setOnReady(() -> {
                mediaView.setMediaPlayer(mediaPlayer);
                mediaPlayer.play();
            });
        });
    }

    private void configMediaPlayer(String videoPath) {
        try {
            String mediaUrl = new File(videoPath).toURI().toURL().toString();

            // Crear los componentes de JavaFX
            Media media = new Media(mediaUrl);
            mediaPlayer = new MediaPlayer(media);
            mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

}
