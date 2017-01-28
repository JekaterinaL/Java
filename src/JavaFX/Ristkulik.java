package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * Küsi kasutajalt alguskordinaadid ja laius-kõrgus ning joonista talle ristkülik.
 * Küsi kasutajalt sisendit kuidas soovid, pealselt, et teed seda JavaFXis.
 */
public class Ristkulik extends Application {
    public void start(Stage primaryStage) throws Exception {
        GridPane pane = new GridPane();
        Scene scene = new Scene(pane, 500, 500);
        primaryStage.setScene(scene);

        TextField x = new TextField();
        x.setPromptText("x, 0 - 500");
        TextField y = new TextField();
        y.setPromptText("y, 0 - 500");
        TextField a = new TextField();
        a.setPromptText("a, 0 - 500");
        TextField b = new TextField();
        b.setPromptText("b, 0 - 500");

        Button next = new Button("Next");

        pane.add(x, 1, 0);
        pane.add(y, 1, 1);
        pane.add(a, 1, 2);
        pane.add(b, 1, 3);
        pane.add(next, 1, 4);

        primaryStage.show();

        next.setOnAction(event -> {
            int px = Integer.parseInt(x.getText());
            int py = Integer.parseInt(y.getText());
            int pa = Integer.parseInt(a.getText());
            int pb = Integer.parseInt(b.getText());
            Rectangle rectangle = new Rectangle(px, py, pa, pb);
            Pane rectanglePane = new Pane();
            Scene rectangleScene = new Scene(rectanglePane, 500, 500);
            rectanglePane.getChildren().add(rectangle);
            primaryStage.setScene(rectangleScene);

        });
    }
}
