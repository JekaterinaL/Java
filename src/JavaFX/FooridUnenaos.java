package JavaFX;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Joonista 500x500 ekraanile hunnikuga punaseid ringe.
 * Kui hiir ringile vastu läheb, muutub ring roheliseks.
 * Kordan - ring muudab värvi juba hiire puudutusest, mitte klikist.
 */
public class FooridUnenaos extends Application {
    public void start(Stage primaryStage) throws Exception {
        Pane stack = new Pane();
        Scene scene = new Scene(stack, 500, 500);
        primaryStage.setScene(scene);

        for (int i = 0; i <= 20; i++) {
            Circle circle = new Circle(80);
            circle.setFill(Color.RED);
            circle.setTranslateY(Math.random() * 500);
            circle.setTranslateX(Math.random() * 500);
            stack.getChildren().add(circle);
            circle.setOnMouseEntered(event -> {
                circle.setFill(Color.GREEN);
            });
        }

        primaryStage.show();
    }
}
