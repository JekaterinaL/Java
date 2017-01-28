package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 * Küsi kasutajalt x, y kordinaadid ja raadius ning joonista talle ring.
 * Küsi kasutajalt sisendit kuidas soovid, pealselt, et teed seda JavaFXis.
 */
public class Ring extends Application {
    public void start (Stage primaryStage) throws Exception {
        GridPane pane = new GridPane();
        Scene scene = new Scene(pane, 500, 500);
        primaryStage.setScene(scene);

        TextField x = new TextField();
        x.setPromptText("x, 0 - 500");
        TextField y = new TextField();
        y.setPromptText("y, 0 - 500");
        TextField r = new TextField();
        r.setPromptText("r, 0 - 500");

        Button next = new Button("Next");

        pane.add(x, 1, 0);
        pane.add(y, 1, 1);
        pane.add(r, 1, 2);
        pane.add(next, 1, 3);

        primaryStage.show();

        next.setOnAction( event -> {
            int px = Integer.parseInt(x.getText());
            int py = Integer.parseInt(y.getText());
            int pr = Integer.parseInt(r.getText());
            Circle circle = new Circle(px, py, pr);
            Pane circlePane = new Pane();
            Scene circleScene = new Scene(circlePane, 500, 500);
            circlePane.getChildren().add(circle);
            primaryStage.setScene(circleScene);

        });
    }
}
