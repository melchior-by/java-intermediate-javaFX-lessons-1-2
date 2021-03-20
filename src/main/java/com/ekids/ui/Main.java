package com.ekids.ui;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.InputStream;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Hello world Application");
        primaryStage.setWidth(800);
        primaryStage.setHeight(600);

        //добавление иконки приложения
        InputStream iconStream = getClass().getResourceAsStream("/images/icon.png");
        Image image = new Image(iconStream);
        primaryStage.getIcons().add(image);

        //добавление текста
        Label helloWorldLabel = new Label("Hello world!");
        helloWorldLabel.setAlignment(Pos.CENTER);
        Scene primaryScene = new Scene(helloWorldLabel);

        primaryStage.setScene(primaryScene);

        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}