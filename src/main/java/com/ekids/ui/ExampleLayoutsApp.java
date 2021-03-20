package com.ekids.ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.InputStream;
import java.net.URL;

public class ExampleLayoutsApp extends Application {


    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        URL xmlUrl = getClass().getResource("/fxml/exampleLayouts.fxml");
        loader.setLocation(xmlUrl);
        Parent root = loader.load();

        primaryStage.setScene(new Scene(root, 1366, 768));
        primaryStage.show();
    }

    public void start1(Stage primaryStage) throws Exception {
        primaryStage.setWidth(1366);
        primaryStage.setHeight(768);

        HBox hbox = new HBox();
        hbox.setSpacing(10);
        hbox.setPadding(new Insets(10, 10, 10, 10));
        Button btn1 = new Button("1");
        Button btn2 = new Button("2");
        Button btn3 = new Button("3");
        Button btn4 = new Button("4");
        hbox.getChildren().addAll(btn1, btn2, btn3, btn4);

        VBox vbox = new VBox();
        vbox.setPadding(new Insets(100, 10, 10, 10));
        vbox.setSpacing(10);
        Button btn5 = new Button("5");
        Button btn6 = new Button("6");
        Button btn7 = new Button("7");
        Button btn8 = new Button("8");
        vbox.getChildren().addAll(btn5, btn6, btn7, btn8);

        AnchorPane anchorPane = new AnchorPane(hbox, vbox);

        StackPane stackPane = new StackPane();
        Image image = new Image(getClass().getResourceAsStream("/images/background.jpg"));
        ImageView imageView = new ImageView(image);
        Button btn = new Button("Click Me!");
        stackPane.getChildren().addAll(anchorPane, imageView, btn);

        Scene primaryScene = new Scene(stackPane);

        primaryStage.setScene(primaryScene);

        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
