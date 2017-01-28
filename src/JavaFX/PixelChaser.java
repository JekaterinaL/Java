package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * Joonista ekraanile hunnik ristkülikuid, suvalistel positsioonidel. Ühe korra kastile klikates
 * muutub ta 2x väiksemaks. Teist korda klikates kaob ta sootuks.
 */
public class PixelChaser extends Application {
    public void start (Stage primaryStage) throws Exception {
        Pane stack = new Pane();
        Scene scene = new Scene(stack, 500, 500);
        primaryStage.setScene(scene);

        for (int i = 0; i <= 15; i++) {
            Rectangle rectangle = new Rectangle(200, 200);
            rectangle.setFill(Color.RED);
            rectangle.setStroke(Color.grayRgb(3));
            rectangle.setTranslateY(Math.random() * 500);
            rectangle.setTranslateX(Math.random() * 500);
            stack.getChildren().add(rectangle);
            rectangle.setOnMouseClicked(event -> {
                if (rectangle.getWidth() == 200){
                    rectangle.setWidth(100);
                    rectangle.setHeight(100);
                } else {
                    stack.getChildren().remove(rectangle);
                }
            });
        }
        primaryStage.show();
    }
}
