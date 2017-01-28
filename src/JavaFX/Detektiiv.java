package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Tee JavaFXiga detektiivi mäng, kus kasutaja saab nähtamatuid ringe otsida.
 * 1. Ekraanil (näiteks 500x500) on suvalistes kohtades 3 ringi, mida näha ei ole.
 * 2. Hiirega ringile vastu minnes tuleb ring nähtavale.
 */
public class Detektiiv extends Application {
    public void start(Stage primaryStage) throws Exception {
        Pane stack = new Pane();
        Scene scene = new Scene(stack, 500, 500);
        primaryStage.setScene(scene);

        for (int i = 1; i <= 3; i++) {
            Circle circle = new Circle(80);
            circle.setFill(Color.TRANSPARENT);
            circle.setTranslateY(Math.random() * 500);
            circle.setTranslateX(Math.random() * 500);
            stack.getChildren().add(circle);
            circle.setOnMouseEntered(event -> {
                circle.setFill(Color.BLACK);
            });
        }

        primaryStage.show();
    }
}
