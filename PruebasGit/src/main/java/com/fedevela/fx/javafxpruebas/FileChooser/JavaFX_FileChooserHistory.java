package com.fedevela.fx.javafxpruebas.FileChooser;

import java.io.File;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 *
 * @author fvelazquez
 * http://java-buddy.blogspot.mx/2012/03/javafx-20-filechooser-set-initial.html
 */
public class JavaFX_FileChooserHistory extends Application {

    File file;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World!");

        final Label labelFile = new Label();

        Button btn = new Button();
        btn.setText("Open FileChooser'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FileChooser fileChooser = new FileChooser();

                //Open directory from existing directory
                if (file != null) {
                    File existDirectory = file.getParentFile();
                    fileChooser.setInitialDirectory(existDirectory);
                }

                //Set extension filter
                FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("AVI files (*.avi)", "*.avi");
                fileChooser.getExtensionFilters().add(extFilter);

                //Show open file dialog
                file = fileChooser.showOpenDialog(null);
                if( file != null ){
                    labelFile.setText(file.getPath());
                }
                
            }
        });

        VBox vBox = new VBox();
        vBox.getChildren().addAll(labelFile, btn);

        StackPane root = new StackPane();
        root.getChildren().add(vBox);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }
}
