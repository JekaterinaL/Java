package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 * Küsi kasutajalt alguse ja lõpu x-y kordinaadid ning joonista talle joon.
 * Akna võime limiteerida 500x500 piksli peale.
 * Küsi kasutajalt sisendit kuidas soovid, pealselt, et teed seda JavaFXis.
 */
public class Joon extends Application {
    public void start (Stage primaryStage) throws Exception {
        GridPane pane = new GridPane();
        Scene scene = new Scene(pane, 500, 500);
        primaryStage.setScene(scene);

        TextField x1 = new TextField();
        x1.setPromptText("x1, 0 - 500");
        TextField y1 = new TextField();
        y1.setPromptText("y1, 0 - 500");
        TextField x2 = new TextField();
        x2.setPromptText("x2, 0 - 500");
        TextField y2 = new TextField();
        y2.setPromptText("y2, 0 - 500");

        Button next = new Button("Next");

        pane.add(x1, 1, 0);
        pane.add(y1, 1, 1);
        pane.add(x2, 1, 2);
        pane.add(y2, 1, 3);
        pane.add(next, 1, 4);

        primaryStage.show();

        next.setOnAction( event -> {
            int px1 = Integer.parseInt(x1.getText());
            int py1 = Integer.parseInt(y1.getText());
            int px2 = Integer.parseInt(x2.getText());
            int py2 = Integer.parseInt(y2.getText());
            Line line = new Line(px1, py1, px2, py2);
            Pane linePane = new Pane();
            Scene lineScene = new Scene(linePane, 500, 500);
            linePane.getChildren().add(line);
            primaryStage.setScene(lineScene);

        });
    }
}
