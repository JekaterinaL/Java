package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Loo JavaFXis koristaja mäng.
 * 1. Ekraan (näiteks 500x500) on paksult ringe täis. Nii, et läbi ei näe.
 * 2. Ringile hiirega vastu minnes kaob ring ära.
 * 3. Ringide all on peidus sõnum (näiteks Labeliga), mida kasutaja lõpuks näeb.
 */
public class Koristaja extends Application {
    public void start(Stage primaryStage) throws Exception {
        Pane stack = new Pane();
        Scene scene = new Scene(stack, 500, 500);
        primaryStage.setScene(scene);

        Text text = new Text("Hea koristaja");
        text.setTranslateX(130);
        text.setTranslateY(250);
        Font myFont = new Font ("TimesRoman", 40);
        text.setFont(myFont);
        stack.getChildren().add(text);

        for (int i = 0; i <= 30; i++) {
            Circle circle = new Circle(80);
            circle.setFill(Color.RED);
            circle.setTranslateY(Math.random() * 500);
            circle.setTranslateX(Math.random() * 500);
            stack.getChildren().add(circle);
            circle.setOnMouseEntered(event -> {
                stack.getChildren().remove(circle);
            });
        }

        primaryStage.show();
    }
}
